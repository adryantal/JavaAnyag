package masolas;

import java.util.UUID;

public class AutoProgram {
    public static void main(String[] args) throws CloneNotSupportedException {
        Auto a1 = new Auto(2000, "VW");
        Auto a2 = (Auto)a1.clone();
       
         System.out.println("Eredeti verzió:");
        System.out.println("a1: " + a1);
        System.out.println("a2: " + a2);
        
        a1.id = UUID.randomUUID();
        a2.ev = 2001;
        a2.marka = "BMW";
        
        System.out.println("\nMódosított verzió:");
        System.out.println("a1: " + a1);
        System.out.println("a2: " + a2);
    }
}
