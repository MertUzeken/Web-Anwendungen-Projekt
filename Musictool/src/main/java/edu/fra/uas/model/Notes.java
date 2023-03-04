package edu.fra.uas.model;

import java.util.ArrayList;
import java.util.List;

public class Notes {
    private Boolean check;
    private String text;
    private String drop1;
    private String drop2;
    private List<String> noteMatrix = new ArrayList<>();
    

    public Notes(Boolean check, String text, String drop1, String drop2, List<String> noteMatrix) {
        this.check = check;
        this.text = text;
        this.drop1 = drop1;
        this.drop2 = drop2;
        this.noteMatrix = noteMatrix;
    }

    public Boolean isCheck() {
        return this.check;
    }

    public Boolean getCheck() {
        return this.check;
    }

    public void setCheck(Boolean check) {
        this.check = check;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getDrop1() {
        return this.drop1;
    }

    public void setDrop1(String drop1) {
        this.drop1 = drop1;
    }

    public String getDrop2() {
        return this.drop2;
    }

    public void setDrop2(String drop2) {
        this.drop2 = drop2;
    }

    public List<String> getNoteMatrix() {
        return this.noteMatrix;
    }

    public void setNoteMatrix(List<String> noteMatrix) {
        this.noteMatrix = noteMatrix;
    }
    

};



