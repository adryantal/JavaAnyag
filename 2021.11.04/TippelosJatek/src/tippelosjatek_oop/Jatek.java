package tippelosjatek_oop;

import java.util.Random;

public class Jatek {
    
    Random rnd = new Random();
    Jatekos j1 = new Jatekos();
    Jatekos j2 = new Jatekos();
    Jatekos j3 = new Jatekos();
    
    final static int FELSO_ERTEK = 10;
    
    int szam;
    
    boolean jo1, jo2, jo3;
    
    void start(){
        szam = kitalalandoSzam();
        boolean vanNyertes;
        do {            
            System.out.println("A kitalálandó szám: " + szam);

            jatekosokTippelnek();
            
            vanNyertes = vizsgal();// vanNyertes = (jo1 || jo2 || jo3);
            
            if (!vanNyertes) {
                System.out.println("A játékosok újra próbálkoznak");
            }
        }while (!vanNyertes); //addig fusson, amíg vki nem nyer
               
        vege();  //akkor van vége, ha van nyertes
    }

    boolean vizsgal(){
        return jo1 || jo2 || jo3; //ha vmelyik közül legalább az egyik megegyezik a kitalálandó számmal
    }
    
    void jatekosokTippelnek(){
        j1.tippel();
        j2.tippel();
        j3.tippel();
        
        int tipp1, tipp2, tipp3;
        
        tipp1 = j1.tipp;
        tipp2 = j2.tipp;
        tipp3 = j3.tipp;
        
        jo1 = tipp1 == szam; //ha megegyezik a kitalálandó számmal
        jo2 = tipp2 == szam;
        jo3 = tipp3 == szam;
        
        System.out.println("1. játékos tippje: " + tipp1);
        System.out.println("2. játékos tippje: " + tipp2);
        System.out.println("3. játékos tippje: " + tipp3);
    }
    
    void vege() {
        System.out.println("Van nyertes!");
        System.out.println("1. játékos tippje: " + jo1);
        System.out.println("2. játékos tippje: " + jo2);
        System.out.println("3. játékos tippje: " + jo3);
    }

    int kitalalandoSzam() {
        System.out.println("gondoltam egy számra, 0 és 9 között...");
        int szam = rnd.nextInt(10);
        return szam;
    }
}
