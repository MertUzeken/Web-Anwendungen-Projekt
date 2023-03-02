
// Event Listener für den Play Button hinzufügen
  document.querySelector('#play').addEventListener("click", function() {
    // Tabellendaten in JSON umwandeln
    const data = [];
    const table = document.getElementById("matrix");
    const rows = table.querySelectorAll("tbody tr");
    rows.forEach(function(row) {
      const rowData = {};
      const inputs = row.querySelectorAll("input, select");
      inputs.forEach(function(input) {
        rowData[input.name] = input.type === "checkbox" ? input.checked : input.value;
      });
      data.push(rowData);
    });
    const jsonData = JSON.stringify(data);
    
    // AJAX-Anfrage senden
    const xhr = new XMLHttpRequest();
    xhr.open("POST", "/project");
    xhr.setRequestHeader("Content-Type", "application/json");
    xhr.onload = function() {
      if (xhr.status === 200) {
        console.log("Table data successfully sent.");
      } else {
        console.error("Error sending table data.");
      }
    };
    xhr.send(jsonData);
  });
  