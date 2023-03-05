package edu.fra.uas.controller.project;

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
private ProjectService projectService;
private Project mainProject = null;



    @GetMapping("/project")
        public String loadProject(Model model){
            if (mainProject != null){
                String[][] musicPaths = projectService.openProject(mainProject);
                model.addAttribute("musicPaths", musicPaths);
                System.out.println(musicPaths);
            }
            System.out.println("test");
            return "project";
    }

    @GetMapping("/test")
    public String getSoundfiles(Model model) {
        String[][] musicPaths = {
            {"sound/piano/d.mp3", "", "","","","","sound/piano/c.mp3"},
            {"sound/piano/c.mp3", "sound/piano/c.mp3", "sound/piano/c.mp3","sound/piano/c.mp3","sound/piano/c.mp3","sound/piano/c.mp3","sound/piano/c.mp3"},
            {"sound/piano/e.mp3", "sound/piano/e.mp3", "","","","sound/piano/c.mp3",""}};
        model.addAttribute("musicPaths", musicPaths);
        return "test"; 
    }

    @PostMapping("/project")
    public ResponseEntity<String> createProject(@RequestBody Map<String, Object> jsonMap) {
      Project project = new Project(jsonMap);
      projectService.saveLocal(project);
      mainProject = project;
      System.out.println(jsonMap);
      return ResponseEntity.ok("Post request successfully processed.");
    }
 }
    