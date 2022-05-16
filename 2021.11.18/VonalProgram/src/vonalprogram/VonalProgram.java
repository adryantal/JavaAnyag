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
        
        Vonal v3 = new Vonal(15, 5, "szaggatott");
        v3.info();
        v3.rajzol();
        
        Vonal v4_1 = new Vonal(10, 8, "pont", "piros");
        v4_1.info();
        v4_1.rajzol();
        
        Vonal v4_2 = new Vonal(10, 8, "dupla", "zöld");
        v4_2.info();
        v4_2.rajzol();
        
        Vonal rossz;
        //rossz = new Vonal(10, 0, "Szagatot");
        rossz = new Vonal(10, 0, Vonal.SZAGGATOTT);
        
        /* nincs Tipusok at fogadó konstruktor */
        //rossz = new Vonal(10, 0, Vonal.Tipusok.SZAGGATOTT);
        rossz.info();
        rossz.rajzol();
    }
    
}
