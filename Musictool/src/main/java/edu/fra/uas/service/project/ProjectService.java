package edu.fra.uas.service.project;

import java.util.ArrayList;
import java.util.List;

import edu.fra.uas.model.project.Project;

public interface ProjectService {
    public List<Project> localStore = new ArrayList<>();
    
    void checkProject(Project project);
    void loadProject(Project project);
    void downloadProject(Project project);
    void uploadProject(Project project);
    void saveProject(Project project);
    void openProject(Project project);
    List<Project>showAllProject();
    Project getLocalProjByName(String string);
    public void saveLocal(Project project);
    
}
