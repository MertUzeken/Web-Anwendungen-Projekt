package fra.uas.Service.project;
import fra.uas.Model.project.Project;



public interface ProjectService {
    
    void loadProject(Project project);
    void saveProject(Project project);
    void addTrack(Track track);
    void removeTrack(Track track);


}
