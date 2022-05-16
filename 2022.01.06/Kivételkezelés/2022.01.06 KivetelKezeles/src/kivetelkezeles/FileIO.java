package kivetelkezeles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileIO {
    void beolvas() throws IOException{
        /* kivétel: NoSuchFileException */

        /* tovább adjuk: */
        Files.readAllLines(Paths.get("nincsMeg.txt"));
        
        /* lekezeljük helyben: */
//        try {
//            Files.readAllLines(Paths.get("nincsMeg.txt"));
//        } catch (IOException ex) {
//            //Logger.getLogger(FileIO.class.getName()).log(Level.SEVERE, null, ex);
//            System.out.println("Valami I/O hiba van...");
//            System.err.println("Valami I/O hiba van...");
//            System.out.println("ex:" + ex);
//            System.out.println("hiba: " + ex.getMessage());
//        }
    }
}
