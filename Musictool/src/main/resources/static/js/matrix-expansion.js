const addRowButton = document.querySelector('#add-row');
const addColButton = document.querySelector('#add-col');
const deleteRowButton = document.querySelector('#delete-row');
const deleteColButton = document.querySelector('#delete-col');
const deleteCurrentCol = document.querySelector('#delete-current-col');
const table = document.querySelector('#matrix');

// Add Row
addRowButton.addEventListener('click', () => {
  if (table.rows.length >= 2) {
    const newRow = table.insertRow(-1);
    const numOfCols = table.rows[0].cells.length;

    for (let i = 0; i < numOfCols; i++) {
      newRow.insertCell(i);
    }
  }
});

// Add Column
addColButton.addEventListener('click', () => {
  if (table.rows.length >= 2 && table.rows[0].cells.length >= 3) {
    const rows = document.querySelectorAll('tr');

    rows.forEach((row, index) => {
      const newCell = row.insertCell(-1);
      if (index === 0) {
        newCell.innerHTML = "<button id='delete-current-col'>X</button>"
      }
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


// Delete Current Column
deleteCurrentCol.addEventListener('click', () => {
  const currentColumnIndex = deleteCurrentCol.cellIndex;
  const rows = table.rows;
  
  for (let i = 0; i < rows.length; i++) {
    rows[i].deleteCell(currentColumnIndex);
  }

  // delete the column header if it exists
  if (table.tHead) {
    table.tHead.deleteCell(currentColumnIndex);
  }
});