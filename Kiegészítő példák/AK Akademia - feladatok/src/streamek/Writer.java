//fájlba írunk
package streamek;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Writer {
    
    public void writeSingleChar(){
    
        try {
            FileOutputStream fos = new FileOutputStream("D:\\SULI II\\Asztali- és mobilalkalmazások fejlesztése\\Kiegészítő példák\\AK Akademia - feladatok\\src\\streamek\\FOS.txt");
            fos.write(65);  //65 az "A" betű ASCII kódja | a write() felülíró művelet!
            fos.flush(); //ürítem
            fos.close();
            System.out.println("Fájlba írás kész!");
        } catch (FileNotFoundException ex) {
            //ex.getMessage();
            System.err.println("A fájl nem található!");
        } catch (IOException ex) {
            //ex.getMessage();
            System.err.println("IOException keletkezett: " + ex.getMessage());
        }
    }
    
    
        public void writeMultipleCharacters(){
    
        try {
            FileOutputStream fout = new FileOutputStream("D:\\SULI II\\Asztali- és mobilalkalmazások fejlesztése\\Kiegészítő példák\\AK Akademia - feladatok\\src\\streamek\\FOS2.txt");
            String text = "beolvasando szoveg";
            byte a[] = text.getBytes();//az összefüggő adathalmazt bájtokká alakítjuk, és bájttömbbe tároljuk
            fout.write(a); //felülírás történik!
            fout.flush(); //ürítem
            fout.close();
            System.out.println("Fájlba írás kész!");
        } catch (FileNotFoundException ex) {
            //ex.getMessage();
            System.err.println("A fájl nem található!");
        } catch (IOException ex) {
            //ex.getMessage();
            System.err.println("IOException keletkezett: " + ex.getMessage());
        }
    }
    
}
