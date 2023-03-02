const playBtn = document.querySelector('#download');

playBtn.addEventListener("click", function() {
  const tableData = getTableData(); // Die Funktion getTableData() 

  const xhr = new XMLHttpRequest();
  xhr.open("POST", "/project"); // Die URL Backend-Route.
  xhr.setRequestHeader("Content-Type", "application/json");
  xhr.onload = function() {
    if (xhr.status === 200) {
      console.log("Table data successfully sent to backend.");
    } else {
      console.error("Error sending table data to backend.");
    }
  };
  xhr.send(JSON.stringify(tableData));
});