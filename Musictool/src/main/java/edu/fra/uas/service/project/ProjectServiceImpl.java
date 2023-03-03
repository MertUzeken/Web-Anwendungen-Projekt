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

    @Override
    public List<Project> showAllProject() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'showAllProject'");
    }



}