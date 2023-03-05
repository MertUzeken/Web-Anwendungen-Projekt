const addRowButton = document.querySelector('#add-row');
const addColButton = document.querySelector('#add-col');
const deleteRowButton = document.querySelector('#delete-row');
const deleteColButton = document.querySelector('#delete-col');
const table = document.querySelector('#matrix');

// Add Row
addRowButton.addEventListener('click', () => {
  if (table.rows.length >= 2) {
    const newRow = table.insertRow(-1);
    const numOfCols = table.rows[0].cells.length;

    for (let i = 0; i < numOfCols; i++) {
      if (i === 0) {
        newRow.insertCell(i).innerHTML = "<td><input type='checkbox' class='check'><input type='text' placeholder='Track 1' class='trackText'></td>"
      }

      else if (i === 1) {
        newRow.insertCell(i).innerHTML = "<td><select class='instrument'><option value='piano'>Piano</option><option value='guitar'>Guitar</option><option value'drums'>Drums</option><option value='bass'>Bass</option><option value='saxophone'>Saxophone</option></select></td>"
      }

      else if (i === 2) {
        newRow.insertCell(i).innerHTML = "<td><select class='note'><option value='c'>C</option><option value='d'>D</option><option value='e'>E</option><option value='f'>F</option><option value='g'>G</option><option value='a'>A</option><option value='h'>H</option></select></td>"
      }

      else {
        newRow.insertCell(i).style.backgroundColor = "white";
      }
    }
  }
});

// Add Column
addColButton.addEventListener('click', () => {
  if (table.rows.length >= 2 && table.rows[0].cells.length >= 3) {
    const rows = document.querySelectorAll('tr');

    rows.forEach((row, index) => {
      const newCell = row.insertCell(-1);
      newCell.style.backgroundColor = "white";
    });
  }
});

// Delete Row
deleteRowButton.addEventListener('click', () => {
  if (table.rows.length > 2) {
    const lastRow = table.rows.length - 1;
    table.deleteRow(lastRow);
  }
});

// Delete Column
deleteColButton.addEventListener('click', () => {
  if (table.rows.length >= 2 && table.rows[0].cells.length > 3) {
    const rows = document.querySelectorAll('tr');

    rows.forEach(row => {
      const lastCell = row.cells.length - 1;

      if (row.cells.length > 3) {
        row.deleteCell(lastCell);
      }
    });
  }
});
