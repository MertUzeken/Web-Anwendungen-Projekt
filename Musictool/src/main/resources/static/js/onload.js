// get all table cells
const cells = document.querySelectorAll('table td');

// check if all cells are white
let allWhite = true;
cells.forEach(cell => {
  if (cell.style.backgroundColor !== 'white') {
    allWhite = false;
    return;
  }
});

// set all cells to white if not already white
if (!allWhite) {
  cells.forEach(cell => {
    cell.style.backgroundColor = 'white';
  });
}
