package edu.fra.uas.model.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Project {

    //Model Attributes
    /* id KEY
     * prjectName for Search and naming
     * Author ID foreign key
     * authorName for Project List
     * Tracks: Multiple tracks in one Project
     */
    private static long id; 
    private String projectName; 
    private long authorId; //Maybe Later if we got UserDB
    private String authorName; 
    private  List<Track> tracks = new ArrayList<Track>(); 

    //Constructor for Project
    //Need a MAP (String, Object) to process a JSON file and create a project
    public Project(Map<String, Object> jsonMap) {
        id = id++;
        this.authorName = (String) jsonMap.get("authorName");
        this.projectName = (String) jsonMap.get("projectName");

        //create a list of tracks from the JSON map
        List<Track> tracks = new ArrayList<>();
        int i = 1;

        //Puts our tracks which start at row 4 onwards 
        while (jsonMap.containsKey("track" + i)) {
            Map<String, Object> trackMap = (Map<String, Object>) jsonMap.get("track" + i);
            Track trackDto = new Track();
            trackDto.setActive((boolean) trackMap.get("active"));
            trackDto.setTrackName((String) trackMap.get("trackName"));
            trackDto.setIntrumentName((String) trackMap.get("IntrumentName"));
            trackDto.setNote((String) trackMap.get("note"));
            List<Integer> toneMatrixList = (List<Integer>) trackMap.get("toneMatrix");
            List<Integer> integerList = new ArrayList<>();
            for(Integer num : toneMatrixList) {
                integerList.add(num);
            }

            //TEAM: Debug info for Team
            //System.out.println(integerList); 
            trackDto.setTrackList(integerList);
            tracks.add(trackDto);
            i++;
        }
        this.tracks = tracks;
    }

    /*
     * GETTER AND SETTER METHODS
     */

    public void setTracks(List<Track> tracks) {
        this.tracks = tracks;
    }
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
    public void setAuthorId(long autorId) {
        this.authorId = autorId;
    }
    public void setAuthorName(String autorName) {
        this.authorName = autorName;
    }
    public List<Track> getTracks() {
        return tracks;
    }
    public long getId() {
        return id;
    }
    public String getProjectName() {
        return projectName;
    }
    public long getAuthorId() {
        return authorId;
    }
    public String getAuthorName() {
        return authorName;
    }

    //ToDo for future
    //add a Track in list of tracks for reuse of project to be more date efficent
    //Idea: the porjects checks if its an old Track or new
    public void  addTrack(Track track) {
        tracks.add(track);
    }

}
