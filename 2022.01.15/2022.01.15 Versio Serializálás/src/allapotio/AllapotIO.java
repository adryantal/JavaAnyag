package allapotio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AllapotIO {
    public static void main(String[] args) {
        AllapotIO prg = new AllapotIO();
        
        /*1. lépés - létrehozunk egy Ember objektumot*/
        
        //Ember ember = new Ember("Péter", 22);
        Ember ember = new Ember("Péter");
        System.out.println("aktuális állapot: ");
        ember.felvesz("cipő");
        ember.felvesz("kabát");
        System.out.println(ember);
        
        
         /*2. lépés - az Ember objektumot kiírjuk fájlba (szerializáció)*/
        
        prg.ment(ember);
        
        System.out.println("\nKikapcsoljuk a gépet, de előtte mentjük az állapotot\n");
        ember = null;
        
         /*3. lépés - a fájl tartalma alapján "visszaállítjuk" az Ember objektumot (deszerializáció)*/
         
        System.out.println("Bekapcsolás után: ");
        
        ember = prg.betolt();
        System.out.println(ember);
        
        ember.felvesz("doboz");
        System.out.println(ember);
    }

    private void ment(Ember ember) {
        //ObjectOutputStream objKi = null;
        /* aki megvalósítja a Closeable vagy AutoCloseable interfészt, azt lehet így használni: */
        try(ObjectOutputStream objKi = new ObjectOutputStream(new FileOutputStream("ember3.ser"))){ //FileOutputStream extends OutputStream | OutputStream implements Closeable
            //FileOutputStream fajlKi = new FileOutputStream("ember3.ser");
            //objKi = new ObjectOutputStream(fajlKi);
            objKi.writeObject(ember);
            /* így a try-ból való kilépésnél azut. hívja az objKi.close() */
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AllapotIO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AllapotIO.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
//            try {
//                objKi.close();
//            } catch (IOException ex) {
//                Logger.getLogger(AllapotIO.class.getName()).log(Level.SEVERE, null, ex);
//            }
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

    
    //Mivel a Closable / Autoclosable interfészt megvalósító erőforrások biztosan rendelkeznek egy close metódussal,
    //ezért esetükben használható a try-with resources.
    //A try-with-resources használatával az erőforrás lezárása automatikusan biztosított,
    //és nincs szükség "extra" NullpointerExeption-vizsgálatra sem!
    
    private Ember betolt() {
        //ObjectInputStream objBe = null;
        //Ember ember = null;//VESZÉLYES: bármikor jöhet NullPointerException 
        Ember ember = new Ember();//VESZÉLYES: bármikor jöhet NullPointerException 
        try(ObjectInputStream objBe = new ObjectInputStream(new FileInputStream("ember3.ser"))) {
            /* ember2 vagy ember1 betöltésénél: 
             InvalidClassException: serialVersionUID = 1 serialVersionUID = 3  
            //InvalidClassException akkor dobódik, ha az obj. visszaállításakor nem a megfelelő verziójú osztály van betöltve
            */
            //FileInputStream fajlBe = new FileInputStream("ember3.ser");
            //objBe = new ObjectInputStream(fajlBe);
            ember = (Ember)objBe.readObject(); //a readObject() metódus Object-et olvas be/ad vissza, ezért ember-ré kell castolni a tartalmat
            ember.ujId(); //kívülről új iD-t generálunk, hogy ne maradjon null értékű, azaz kitöltetlen az ID mező
            
            /* így a try-ból való kilépésnél azut. hívja az objKi.close() */
        }
        /* legspeciálisabb catch (az osztályhierarchián belüli "utód" osztályok legyenek legfelül, az ősosztályok legalul*/ 
        catch (FileNotFoundException ex) { //extends IOException --> extends Exception
            Logger.getLogger(AllapotIO.class.getName()).log(Level.SEVERE, null, ex);
        }       
        catch (InvalidClassException ix){ //extends ObjectStreamException --> extends IOException
            System.err.println("Kompatibilitási hiba!");
            /* ez nem biztos, hogy szerencsés... */
            //ember = new Ember();
        }
        catch (ClassNotFoundException ex) { //extends ReflectiveOperationException  --> extends Exception
            Logger.getLogger(AllapotIO.class.getName()).log(Level.SEVERE, null, ex);
        }
        /* legáltalánosabb catch */
        catch (IOException ex) {
            Logger.getLogger(AllapotIO.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
        finally {
//            try {
//                objBe.close();
//            } catch (IOException ex) {
//                Logger.getLogger(AllapotIO.class.getName()).log(Level.SEVERE, null, ex);
//            }
        }
        return ember;
    }
    
}
