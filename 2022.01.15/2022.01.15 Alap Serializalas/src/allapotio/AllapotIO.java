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
            OutputStream fajlKi = new FileOutputStream("ember.txt");
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
        
        
//        String ki = "név: ";//itt jöhetnek a getterek
//        ki += "kor: ";//itt jöhetnek a getterek
//        /* és ha sok(száz) adattag van? */
//        try {
//            Files.write(Paths.get("ember.txt"), ki.getBytes());
//        } catch (IOException ex) {
//            Logger.getLogger(AllapotIO.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }
    
}
