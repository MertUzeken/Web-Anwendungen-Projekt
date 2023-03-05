package edu.fra.uas.controller.project;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


import edu.fra.uas.model.project.Project;
import edu.fra.uas.service.project.ProjectService;;



@Controller
public class ProjectController {

@Autowired
private ProjectService ProjectService;
private Project mainProject = null;



    @GetMapping("/project")
        public String loadProject(Model model){
            String[][] musicPaths = {
                {"sound/test.mp3", "sound/test.mp3", "sound/test.mp3"},
                {"sound/test.mp3", "sound/test.mp3", "sound/test.mp3"}};
            if (mainProject != null){
                //lade Project array mit for schleife
                model.addAttribute("musicPaths", musicPaths);
            }
            return "project";
    }

    @GetMapping("/test")
    public String getSoundfiles(Model model) {
        String[][] musicPaths = {
            {"sound/test.mp3", "sound/test.mp3", "sound/test.mp3"},
            {"sound/test.mp3", "sound/test.mp3", "sound/test.mp3"}};
        model.addAttribute("musicPaths", musicPaths);
        return "test"; 
    }


    @PostMapping("/project")
    public ResponseEntity<String> createProject(@RequestBody Map<String, Object> jsonMap) {
      Project project = new Project(jsonMap);
      mainProject = project;
      System.out.println(jsonMap);
      return ResponseEntity.ok("Post request successfully processed.");
    }


 }
    