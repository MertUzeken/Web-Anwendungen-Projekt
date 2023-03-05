/*
 * 
 * Parent Calls of ProjectServiceImpl. 
 * For the Service Structure
 * 
*/

package edu.fra.uas.service.project;

import java.util.ArrayList;
import java.util.List;

import edu.fra.uas.model.project.Project;

public interface ProjectService {
    public List<Project> localStore = new ArrayList<>();
    
    //check if Project is a Project -> Upload checker and loading checker
    void checkProject(Project project);

    //Loading Project into 
    void loadProject(Project project);
    //download Project not in use -> ohter solution in JS
    void downloadProject(Project project);
    //create Project and check if the struckre is right bevor creating ist
    void uploadProject(Project project);
    //save Oriject in DB
    void saveProject(Project project);
    //gets Matrix for sending back to Frontend
    public String[][] openProject(Project project);
    List<Project>showAllProject();
    //Local list for testing without DB find in list
    Project getLocalProjByName(String string);
    //save in local List
    public void saveLocal(Project project);
    
}
