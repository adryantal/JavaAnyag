package bankkartyaprogram;

import java.util.Arrays;
import java.util.Collections;

/* HF:
Minden kártyának van tuladjonosa, aki String név
Tudjuk rendezni tulajdonos neve szerint is a kártyákat!
De maradjon  meg az egyenleg szerinti alapértelmezett rendezési szempont
Extra: minden kártyának legyen egyedi azonosítója
akor azonos 2 kártya, ha megegyezik az azonosítójuk, ami nem forduéhat elp
*/
public class BankKartyaProgram {
    public static void main(String[] args) {
       BankKartya[] kartyak = new BankKartya[3];
       kartyak[0] = new JuniorBankKartya(123);
       kartyak[1] = new VisaBankKartya(135);
       kartyak[2] = new JuniorBankKartya(113);
       
        System.out.println("--- növekvő ---");   // egyenleg alapján növ.
        Arrays.sort(kartyak);
        for (BankKartya bankKartya : kartyak) {  
            System.out.println(bankKartya);
        }
        
        System.out.println("\n--- csökkenő ---");
       Arrays.sort(kartyak, Collections.reverseOrder()); // egyenleg alapján csökk.
        for (BankKartya bankKartya : kartyak) {
            System.out.println(bankKartya);
        }
    }
    
}
