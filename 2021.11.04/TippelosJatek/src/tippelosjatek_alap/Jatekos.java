package tippelosjatek_alap;

import java.util.Random;

public class Jatekos {
    int tipp;
    
    void tippel(){ 
        Random rnd = new Random();
        tipp = rnd.nextInt(10);
        System.out.println("tippelésem: " + tipp);
    }
}

//így a példányhoz van rendelve a new Random(), ami nem szerencsés