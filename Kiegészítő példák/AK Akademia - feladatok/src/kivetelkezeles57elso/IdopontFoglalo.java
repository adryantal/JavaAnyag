/*
orvosi rendelő időpontfoglaló szoftver
lefoglalunk egy napot, amikor pl. az orvosnak továbbképzésre kell mennie
meg kell adnunk, melyik nap megy továbbképzésre
pl. hétvége kizárva, ill. péntek is foglalt nap
*/

package kivetelkezeles57elso;

import java.util.logging.Level;
import java.util.logging.Logger;

public class IdopontFoglalo {

    public static void main(String[] args) throws InvalidDayException {
        try {
            //1 - hétfő .. 7 - vasárnap -->ezek a legális értékek
            reserveDay(6);   //innen már ne dobjuk tovább, mert nem akarjuk, hogy a program kivétellel térjen vissza
        } catch (DayIsOnWeekendException ex2 ) {
            System.err.println("A küvetkező hiba lépett elő az időpontfoglalás közben: " + ex2.getMessage());

        } catch (/*DayOutOfBoundsException | DayIsAFridayException ex*/ InvalidDayException ex) { //multicatch
            System.err.println(ex.getMessage());
        } 
      //NAGYON FONTOS: MINDIG a legspeciálisabb kivételek (hierarchia esetén az utódok) kerüljenek legfelülre
      //különben - fordított esetben - ha az ősosztály blokkja lett kezelve elsőnek, az utódosztály blokkjáig már nem jut el a vezérlés, és hibára fut a program
    }

    static void reserveDay(int dayOfWeek) throws InvalidDayException 
            /*DayOutOfBoundsException, DayIsOnWeekendException, DayIsAFridayException */ { //1-7, melyik napot szeretné lefoglalni
        if (dayOfWeek < 1 || dayOfWeek > 7) {
            //ha kivételt akarok dobni: begépelem a throw kulcsszót, majd példányosítom a használni kívánt kivételosztályt
            throw new DayOutOfBoundsException("A nap kívül esik az érvényes tartományon: (1-7)");
            //továbbdobjuk, mivel egy jelzés a hívó félnek (main metódus), hogy kivételes helyzet állt elő
            //azért dobjuk tovább, hogy azonnali hatállyal vissza tudjunk térni a hívási helyre (main)
            //a main metódusban fogjuk majd lekezelni    
        }
        if (dayOfWeek == 6 || dayOfWeek == 7) {
            throw new DayIsOnWeekendException("A megadott nap hétvégére esik!");
        }
         if (dayOfWeek == 5) {
            throw new DayIsAFridayException("A megadott nap egy péntek!");
        }
    }

}
