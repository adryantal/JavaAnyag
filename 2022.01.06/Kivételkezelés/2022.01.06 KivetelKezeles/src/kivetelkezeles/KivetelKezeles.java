package kivetelkezeles;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class KivetelKezeles {
    public static void main(String[] args) throws IOException {
        //new KonkrOsztaly().metodus();
        
        /* ELLENŐRZÖTT -IDE által- KIVÉTELEK */ 
        
        /* továbbadjuk a hívó metódusnak: */
        //new FileIO().beolvas();
        
        /* lekezeljük itt, helyben: */
//        try {
//            new FileIO().beolvas();
//        } catch (IOException ex) {
//            //Logger.getLogger(KivetelKezeles.class.getName()).log(Level.SEVERE, null, ex);
//            System.err.println(ex);
//        }

        /* NEM ELLENŐRZÖTT KIVÉTELEK */ 
        new Muvelet().szamol("a");
    }
    
}
