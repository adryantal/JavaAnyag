package jatek;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Program {



    public static void main(String[] args) {

        try {

            
            /*teszt*/
            // Jatek j1 = new LogikaiJatek(1); 
            
            
            
            Jatek j1 = new LogikaiJatek();
            
            Jatek j2 = new LogikaiJatek(10);           
            
            
            System.out.println(((LogikaiJatek)j1).toString());
            System.out.println(((LogikaiJatek)j2).toString());
            System.out.println("Játékok száma: "+ j2.getJatekDb());
            
        } catch (IllegalArgumentException e) {

            System.out.println(e.toString());
        }
        
        
       
        
       
          
    }
}
