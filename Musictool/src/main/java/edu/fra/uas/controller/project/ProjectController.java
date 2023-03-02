package edu.fra.uas.controller.project;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


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
}
    