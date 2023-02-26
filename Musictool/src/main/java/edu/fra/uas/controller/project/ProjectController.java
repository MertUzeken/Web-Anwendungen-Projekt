package edu.fra.uas.controller.project;

//import edu.fra.uas.service.project.*;
//#import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import edu.fra.uas.model.track.Track;
import edu.fra.uas.service.track.TrackService;


@Controller
public class ProjectController {

<<<<<<< HEAD
@Autowired
private ProjectService ProjectService;
@Autowired
private Track trackService;
=======
//@Autowired
//private ProjectService ProjectService;
>>>>>>> Forntend

    @GetMapping("/project")
        public String loadProject(){
            return "project";
    }
<<<<<<< HEAD

    @PostMapping("/addtrack")
        public String addTrack(@ModelAttribute("Track") Track track){
            Track track = trackService.setName("? ");  //Unvollständig

            return "redirect:/listProject";
        }
    


=======
>>>>>>> Forntend
}
    