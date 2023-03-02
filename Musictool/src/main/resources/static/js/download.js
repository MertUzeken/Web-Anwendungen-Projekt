function sendTable() {
    var matrix = document.getElementById("matrix");
    var rows = matrix.rows.length;
    var cols = matrix.rows[0].cells.length;
    var data = [];
    for (var i = 0; i < rows; i++) {
        data[i] = [];
        for (var j = 0; j < cols; j++) {
            data[i][j] = matrix.rows[i].cells[j].innerHTML;
        }
    }

    var xhr = new XMLHttpRequest();
    xhr.open("POST", "example", true);
    xhr.setRequestHeader("Content-Type", "application/json");
    xhr.onreadystatechange = function() {
        if (xhr.readyState === XMLHttpRequest.DONE && xhr.status === 200) {
            console.log(xhr.responseText);
        }
    };
    xhr.send(JSON.stringify(data));
}

var button = document.createElement("button");
button.innerHTML = "Send Table";
button.onclick = sendTable;
document.body.appendChild(button);