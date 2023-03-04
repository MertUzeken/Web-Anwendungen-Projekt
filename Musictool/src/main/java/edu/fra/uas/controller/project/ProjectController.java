package edu.fra.uas.controller.project;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import edu.fra.uas.model.Notes;
import edu.fra.uas.model.project.Project;
import edu.fra.uas.service.jService;



@Controller
public class ProjectController {

@Autowired
//private ProjectService ProjectService;
public jService jserv;
public Notes notes;

    @GetMapping("/project")
        public String loadProject(){
            return "project";
    }

    @PostMapping("/project")
    public ResponseEntity<String> handlePostRequest(@RequestBody String test) {

      System.out.println(test);
      return ResponseEntity.ok("Post request successfully processed.");
    }

    @RequestMapping("/index")
    public void saveJson(RequestEntity<Notes> req){
     Notes body = req.getBody();
     System.out.println(body.getText());
     jserv.store(body);
    }
    
    @RequestMapping("/index2")
    public String loadJson(){
      ObjectMapper mapper = new ObjectMapper();
      Notes receivedNote = jserv.load();
        try {
          // convert user object to json string and return it 
          return mapper.writeValueAsString(receivedNote);
        }
        catch (JsonProcessingException  e) {
          // catch various errors
          e.printStackTrace();
        }
        return null;
        }
 }
    