package kivetelkezeles56;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HaziFeladat {

    public static void main(String[] args) {

        //fontos: ha metódust írunk, akkor a scannert mindig metóduson kívül hozzuk létre/deklaráljuk, sosem azon belül!!
        //különben a metódus feladata lenne lezárni is az erőforrást, ha viszont bezárjuk azt, akkor többé már nem tudjuk megnyitni
        //a try-with-resources használatával a scanner lezárását biztosítja a JVM, tehát érdemes ezt a formát követni:
        try (Scanner scanner = new Scanner(System.in)) {
            int userProvidedNumber = readInt("Kérem, adjon meg egy egész számot: ", scanner);
            System.out.println("A felhasználó által megadott szám: " + userProvidedNumber);
        }

    }

    static int readInt(String askMessage, Scanner scanner) {
        int number = 0;
        boolean inputCorrect;
        System.out.println(askMessage);
        do{
        inputCorrect = true;    
        try {
             number = scanner.nextInt();
        } catch (InputMismatchException i) {
            System.err.println("Ez nem egy érvényes egész szám. Adjon meg egy egész számot: ");
            inputCorrect=false;
        }finally{
         scanner.nextLine(); //akár keletkezett kivétel, akár nem, szexjük le az inputon maradó, várakozó karaktereket
        }
        }while(!inputCorrect);
        return number;

    }
}
