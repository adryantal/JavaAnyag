//kivételek: lekezelhetőek; ha le vannak kezelve, nem áll le a program futása (pl. tömb túlindexelése)
//hiba: súlyosabb, a program leáll, nem tud magához térni (pl. áramszünet, elfogy a memória)
//stack:az a memóriaterület, ahol leköveti a JVM, hogy melyik metódus melyiket hívta meg 
//stackoverflow error: pl. ha egy metóduus túl sokszor hívja meg önmagát
//Throwable ősosztályból származik az Exception és az Error osztály is
//ellenőrzött kivételek: a fordító is ellenőrzi (Throwable, Exception és KÖZVETLEN leszármazottjai)
//nem ellenőrzött kivételek: futási időben "keletkeznek", nem szól róluk a fordító - pl. RuntimeException és leszármazottjai, pl. InputMismatchException 
//(ill. az Error is futási időben keletkezik)
//a nem ellenőrzött kivételek lekezelése felől mi döntünk
//érdemes átolvasni a kapcsolódó JAVADOC leírásokat


package kivetelkezeles54;

public class KivetelkezelesAlapok {

    public static void main(String[] args) {
        //main(args); //végtelen rekurzió - StackOverflowError
        try {
            System.out.println("Hello");
             System.out.println(13/0); //java.lang.ArithmeticException
            int[] numbers = new int[100];
            System.out.println(numbers[100]); //ArrayIndexOutOfBoundsException (futási időben derül ki --> runtime exception)
            //int[][][] numbers2 = new int[1_000_000][1_000_000][1_000_000]; //OutOfMemoryError: Java heap space --> betelt a memóriaterület, ahol az objektumok tárolódnak (heap)
           
            System.out.println("Viszlát!");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Hiba történt, a program leáll.");
        }
        catch (ArithmeticException e) {
            System.out.println("0-val nem oszthatunk.");
        }
        finally{
            System.out.println("Ez mindenképp lefut!");
            //pl. adatbáziskezelésnél a kapcsolat lezásárát mindenképp végre kell hajtani, akár sikerült elérni a távoli adatbázist, akár kivétel keletkezett közben
        }
         System.out.println("Bye!");
    }

}
