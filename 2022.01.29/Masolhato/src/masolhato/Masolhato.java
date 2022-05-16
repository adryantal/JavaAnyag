package masolhato;

import java.util.UUID;

class PontLeiro{
    String nev;
    UUID id;
    public PontLeiro(String nev) {
        this.nev = nev;
        id = UUID.randomUUID();
    }

    @Override
    public String toString() {
        return "PontLeiro{" + "nev=" + nev + ", id=" + id + '}';
    }
    
}

class Pont implements Cloneable{
    int x, y;
    PontLeiro info;
    
    public Pont(int x, int y) {
        this(x,y,"nincs neve");
        //this.x = x;
        //this.y = y;
        //info = new PontLeiro("nincs neve");
    }
    
    public Pont(int x, int y, String nev){
        this.x = x;
        this.y = y;
        info = new PontLeiro(nev);
    }
    
    @Override
    public String toString() {
        Object obj;
        return "Pont{" + "x=" + x + ", y=" + y 
                + ", infó: " + info
                + '}';
    }

    /* protected csak csomagban elérhető mindenkinek
     * külön csomagban csak az utód OSZTÁLY látja
     * a példány nem!
    */
    @Override
    public Object clone() throws CloneNotSupportedException {
        //sekély másolat: csak értékeket és referencia címet másol
        //return super.clone();
        
        /* mély másolat: a referenciák értékét is átmásolja,
         * de ezt nekünk kell megírni
        */
        //return new Pont(x, y);
        Pont p = new Pont(x, y);
        PontLeiro pl = new PontLeiro("itt sincs neve");
        p.info = pl;
        return p;
    }
 
}

public class Masolhato {
    public static void main(String[] args) throws CloneNotSupportedException {
        Pont p1 = new Pont(0, 0);
        Pont p2 = p1;
        p2.x = 25;
        System.out.println("p2.x = 25");
        System.out.println("p1:" + p1);
        System.out.println("p2:" + p2);
        
        Pont p3 = new Pont(10, 20);
        Pont p4 = (Pont)p3.clone();
        p4.y = 100;
        System.out.println("p4.y = 100;");
        System.out.println("p3:" + p3);
        System.out.println("p4:" + p4);
        
        Pont p5 = new Pont(35, 80, "P-5");
        Pont p6 = (Pont)p5.clone();
        p6.x = 100;
        p6.info.nev = "P-6";
        System.out.println("p6.info.nev = \"P-6\"");
        System.out.println("p5:" + p5);
        System.out.println("p6:" + p6);
    }
    
}
