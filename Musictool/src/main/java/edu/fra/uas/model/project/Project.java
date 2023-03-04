package edu.fra.uas.model.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Project {

//Model Attributes
    private static long id; 
    private String projectName; 
    private long authorId; //Maybe Later if we got UserDB
    private String authorName; 
    private  List<Track> tracks = new ArrayList<Track>();

    public Project(Map<String, Object> jsonMap) {

        
        //More if user is addes or Database
        id = id++;
        this.authorName= (String) jsonMap.get("authorName");
        this.projectName= (String) jsonMap.get("projectName");

        // create a list of tracks from the JSON map
        List<Track> tracks = new ArrayList<>();
        int i = 1;

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
            System.out.println(integerList); //Muss wieder raus ONYL SYSTEM OUTPUT
            trackDto.setTrackList(integerList);
            tracks.add(trackDto);
            i++;
        }
        this.tracks = tracks;
    }
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

    //ToDo more 
    //add a Track in list of tracks for reuse of project to be more date efficent
    public void  addTrack(Track track) {
        tracks.add(track);
    }

}
