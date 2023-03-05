//Creats JSON and send it to backend

const playButton = document.querySelector('#send-btn');

playButton.addEventListener('click', () => {
  const table = document.querySelector('#matrix'); 
  var data = {
    //first 2 Elements in JSON
    projectName: document.getElementById("projectName").value,
    authorName: document.getElementById("authorName").value,
  };
  //Builds JSON TRACK Child
  for (var i = 1, row; row=table.rows[i];i++){
    
    var noteRow =[];
    var a = false;

    for (var j = 0, cell; cell=row.cells[j];j++){
      if (j>=3){
        if (cell.style.backgroundColor === "white"){
          noteRow.push(0)
        }else {
          noteRow.push(1);
        }
        
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
  //Send to Backend
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

