package edu.fra.uas.service.project;

import java.util.List;

import edu.fra.uas.model.project.Project;

public interface ProjectService {
    //For DB
    void checkProject(Project project);
    void loadProject(Project project);
    void downloadProject(Project project);
    void uploadProject(Project project);
    void saveProject(Project project);
    List<Project>showAllProject();
    //local save, load, show.
    void saveLocal(Project project);
    Project getLocalProjByName(String name);
}