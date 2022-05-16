package kivetelkezeles55;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Finally {

    public static void main(String[] args) {

        /*FINALLY*/
        Scanner scanner = null;
//      fontos: ha metódust írunk, akkor a scannert mindig metóduson kívül hozzuk létre/deklaráljuk, sosem azon belül!!
//      különben a metódus feladata lenne lezárni is az erőforrást, ha viszont bezárjuk azt, akkor többé már nem tudjuk megnyitni
        try {
            scanner = new Scanner(System.in);
            System.out.println("Kérem, adjon meg egy számot! ");
            int userSpecifiedNumber = scanner.nextInt(); //beolvasunk egy int számot, amelyet a user megad
            scanner.nextLine(); //új sor karaktert kiszedi (pl. ha Enter-t ütött a felhasználó
            System.out.println("A megadott szám: " + userSpecifiedNumber);
            //a scanner erőforrás, le kell zárni használat után, hogy visszaadhassuk az operációs rendszernek az erőforrást
            //ezért fontos, hogy az esetlegesen felmerülő kivételek le legyenek kezelve, nehogy a close metódust kikerülje a program

        } catch (InputMismatchException i) {
            System.err.println("A megadott adat nem egész szám.");
        } finally {
            if (scanner != null) {
                scanner.close(); //ha null-értékű scanneren akarjuk a close metódust végrehajtani, akkor nullpointerException-t kapunk!!!
            }

        }
    }

}

//ez volt a legelső változat:
/*
    Scanner scanner = new Scanner(System.in); //system in csatornát csomagoltuk be
    System.out.println("Kérem, adjon meg egy számot! ");
    int userSpecifiedNumber = scanner.nextInt(); //beolvasunk egy int számot, amelyet a user megad
    scanner.nextLine(); //új sor karaktert kiszedi (pl. ha Enter-t ütött a felhasználó
    System.out.println("A megadott szám: " + userSpecifiedNumber);
    
    //a scanner erőforrás, le kell zárni használat után, hogy visszaadhassuk az operációs rendszernek az erőforrást
    //ezért fontos, hogy az esetlegesen felmerülő kivételek le legyenek kezelve, nehogy a close metódust kikerülje a program
    scanner.close();


*/
