package edu.fra.uas.model.project;

import java.util.ArrayList;
import java.util.List;


public class Track {

    /*
     * active: is Track active?
     * trackName: Textbox 
     * intrumentName: Picked Instrument in Frontend
     * note:Picked Note in Frontend
     * path: Path in Sound folder but currtently not in use
     */
    private static int id = 0;
    private boolean active; 
    private String trackName;
    private String intrumentName;
    private String note;
    private String path;
    private List<Integer> trackList = new ArrayList<Integer>();
    
    public Track() {
        id = id++;
    }


    /*
     * GETTER AND SETTER METHODS
     */

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
        return intrumentName;
    }
    public void setIntrumentName(String intrumentName) {
        this.intrumentName = intrumentName;
    }
    public String getNote() {
        return note;
    }
    public void setNote(String note) {
        this.note = note;
    }
    public List<Integer> getTrackList() {
        return trackList;
    }
    public void setTrackList(List<Integer> trackList) {
        this.trackList = trackList;
    }
    public String getPath() {
        return path;
    }
    public void setPath(String path) {
        this.path = path;
    }



    
}
