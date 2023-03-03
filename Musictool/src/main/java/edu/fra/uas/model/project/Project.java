package edu.fra.uas.model.project;

import java.util.ArrayList;
import java.util.List;

public class Project {

//Model Attributes
    private static long id; 
    private String projectName; 
    private long autorId; 
    private String autorName; 
    private  List<track> tracks = new ArrayList<track>();

    public Project(List<track> tracks) {

        //ToDO 
        //More if user is addes or Database
        id = id++;
        this.tracks = tracks;
    }
    public void setTracks(List<track> tracks) {
        this.tracks = tracks;
    }
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
    public void setAutorId(long autorId) {
        this.autorId = autorId;
    }
    public void setAutorName(String autorName) {
        this.autorName = autorName;
    }
    public List<track> getTracks() {
        return tracks;
    }
    public long getId() {
        return id;
    }
    public String getProjectName() {
        return projectName;
    }
    public long getAutorId() {
        return autorId;
    }
    public String getAutorName() {
        return autorName;
    }

    //ToDo more 
    //add a Track in list of tracks for reuse of project to be more date efficent
    public void  addTrack(track track) {
        tracks.add(track);
    }
    
}
