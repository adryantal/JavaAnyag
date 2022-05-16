package main;

import com.sun.org.apache.bcel.internal.classfile.Code;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modell.Galeria;
import modell.KiallitasiTargy;
import modell.Festmeny;
import modell.InvalidDateException;

public class Program {

    public static void main(String[] args) {

        Galeria galeria = new Galeria();
        Date today = new Date();
        try {
            galeria.felvesz(new Festmeny("Van Gogh", "Váza tizenöt napraforgóva"));
            galeria.felvesz(new Festmeny(today, "Botticelli", "Vénusz születése"));
            // galeria.felvesz(new Festmeny(new Date(today.getTime() + (1000 * 60 * 60 * 24)),"Munch", "A Sikoly ")); //hibás dátum
            galeria.felvesz(new Festmeny("src/res/kep.txt", "Picasso", "Guernica"));
            galeria.felvesz(new Festmeny("src/res/kep.txt", today, "Van Gogh", "A burgonyafőnök"));

        } catch (InvalidDateException ex) {
            Logger.getLogger(Program.class.getName()).log(Level.SEVERE, null, ex);
        } finally {          
            
            listaKiir(galeria.getKTLista(), "Tesztelés");
            listaKiir(galeria.getKTListaRendCim(), "Cím szerint rendezve:");
            listaKiir(galeria.getKTListaRendKeszito(), "Készítő szerint rendezve");
            
            galeria.allapotMentes("allapotMentes.bin");

      
        galeria = null;
        galeria = galeria.allapotBeolvasas("allapotMentes.bin");
        listaKiir(galeria.getKTLista(), "Visszaállítás eredménye");

        }
        
        

    }
    
    public static void listaKiir(List<KiallitasiTargy> lista, String megjegyzes) {
        System.out.println(megjegyzes + ":");
        for (KiallitasiTargy kt : lista) {
            System.out.println("\t" + kt);
        }
    }

}
