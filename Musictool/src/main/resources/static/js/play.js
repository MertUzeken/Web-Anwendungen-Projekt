// create a new AudioContext object
const audioContext = new AudioContext();

// a two-dimensional array of music file URLs
const musicFiles = [
  ["sound/test.mp3", "sound/test.mp3", "../sound/test.mp3"],
  ["sound/test.wav", "sound/test.mp3", ""],
  ["sound/test.mp3", "sound/test.mp3", "test.mp3", "sound/test.mp3"]
];

// a two-dimensional array to hold all the audio buffers
const buffers = [];

// load all the music files and decode them into audio buffers
Promise.all(
  musicFiles.map((soundGroup) =>
    Promise.all(
      soundGroup.map((url) =>
        fetch(url)
          .then((response) => response.arrayBuffer())
          .then((arrayBuffer) => audioContext.decodeAudioData(arrayBuffer))
      )
    ).then((decodedBuffers) => buffers.push(decodedBuffers))
  )
).then(() => {
  // create a new GainNode to control the overall volume
  const gainNode = audioContext.createGain();
  gainNode.connect(audioContext.destination);

  // create a new AudioBufferSourceNode for each sound group
  const sources = [];

  for (const soundGroup of buffers) {
    const groupSource = audioContext.createBufferSource();
    const groupGainNode = audioContext.createGain();

    // connect the group source to the group gain node
    groupSource.connect(groupGainNode);

    // connect the group gain node to the overall gain node
    groupGainNode.connect(gainNode);

    // add the group source to the `sources` array
    sources.push(groupSource);

    // concatenate all the buffers in the sound group into one big buffer
    const concatenatedBuffer = audioContext.createBuffer(
      2, // stereo
      soundGroup.reduce((totalLength, buffer) => totalLength + buffer.length, 0),
      audioContext.sampleRate
    );

    let offset = 0;

    for (const buffer of soundGroup) {
      concatenatedBuffer.getChannelData(0).set(buffer.getChannelData(0), offset);
      concatenatedBuffer.getChannelData(1).set(buffer.getChannelData(1), offset);
      offset += buffer.length;
    }

    // set the group source's buffer to the concatenated buffer
    groupSource.buffer = concatenatedBuffer;
  }

  // play the sound groups in parallel and one after the other
  for (let i = 0; i < sources.length; i++) {
    sources[i].start();

    if (i < sources.length - 1) {
      sources[i].addEventListener("ended", () => sources[i + 1].start());
    }
  }
});
