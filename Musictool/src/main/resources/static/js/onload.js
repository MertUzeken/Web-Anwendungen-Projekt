// Define a function that will modify the table when the page loads
function modifyTable() {
    // Get a reference to the table element
    var table = document.getElementById("matrix");
  
    // Get the number of rows and columns in the table
    var numRows = table.rows.length;
    var numCols = table.rows[0].cells.length;
  
    // Loop through each row starting from the second row
    for (var i = 1; i < numRows; i++) {
      // Loop through each cell in the third column and set its background color to white
      for (var j = 2; j < numCols; j++) {
        table.rows[i].cells[j].style.backgroundColor = "white";
      }
    }
  }
  
  // Call the modifyTable function when the page has finished loading
  window.onload = function() {
    modifyTable();
  };
  