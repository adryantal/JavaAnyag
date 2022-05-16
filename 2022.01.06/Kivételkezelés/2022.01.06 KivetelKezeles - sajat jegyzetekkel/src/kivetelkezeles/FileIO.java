
package kivetelkezeles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;


public class FileIO {
    
    void beolvas() throws IOException {
        
        /*kivétel: NoSuchFileException - nem található a hivatkozott fájl */ 
        
        /*továbbadjuk a hívó metódusnak --> add clause*/
         Files.readAllLines(Paths.get("nincsMeg.txt"));
        
        /*lekezeltük helyben --> try/catch*/
//        try {
//            Files.readAllLines(Paths.get("nincsMeg.txt"));
//        } catch (IOException ex) {
//            //Logger.getLogger(FileIO.class.getName()).log(Level.SEVERE, null, ex);
//            System.out.println("I/O hiba");
//            System.err.println("I/O hiba"); //error kimenetre írtunk, nem az Outputra
//            //minden eszköz a streamről olvas --> ha hibat akarunk kiirni, akkor az error stream-re írunk
//            System.out.println("hiba: " + ex.getMessage() + ", " + ex.toString()); //az exception obj. toString-jének / információs üzenetének kiiratása
//            
//            //a kivétel vmely nem várt szituációnak a kezelése, NEM HIBA!
//            //catch ág: tájékoztató célzatú
//            
//            
//        }
    
   } 
}
