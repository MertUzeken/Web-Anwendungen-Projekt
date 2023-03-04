package edu.fra.uas.service;
import java.util.ArrayList;
import org.springframework.stereotype.Service;
import edu.fra.uas.model.Notes;

@Service
public class jService {
   public ArrayList<Notes> notes = new ArrayList<>();
    /*
    public void store(Notes notesfile){
        List<Notes> myStoredData;

        System.out.println(notesfile.getText());

    }*/

    public Notes load(){
        return notes.get(0);
    }

    public void store(Notes note){
        
        notes.add(note);

        for (int counter = 0; counter < notes.size(); counter++) { 		      
            System.out.println(notes.get(counter).getText()); 		
        }   	
       
    }
}
