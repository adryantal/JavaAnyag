
package kivetelkezeles56;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class EllenorzottKivetel {
    
     public static void main(String[] args) throws InterruptedException, IOException {
         
       printSomethingSlowly();        
       
       //itt is vagy le kell kezelni, vagy deklarálni kell! 
       
       //egyik megoldás: declare --> add clause-t, tehát a main metódus is tud InterruptedException-t és IOException-t dobni
     
        printSomethingSlowly2();
        
        //másik megoldás: helyben történő lekezelés:         
        /*
        try{
            printSomethingSlowly2();
        } catch (InterruptedException ex) {
            System.out.println("A lassú kiiratás nem sikerült");
         }
        */
     }
     //handle or declare rule
     
     /*HANDLE, helyileg történő lekezelés --> surround with try-catch block  */
     static void printSomethingSlowly(){
         System.out.println("Az");
         try {             
             Thread.sleep(1_000L); //föléviszem az egeret: tud dobni InterruptedException-t; ellenőrzött kivétel, mert közvetlenül az Exception-ből szárm. 
                                   //mivel tud InterruptedException-t dobni --> használhatom a sorround with try-catch block-ot                 
         } catch (InterruptedException ex) {
            System.out.println("Várakozás megszakítva");
         }
         System.out.println("üzenet");
     }
     
     /*DECLARE, tovább dobom --> add clause*/
     static void printSomethingSlowly2() throws InterruptedException, IOException{ //felsorakoztathatunk ellenőrzött kivételneveket, vesszővel elválasztva (az IOException-t mi adtuk hozzá)
         //2féleképp tud befejeződni a metódus: vagy normál módon, vagy a felsorolt Exception-ökkel
         System.out.println("Az");
         Thread.sleep(1_000L);
         System.out.println("üzenet");
     }
     
    
}
