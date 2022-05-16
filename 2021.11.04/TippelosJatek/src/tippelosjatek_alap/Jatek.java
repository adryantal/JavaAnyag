package tippelosjatek_alap;

import java.util.Random;

public class Jatek {
    
    void start(){
        System.out.println("gondoltam egy számra, 0 és 9 között...");
        Random rnd = new Random();
        int szam = rnd.nextInt(10);
        
        Jatekos j1 = new Jatekos();
        Jatekos j2 = new Jatekos();
        Jatekos j3 = new Jatekos();
        
        boolean vanNyertes;
        boolean jo1, jo2, jo3;
        do {            
            System.out.println("A kitalálandó szám: " + szam);

            j1.tippel();
            j2.tippel();
            j3.tippel();
            
            int tipp1 = j1.tipp;
            int tipp2 = j2.tipp;
            int tipp3 = j3.tipp;
            System.out.println("1. játékos tippje: " + tipp1);
            System.out.println("2. játékos tippje: " + tipp2);
            System.out.println("3. játékos tippje: " + tipp3);
            
            jo1 = tipp1 == szam;
            jo2 = tipp2 == szam;
            jo3 = tipp3 == szam;
            vanNyertes = jo1 || jo2 || jo3;
            
            if (!vanNyertes) {
                System.out.println("A játékosok újra próbálkoznak");
            }
        }while (!vanNyertes);
               
        System.out.println("Van nyertes!");
        System.out.println("1. játékos tippje: " + jo1);
        System.out.println("2. játékos tippje: " + jo2);
        System.out.println("3. játékos tippje: " + jo3);
    }
}
