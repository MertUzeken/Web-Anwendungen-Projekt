package edu.fra.uas.controller.project;

import edu.fra.uas.service.project.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class ProjectController {

@Autowired
private ProjectService ProjectService;

    @GetMapping("/project")
        public String loadProject(){
            return "project";
    }

    


}
    