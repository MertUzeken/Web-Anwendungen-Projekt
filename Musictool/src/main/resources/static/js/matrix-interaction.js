document.addEventListener("DOMContentLoaded", function() {
  // Get Tabel id matrix
  var table = document.getElementById("matrix");

  // Check for click on Tabel
  table.addEventListener("click", function(event) {
    var target = event.target;
    var columnIndex = target.cellIndex;
    var rowIndex = target.parentNode.rowIndex;

    // Check if click was after first row and after 3 column
    if (rowIndex > 0 && columnIndex >= 3) {
      // Check if Cell is green
      if (target.style.backgroundColor === "green") {
        // set it white
        target.style.backgroundColor = "white";
      } else {
        // set green if ists white
        target.style.backgroundColor = "green";
      }
    }
  });
});
