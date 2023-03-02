package edu.fra.uas.controller.project;

import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
public class ProjectController {

//@Autowired
//private ProjectService ProjectService;


    @GetMapping("/project")
        public String loadProject(){
            return "project";
    }

    @GetMapping("/test")
        public String loadTest(){
            return "test";
    }
    @PostMapping("/project")
    public ResponseEntity<?> handleTableData(@RequestBody List<Map<String, String>> tableData) {
      try {
        // Hier kommt der Code, der die Tabellendaten verarbeitet.
        // tableData ist eine Liste von Objekten, die jeweils eine Zeile der Tabelle repräsentieren.
        // Jedes Objekt enthält Schlüssel-Wert-Paare, wobei die Schlüssel den Spaltenüberschriften entsprechen.
        for (Map<String, String> rowData : tableData) {
          // Hier könnten die einzelnen Zeilen der Tabelle z.B. in eine Datenbank geschrieben werden.
          // Die Verarbeitung hängt von der spezifischen Anwendung ab.
          System.out.println(rowData.toString());
        }
        return ResponseEntity.ok("Table data successfully processed.");
      } catch (Exception e) {
        e.printStackTrace();
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error processing data.");
      }
    }

}
    