package edu.fra.uas.controller.project;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProjectController {
    
    @GetMapping("/project")
    public String project(){

        return List.of("Hello", "World", "ht");
    }
}


