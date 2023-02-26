package fra.uas.Model.project;

public class Project {
    private String projectName;
    private String authorFirstName;
    private String authorLastName;


    public Project(String projectName, String authorFirstName, String authorLastName) {
        this.projectName = projectName;
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
    }

    public String getProjectName() {
        return this.projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getAuthorFirstName() {
        return this.authorFirstName;
    }

    public void setAuthorFirstName(String authorFirstName) {
        this.authorFirstName = authorFirstName;
    }

    public String getAuthorLastName() {
        return this.authorLastName;
    }

    public void setAuthorLastName(String authorLastName) {
        this.authorLastName = authorLastName;
    }



}
