package feladat;

/* EGYSÉGBEZÁRÁS */
class Teglalap06{
    /* ADATTAGOK */
    private int a, b;
    
    /* TAGFÜGGVÉNYEK */
    //KONSTRUKTOROK
    public Teglalap06(){
        this(1);//ez az 1 paraméterest hívja  --> tulajdonképp ad neki egy a=1 default értéket, majd a meghívott konstruktor 2*a=2 default értékkel "létrehozza" a másik oldalt
        //this(1,2);//ez a 2 paraméterest hívja
    }
    
    public Teglalap06(int a){
        /* ez nem jó: */
        //this.a = a;
        //this.b = a*2;
        
        /* 1.: */
        this(a, 2*a);
        
        /* 2.: */
        //setA(a);
        //setB(this.a * 2);
    }
    
    public Teglalap06(int a, int b){
        setA(a);
        setB(b);
    }
    
    //GETTER
    public int getA(){return a; }
    public int getB(){return b; }
    
    // SETTEREK
    public void setA(int a){
        if(a < 1){ a = 1; }
        this.a = a;
    }
    
    public void setB(int b){
        if(b < 1){ b = 1; }
        this.b = b;
    }
    
    //SAJÁT
    public void info(){
        System.out.printf("a: %d, b: %d\n",a,b);
    }
}

public class TeglalapProgram06 {
    public static void main(String[] args) {
        System.out.println("Téglalapok");
        Teglalap06 t = new Teglalap06(1,2);
        System.out.println("Téglalap 1,2 paraméterrel:");
        t.info();
        
        System.out.println("Téglalap a:-2 paraméterrel:");
        Teglalap06 t2 = new Teglalap06(-2);
        t2.info();
        
        System.out.println("Téglalap paraméter nélkül:");
        Teglalap06 t3 = new Teglalap06();
        t3.info();
    }
}
