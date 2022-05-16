package tippelosjatek_oop;

import java.util.Random;

public class Jatekos {
    int tipp;
    /* minden objektumnak van rnd változója */
    //Random rnd = new Random();
    
    /* Így már csak az osztálynak van rnd változója */
    /*a static előtaggal az osztályhoz rendelem a new Random()-ot, és nem a példányhoz*/
    static Random rnd = new Random();
    
    /* a new se metódusban se ciklusban ne legyen,
    ha megoldható
    */
    void tippel(){
        //Random rnd = new Random();
        //tipp = rnd.nextInt(10);
        //Jatek.felso = -8;
        tipp = rnd.nextInt(Jatek.FELSO_ERTEK);  //0-9
        System.out.println("tippelésem: " + tipp);
    }
}
