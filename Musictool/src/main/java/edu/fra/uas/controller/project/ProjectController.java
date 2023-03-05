package edu.fra.uas.controller.project;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.google.gson.Gson;

import edu.fra.uas.model.project.Project;
import edu.fra.uas.service.project.ProjectServiceImpl;



@Controller
public class ProjectController {

@Autowired
public ProjectServiceImpl pserv;


    /*@GetMapping("/project")
        public String loadProject(){
            return "project";
    }*/

    @PostMapping("/project")
    public ResponseEntity<String> createProject(@RequestBody Map<String, Object> jsonMap) {
      Project project = new Project(jsonMap);
      //System.out.println("Bis heir ok"); //jsonMap);
      //System.out.println(project.getProjectName() + "" + project.getTracks());
      pserv.saveLocal(project);

      return ResponseEntity.ok("Post request successfully processed.");
    }

    @GetMapping("/project")
      public String returnProject(String name){
        //System.out.println("DEBUG: \n" + pserv.getLocalProjByName("NiceBeats").getAuthorName());
        Project loadedProj = pserv.getLocalProjByName(name);
        String json = new Gson().toJson(loadedProj);
        System.out.println(json);

        return json;
  


 }
}
    