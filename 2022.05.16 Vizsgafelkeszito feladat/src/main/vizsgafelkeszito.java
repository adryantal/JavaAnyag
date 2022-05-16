package main;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import modell.Eszkoz;
import modell.Harcos;
import modell.Karakter;
import modell.InvalidNameException;
        
public class vizsgafelkeszito {

    
    public static void main(String[] args) {
        
          Harcos [] hTomb = new Harcos [3];
          String elvalaszto = "\n---------------------------------------------------\n";
        
        //Eszközök            
            Eszkoz e1 = new Eszkoz("Puska", 5.6);
            Eszkoz e2 = new Eszkoz("Gránát", 4);
            Eszkoz e3 = new Eszkoz("Kard", 3);
            Eszkoz e4 = new Eszkoz("Tőr", 0.5);
            Eszkoz e5 = new Eszkoz("Ágyú", 50);
        
        try {   
            //Harcosok            
            Harcos h1 = new Harcos("Harcos1",8,8);
            h1.felvesz(e5);
            h1.felvesz(e4);
            h1.felvesz(e2);
            h1.felvesz(e1);
            System.out.println(h1.toString());
            h1.eldob(e2);
            System.out.println(h1.toString());
            h1.eldob(0);
            System.out.println(h1.toString());
            
            Harcos h2 = new Harcos("Harcos2", "Godzilla", 10, 9);
           // Harcos h3 = new Harcos("H3",4,5); //kivételt dob
            Harcos h4 = new Harcos("Harcos4","Vadmacska",4,3);
            
            
            System.out.print(elvalaszto);
            
            
            
            //szerializáció/deszerializáció
             System.out.print("Szerializáció/deszerializáció:\n");
            h1.allapotMentes("allapotMentes.bin");      
            h1 = null;
            h1 = h1.allapotBeolvasas("allapotMentes.bin");
            System.out.println(h1.toString());
            
            
            System.out.print(elvalaszto);
            
           
            //tömbkezelés
            
            
            hTomb[0]=h1;
            hTomb[1]=h2;
            hTomb[2]=h4;            
            System.out.print("Erő szerinti rendezés:\n");
            Arrays.sort(hTomb, Harcos.EroRendezo());
            for (int i = 0; i < hTomb.length; i++) {
                System.out.println(hTomb[i].toString());               
            }
            System.out.print(elvalaszto);
            System.out.print("Ügyesség szerinti rendezés:\n");
            Arrays.sort(hTomb, Harcos.UgyessegRendezo());
            for (int i = 0; i < hTomb.length; i++) {
                System.out.println(hTomb[i].toString());               
            }
            
            
            
        } catch (InvalidNameException ex) {
            Logger.getLogger(vizsgafelkeszito.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
           
        
    }
    
}
