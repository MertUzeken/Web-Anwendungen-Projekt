//NOT in USE Script is directly in project HTML

var audioFiles = [[${musicPaths}]];
var numRows = audioFiles.length;
var numCols = audioFiles[0].length;
var audioElements = [];
var currentColumn = 0;
var playing = false;

function createAudioElements() {
  for (var i = 0; i < numRows; i++) {
    var audio = new Audio(audioFiles[i][currentColumn]);
    audio.addEventListener('ended', onAudioEnded);
    audioElements.push(audio);
  }
}

function onAudioEnded() {
  var allEnded = true;
  for (var i = 0; i < numRows; i++) {
    if (!audioElements[currentColumn * numRows + i].ended) {
      allEnded = false;
      break;
    }
  }
  if (allEnded) {
    currentColumn++;
    if (currentColumn < numCols) {
      createAudioElements();
      playCurrentColumn();
    } else {
      currentColumn = 0;
      playing = false;
    }
  }
}

function playCurrentColumn() {
  for (var i = 0; i < numRows; i++) {
    var audio = audioElements[currentColumn * numRows + i];
    audio.play();
    audio.playbackRate = parseFloat(document.getElementById("speedInput").value);
    audio.volume = parseFloat(document.getElementById("volumeInput").value);
  }
}

function play() {
  if (!playing) {
    createAudioElements();
    playCurrentColumn();
    playing = true;
  } else {
    pause();
    currentColumn = 0;
    createAudioElements();
    playCurrentColumn();
    playing = true;
  }
}

function pause() {
  for (var i = 0; i < audioElements.length; i++) {
    audioElements[i].pause();
  }
  playing = false;
}

function stop() {
  for (var i = 0; i < audioElements.length; i++) {
    audioElements[i].pause();
    audioElements[i].currentTime = 0;
  }
  currentColumn = 0;
  playing = false;
}

function setSpeed(speed) {
  for (var i = 0; i < audioElements.length; i++) {
    audioElements[i].playbackRate = parseFloat(speed);
  }
}

function setVolume(volume) {
  for (var i = 0; i < audioElements.length; i++) {
    audioElements[i].volume = parseFloat(volume);
  }
}

document.getElementById("playBtn").addEventListener("click", play);
document.getElementById("pauseBtn").addEventListener("click", pause);
document.getElementById("stopBtn").addEventListener("click", stop);
document.getElementById("speedInput").addEventListener("input", function() {
  setSpeed(this.value);
});
document.getElementById("volumeInput").addEventListener("input", function() {
  setVolume(this.value);
});
