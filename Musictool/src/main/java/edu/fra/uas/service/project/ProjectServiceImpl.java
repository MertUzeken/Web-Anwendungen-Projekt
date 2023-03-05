/*
 * Check ParentClass for detailed Documentation
 * Comments here only for Team
 */

package edu.fra.uas.service.project;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.fra.uas.model.project.Project;
import edu.fra.uas.repository.project.ProjectRepository;

@Component
public class ProjectServiceImpl implements ProjectService {

	@Autowired
	private ProjectRepository projectRepository;
    
    @Override
    public void checkProject(Project project) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'checkProject'");
    }
    //DB 
    @Override
    public void loadProject(Project project) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'loadProject'");
    }

    @Override
    public void downloadProject(Project project) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'downloadProject'");
    }

    //wenn zeit bleibt
    @Override
    public void uploadProject(Project project) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'uploadProject'");
    }

	//save the Project in to DB
	@Override
	public void saveProject(Project project) {
		this.projectRepository.save(project);

	}
    //DB
    @Override
    public List<Project> showAllProject() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'showAllProject'");
    }
    @Override
    public String[][] openProject(Project project) {

        int n = project.getTracks().get(0).getTrackList().size();
        int m= project.getTracks().size();
        String[][] arrayBox = new String[n][m];

        for (int i=0; i<n; i++){
            for (int j=0; i<m; i++){
                String a="";
                if (project.getTracks().get(i).getTrackList().get(j) == 1){
                a = "sound"+"/"+ project.getTracks().get(i).getIntrumentName()+ "/"+ project.getTracks().get(i).getNote() +".mp3";
                }
                else {
                    a= "";
                }
                arrayBox[i][j] =  a;
            }
        }
        return arrayBox;
    }
    @Override
    public void saveLocal(Project project){
        localStore.add(project);
    }
    @Override
    public Project getLocalProjByName(String name){

        for (Project project : localStore){
            if(project.getProjectName().equals(name)){
                return project;
            }
        }
        return null;
    
    }
}