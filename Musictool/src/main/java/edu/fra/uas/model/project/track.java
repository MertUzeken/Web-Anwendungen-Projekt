package edu.fra.uas.model.project;

import java.util.ArrayList;
import java.util.List;


public class track {

    private static int id = 0;
    private boolean active; 
    private String trackName;
    private String IntrumentName;
    private String Noter;
    private List<Integer> trackList = new ArrayList<Integer>();

    
    public track(boolean active, String trackName, String intrumentName, String noter, List<Integer> trackList) {
        id = id++;
        this.active = active;
        this.trackName = trackName;
        IntrumentName = intrumentName;
        Noter = noter;
        this.trackList = trackList;
    }
    public long getId() {
        return id;
    }
    public boolean isActive() {
        return active;
    }
    public void setActive(boolean active) {
        this.active = active;
    }
    public String getTrackName() {
        return trackName;
    }
    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }
    public String getIntrumentName() {
        return IntrumentName;
    }
    public void setIntrumentName(String intrumentName) {
        IntrumentName = intrumentName;
    }
    public String getNoter() {
        return Noter;
    }
    public void setNoter(String noter) {
        Noter = noter;
    }
    public List<Integer> getTrackList() {
        return trackList;
    }
    public void setTrackList(List<Integer> trackList) {
        this.trackList = trackList;
    }

    
}
