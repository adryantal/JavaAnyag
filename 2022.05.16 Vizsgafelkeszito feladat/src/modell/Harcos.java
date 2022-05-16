
package modell;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Harcos extends Karakter implements Serializable{
    
    int ero, ugyesseg;    
    

    public Harcos(String nev, String faj, int ero, int ugyesseg) throws InvalidNameException {
        super(nev, faj);
        this.ero= ero;
        this.ugyesseg=ugyesseg;
    }
    
       
    public Harcos(String nev, int ero, int ugyesseg) throws InvalidNameException {
    this(nev, "Ember",  ero,  ugyesseg);    
    }

    public int getEro() {
        return ero;
    }   

    public int getUgyesseg() {
        return ugyesseg;
    }

    public void setUgyesseg(int ugyesseg) {
        this.ugyesseg = ugyesseg;
    }
    
     public void setEro(int ero) {
        this.ero = ero;
    }
    
       /*STATIKUS RENDEZŐMETÓDUSOK -  - ATTRIBÚTUMOK SZERINTI RENDEZÉSHEZ, COMPARATOR OSZTÁLYOK FELHASZNÁLÁSÁVAL*/
    public static EroComparator EroRendezo() {
        return new EroComparator();
    }
    
    public static UgyessegComparator UgyessegRendezo() {
        return new UgyessegComparator();
    }

    @Override
    public String toString() {
        return super.toString() + "\tErő: "+ero+ "\n\tÜgyesség: "+ugyesseg; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    /*SZERIALIZÁCIÓ*/
     public void allapotMentes(String fileNev) {
        try {
            ObjectOutputStream objKi = new ObjectOutputStream(new FileOutputStream(fileNev));
            objKi.writeObject(this);
            System.out.println("Szerializáció --> Fájlba írás megtörtént.");
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
      
        /*DESZERIALIZÁCIÓ*/
    public static Harcos allapotBeolvasas(String fileNev) {
        Harcos harcos =null;
        try {
            ObjectInputStream objBe = new ObjectInputStream(new FileInputStream(fileNev));
            harcos = (Harcos) objBe.readObject();           
            System.out.println("Deszerializáció --> Könyvtár beolvasva a fájlból.");            

        } catch (FileNotFoundException ex) { //utód
            System.out.println(ex.getMessage());
        } catch (IOException ex) {   //ős
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return harcos;
    }

    
    
    
}




    /*COMPARATOR OSZTÁLYOK - ATTRIBÚTUMOK SZERINTI RENDEZÉSHEZ*/

class EroComparator implements Comparator<Harcos> {
    @Override
    public int compare(Harcos h1, Harcos h2) {
        return Integer.compare(h1.getEro(), h2.getEro());
    } 
 } 

class UgyessegComparator implements Comparator<Harcos> {
    @Override
    public int compare(Harcos h1, Harcos h2) {
        return Integer.compare(h1.getUgyesseg(), h2.getUgyesseg());
    } 
 } 