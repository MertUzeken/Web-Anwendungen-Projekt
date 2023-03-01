var rows = ['A', 'B', 'C', 'D', 'E'];
var cols = [1, 2, 3, 4, 5];

function addRow() {
  var newRow = document.createElement('tr');
  newRow.setAttribute('id', rows[rows.length-1] + String.fromCharCode(rows.length + 64));
  var firstCell = document.createElement('td');
  firstCell.appendChild(document.createTextNode(rows.length));
  newRow.appendChild(firstCell);
  for (var i = 0; i < cols.length; i++) {
    var cell = document.createElement('td');
    cell.setAttribute('id', newRow.getAttribute('id') + '-' + cols[i]);
    newRow.appendChild(cell);
  }
  document.querySelector('table').appendChild(newRow);
  rows.push(newRow.getAttribute('id'));
}

function addColumn() {
  var newCol = cols.length + 1;
  cols.push(newCol);
  var headerCell = document.createElement('td');
  headerCell.appendChild(document.createTextNode(newCol));
  document.querySelector('tr').appendChild(headerCell);
  var rows = document.querySelectorAll('tr[id]');
  for (var i = 0; i < rows.length; i++) {
    var cell = document.createElement('td');
    cell.setAttribute('id', rows[i].getAttribute('id') + '-' + newCol);
    rows[i].appendChild(cell);
  }
}

document.querySelector('#add-row').addEventListener('click', addRow);
document.querySelector('#add-col').addEventListener('click', addColumn);
