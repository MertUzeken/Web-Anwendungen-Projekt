package edu.fra.uas.model.track;

public class Track {
    
    private String name;
    private Double leght;


    public Track(String name, Double leght) {
        this.name = name;
        this.leght = leght;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getLeght() {
        return this.leght;
    }

    public void setLeght(Double leght) {
        this.leght = leght;
    }

}
