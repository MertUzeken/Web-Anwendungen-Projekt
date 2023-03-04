package edu.fra.uas.model.project;

import java.util.ArrayList;
import java.util.List;


public class Track {

    private static int id = 0;
    private boolean active; 
    private String trackName;
    private String IntrumentName;
    private String Note;
    private List<Integer> trackList = new ArrayList<Integer>();

    
    public Track() {
        id = id++;
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
    public String getNote() {
        return Note;
    }
    public void setNote(String note) {
        Note = note;
    }
    public List<Integer> getTrackList() {
        return trackList;
    }
    public void setTrackList(List<Integer> trackList) {
        this.trackList = trackList;
    }

    
}
