
package streamek;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Reader {
    
    public void readSingleChar(){
    
        try {
            FileInputStream fis = new FileInputStream("D:\\SULI II\\Asztali- és mobilalkalmazások fejlesztése\\Kiegészítő példák\\AK Akademia - feladatok\\src\\streamek\\FOS.txt");
            int i = fis.read(); //egy int típusú számot ad vissza a read() metódus, ez lesz a karakter ASCII kódja 
            System.out.println((char)i); //az ASCII kódot karakterré cast-olom (hogy "értelmezhető" eredményt kapjak)
            fis.close();
        } catch (FileNotFoundException ex) {
            //ex.getMessage();
            System.err.println("A fájl nem található!");
        } catch (IOException ex) {
            //ex.getMessage();
            System.err.println("IOException keletkezett: " + ex.getMessage());
        }
    }
    
     public void readMultipleCharacters(){
    
        try {
            FileInputStream fis = new FileInputStream("D:\\SULI II\\Asztali- és mobilalkalmazások fejlesztése\\Kiegészítő példák\\AK Akademia - feladatok\\src\\streamek\\FOS2.txt");
            int i = 0; //tudom, hogy egy számot ad vissza a read() metódus 
            String result = "";
            while((i=fis.read()) != -1){ //amíg nem érjük el a fájl végét
                //System.out.println((char)i);
                result += (char)i; //a read metódus byte-ot olvas be/ad vissza, ezért char-rá kell castolnom a byte-ot
            }          
            
            System.out.println(result);
            fis.close();
        } catch (FileNotFoundException ex) {
            //ex.getMessage();
            System.err.println("A fájl nem található!");
        } catch (IOException ex) {
            //ex.getMessage();
            System.err.println("IOException keletkezett: " + ex.getMessage());
        }
    }
    
    
}
