$(document).ready(function() {
    $("#matrix-table td:not(:first-child):not(:nth-child(2))").click(function(event) {
      const clickedCell = $(this);
      const row = clickedCell.closest("tr");
      const column = clickedCell.index();
      const currentValue = clickedCell.text();
      if (currentValue === "") {
        clickedCell.text("1");
      } else if (currentValue === "1") {
        let timeout;
        let dragStartX;
        clickedCell.text("2");
        clickedCell.on("mousedown", function(event) {
          dragStartX = event.pageX;
          timeout = setTimeout(function() {
            clickedCell.text("");
            row.children("td").eq(column).text("2");
          }, 500);
        });
        $(document).on("mousemove", function(event) {
          if (dragStartX) {
            clearTimeout(timeout);
            const dragDistance = event.pageX - dragStartX;
            if (dragDistance > 10) {
              clickedCell.text("");
              row.children("td").eq(column).text("2");
            }
          }
        }).on("mouseup", function() {
          dragStartX = null;
          clearTimeout(timeout);
        });
      } else if (currentValue === "2") {
        clickedCell.text("");
      }
    });
  });
  