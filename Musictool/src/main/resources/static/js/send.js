const playButton = document.querySelector('#play-btn');

playButton.addEventListener('click', () => {
  const table = document.querySelector('#matrix'); 


  const soundList = [];

  const tracks = [];
  const track = []
  for (var i = 1, row; row=table.rows[i];i++){
    for (var j = 0, cell; cell=row.cells[j];j++){
      if (j === 0) {
        track.push("active:" + document.getElementsByClassName('check')[i-1].value);
      }
      else if (j === 1){
        track.push("trackName:" + document.getElementsByClassName('trackText')[i-1].value);
      }
      else if (j === 2){
        track.push("IntrumentName:" + document.getElementsByClassName('instrument')[i-1].value);
      }
      else if (j>=3){
        soundList.push(""); //ToDO of Mared the 1 else 0
      }
    }
    track.push(soundList);
  }

  const data = {
    projectName: document.getElementById("projectName").value,
    autorName: document.getElementById("projectName").value,
    trackInfo: track,
  };
  fetch('/project', {
    method: 'POST',
    headers: {
      'Content-Type': 'application/json'
    },
    body: JSON.stringify(data)
  })
  .then(response => response.json())
  .then(json => console.log(json))
  .catch(error => console.error(error));
});

