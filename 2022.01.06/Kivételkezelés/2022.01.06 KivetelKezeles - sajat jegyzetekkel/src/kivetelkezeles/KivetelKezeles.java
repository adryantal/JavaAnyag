
package kivetelkezeles;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class KivetelKezeles {

   
    public static void main(String[] args) throws IOException {
    
            // new KonkrOsztaly().metodus();
            
            /*NEM ELLENŐRZÖTT KIVÉTELEK - IDE által*/
            
                        
            new Muvelet().szamol("3");
            
            /*kivételtípusok*/
            
//             NoSuchFileException n;
//             FileNotFoundException f;
//            
            
            
             /*ELLENŐRZÖTT KIVÉTELEK - IDE ÁLTAL*/ 
             
            /*továbbadjuk a hívó metódusnak, és ott kezeljük le --> add clause; rábízzuk a JDM-re*/
             // new FileIO().beolvas();
              
              
            /*helyben lekezeljük --> try-catch*/
            
//           try {
//            new FileIO().beolvas();        
//        } catch (IOException ex) {
//            //Logger.getLogger(KivetelKezeles.class.getName()).log(Level.SEVERE, null, ex);
//            System.err.print(ex.getMessage());
//        }
    }
    
}
