package vonalprogram;

public class VonalProgram {
    public static void main(String[] args) {
        Vonal v0 = new Vonal();
        v0.info();
        v0.rajzol();
        
        Vonal v1 = new Vonal(5);
        v1.info();
        v1.rajzol();
        
        Vonal v2 = new Vonal(5, 3);
        v2.info();
        v2.rajzol();
        
        Vonal v3 = new Vonal(15, 5, Vonal.Tipusok.SZAGGATOTT);
        v3.info();
        v3.rajzol();
        
        Vonal v4_1 = new Vonal(10, 8, Vonal.Tipusok.SZAGGATOTT, "piros");
        v4_1.info();
        v4_1.rajzol();
        
        Vonal v4_2 = new Vonal(10, 8, Vonal.Tipusok.SZAGGATOTT, "zöld");
        v4_2.info();
        v4_2.rajzol();
        
        Vonal elirtTipusuVonal;
        //elirtTipusuVonal = new Vonal(10, 0, "Szagatot");
        elirtTipusuVonal = new Vonal(10, 0, Vonal.Tipusok.SZAGGATOTT);
        
        /* nincs Tipusok at fogadó konstruktor */
        //elirtTipusuVonal = new Vonal(10, 0, Vonal.Tipusok.SZAGGATOTT);
        elirtTipusuVonal.info();
        elirtTipusuVonal.rajzol();
    }
    
}
