
package allapotio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import static java.lang.System.out;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;


public class AllapotIO {

  
    public static void main(String[] args) {
        
        AllapotIO prg = new AllapotIO();
        Ember ember =new Ember ("Peter",22);
        prg.ment(ember);
        
               
    }
        private void ment( Ember ember){
            
        try {
            OutputStream ki = new FileOutputStream("ember.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AllapotIO.class.getName()).log(Level.SEVERE, null, ex);
        }
            ObjectOutputStream objKi = new ObjectOutputStream(out);
            
//            String ki ="név"; //itt jöhetnek a getterek
//            ki += "kor";
//            //és ha rengeteg adattag van??
//            
            
//        try {
//            Files.write(Paths.get("ember.txt"), ki.getBytes());
//        } catch (IOException ex) {
//            Logger.getLogger(AllapotIO.class.getName()).log(Level.SEVERE, null, ex);
//        }
        



        }

    
}
