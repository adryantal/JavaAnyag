package staticmukodes;
public class StaticMukodes {
    
    static int staticInt;
    static {
        staticInt= 100;
    }
    
    int peldanyInt;

    static void hibasPeldanySetter(){
        /* a static (osztály) nem éri el az objektum dolgait
        mert lehet, hogy még nincs is példányosítva
        */
        //peldanyInt = 12;//hiba
    }
    
    StaticMukodes(int peldanyInt) {
        staticInt = 50;//a pld hozzáfér a static-hoz
        this.peldanyInt = peldanyInt;
    }
    
    public static void main(String[] args) {
        int temp = 7;
        StaticMukodes s1 = new StaticMukodes(10);
        StaticMukodes s2 = new StaticMukodes(-5);
    }
    
}
