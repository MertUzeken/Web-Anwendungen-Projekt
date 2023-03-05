package edu.fra.uas.controller.project;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import edu.fra.uas.model.project.Project;



@Controller
public class ProjectController {

//@Autowired
//private ProjectService ProjectService;


    @GetMapping("/project")
        public String loadProject(){
            return "project";
    }

    @PostMapping("/project")
    public ResponseEntity<String> createProject(@RequestBody Map<String, Object> jsonMap) {
      Project project = new Project(jsonMap);
      System.out.println(jsonMap);
      return ResponseEntity.ok("Post request successfully processed.");
    }


 }
    