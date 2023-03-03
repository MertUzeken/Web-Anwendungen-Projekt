package edu.fra.uas.service.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.fra.uas.model.project.Project;
import edu.fra.uas.repository.project.ProjecrRepository;

@Component
public class ProjectServiceImpl implements ProjectService {

	@Autowired
	private ProjecrRepository projectRepository;
    
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



}