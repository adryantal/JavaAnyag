package allapotio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AllapotIO {
    public static void main(String[] args) {
        AllapotIO prg = new AllapotIO();
        Ember ember = new Ember("Péter", 22);
        prg.ment(ember);
        
        
    }

    private void ment(Ember ember) {
        ObjectOutputStream objKi = null;
        try {
            OutputStream fajlKi = new FileOutputStream("ember.txt"); //ember.txt-be kiiratom az objektumot
            objKi = new ObjectOutputStream(fajlKi);
            objKi.writeObject(ember);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AllapotIO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AllapotIO.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            try {
                objKi.close();
            } catch (IOException ex) {
                Logger.getLogger(AllapotIO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
//ha az obj. adattagjait is ki akarjuk iratni      
//        String output = "név: ";//itt jöhetnek a getterek
//        output += "kor: ";//itt jöhetnek a getterek
//        /* és ha sok(száz) adattag van? */
//        try {
//            Files.write(Paths.get("ember2.txt"), output.getBytes());
//        } catch (IOException ex) {
//            Logger.getLogger(AllapotIO.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }
    
}
