
package staticmukodes;


public class StaticMukodes {
    
    static int staticInt = 100;
    
    static{ //statikus konstruktor
    staticInt = 100;
    }
    //előbb a statikus dolgok hajtódnak végre
    
    int peldanyInt;
    
    
//    static void hibasPeldanySetter(){ //hibás, mert az osztály nem éri el az objektumot, mert lehet, h. még nincs példány
//        peldanyInt=12;
//    }
    
    static void hibasPeldanySetter(){
    
    }

    StaticMukodes(int peldanyInt) {
        staticInt = 50; //a példány hozzáfér a statichoz
        this.peldanyInt = peldanyInt;
    }

    @Override
    public String toString() {
        return "StaticMukodes{" + "peldanyInt=" + peldanyInt + '}';
    }
    
    


    public static void main(String[] args) {
        
        int temp = 7;
        StaticMukodes s1 = new StaticMukodes(10);
        StaticMukodes s2 = new StaticMukodes(-5);
        System.out.println(s1 );
    }
    
}
