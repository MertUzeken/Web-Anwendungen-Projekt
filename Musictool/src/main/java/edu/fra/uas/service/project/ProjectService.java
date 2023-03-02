package edu.fra.uas.service.project;

import java.util.List;
import edu.fra.uas.model.project.Project;

public interface ProjectService {
    
    void loadProject(Project project);
    void saveProject(Project project);
    List<Project>getAllProjects();


}
