package feladat;

class Teglalap04{
    private int a, b;
    
    public Teglalap04(int a, int b){
        if(a < 1){ a = 1; }
        this.a = a;
        
        if(b < 1){ b = 1; }
        this.b = b;
    }
    
    public void setA(int a){
        this.a = a;
    }
    
    public void setB(int b){
        this.b = b;
    }
    
    public void info(){
        System.out.printf("a: %d, b: %d\n",a,b);
    }
}

public class TeglalapProgram04 {
    public static void main(String[] args) {
        System.out.println("Téglalapok");
        //Teglalap02 t = new Teglalap02();
        Teglalap04 t = new Teglalap04(1,2);
        //t.a = 2;//private miatt nem elérhető
        System.out.println("Téglalap 1,2 paraméterrel:");
        t.info();
        System.out.println("set a: -2, b: -3");
        t.setA(-2);
        t.setB(-3);
        t.info();
        
        System.out.println("Téglalap -1,-2 paraméterrel:");
        Teglalap04 t2 = new Teglalap04(-1,-2);
        t2.info();
        System.out.println("set a: -20, b: -30");
        t2.setA(-20);
        t2.setB(-30);
        t2.info();
    }
}
