
package kivetelkezeles55;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryWithResources {
    
    public static void main(String[] args) {       
        
        
         /*TRY WITH RESOURCES*/
        
    //mivel a Scanner osztály megvalósítja a Closable/AutoClosable interface-t, ezért a try utáni zárójelekbe kerülhet a deklaráció: (Scanner scanner = new Scanner(System.in))
    //a try mögötti zárójelekbe csak olyan változókat deklarálhatunk, amelyek erőforrások, és megvalósítják az AutoClosable interface-t
    //érdemes elfogadni Netbeans által felajánlott convert to try-with-resources opciót:

    try (Scanner scanner2 = new Scanner(System.in) //system in csatornát csomagoltuk be
        ) {
            System.out.println("Kérem, adjon meg egy számot! ");
            int userSpecifiedNumber = scanner2.nextInt(); //ha pl. alma-t ad meg a user egész szám helyett: InputMismatchException keletkezik
            scanner2.nextLine(); //új sor karaktert kiszedi (pl. ha Enter-t ütött a felhasználó
            System.out.println("A megadott szám: " + userSpecifiedNumber);
            //a scanner erőforrás, le kell zárni használat után, hogy visszaadhassuk az operációs rendszernek az erőforrást
            //ezért fontos, hogy az esetlegesen felmerülő kivételek le legyenek kezelve, nehogy a close metódust kikerülje a program
            //a Closable / Autoclosable interfészt megvalósító erőforrások biztosan rendelkeznek egy close metódussal
            //a try-with-resources használatával a lezárás automatikusan biztosított
            //nincs szükség "extra" NullpointerExeption-vizsgálatra
        }catch(InputMismatchException i){
            System.err.println("Ez nem egy helyes input!");
        }
        
        System.out.println("Vége.");
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