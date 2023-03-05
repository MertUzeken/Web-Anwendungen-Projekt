// Warten bis das Dokument vollständig geladen ist
document.addEventListener("DOMContentLoaded", function() {
  // Das table-Element auswählen
  var table = document.getElementById("matrix");

  // Auf Klicks in den td-Elementen hören und Farbe ändern
  table.addEventListener("click", function(event) {
    var target = event.target;
    var columnIndex = target.cellIndex;
    var rowIndex = target.parentNode.rowIndex;

    // Überprüfen Sie, ob es sich um eine Zelle in einer Zeile > 0 und einer Spalte > 3 handelt
    if (rowIndex > 0 && columnIndex >= 3) {
      // Überprüfen, ob die Zelle bereits gelb ist
      if (target.style.backgroundColor === "yellow") {
        // Wenn ja, ändern Sie die Farbe auf weiß
        target.style.backgroundColor = "white";
      } else {
        // Wenn nein, ändern Sie die Farbe auf gelb
        target.style.backgroundColor = "yellow";
      }
    }
  });
});
