const playButton = document.querySelector('#play-btn');

playButton.addEventListener('click', () => {
  const table = document.querySelector('#matrix'); 
  var data = {
    projectName: document.getElementById("projectName").value,
    authorName: document.getElementById("authorName").value,
  };
  for (var i = 1, row; row=table.rows[i];i++){
    
    var noteRow =[];
    var a = false;

    for (var j = 0, cell; cell=row.cells[j];j++){
      if (j>=3){
        noteRow.push(1); //ToDO of Mared the 1 else 0
      }
    }
    if (document.getElementsByClassName('check')[i-1].checked){
      a = true;
    }
    
    data["track"+i] = {
      active: a,
      trackName: document.getElementsByClassName('trackText')[i-1].value,
      instrument: document.getElementsByClassName('instrument')[i-1].value,
      note:document.getElementsByClassName('note')[i-1].value,
      toneMatrix: noteRow
    };
  }

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

