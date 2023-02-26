package edu.fra.uas.service.project;

import java.util.List;
import edu.fra.uas.model.project.Project;
import edu.fra.uas.model.track.Track;

public interface ProjectService {
    
    void loadProject(Project project);
    void saveProject(Project project);
    List<Project>getAllProjects();
    void addTrack(Track track);
    void removeTrack(Track track);


}
