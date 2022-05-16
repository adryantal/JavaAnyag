package feladat;

class Teglalap03{
    private int a, b;
    
    public Teglalap03(int a, int b){
        if(a < 1){ a = 1; }
        this.a = a;
        
        if(b < 1){ b = 1; }
        this.b = b;
    }
    
    public void info(){
        System.out.printf("a: %d, b: %d\n",a,b);
    }
}

public class TeglalapProgram03 {
    public static void main(String[] args) {
        System.out.println("Téglalapok");
        //Teglalap02 t = new Teglalap02();
        Teglalap03 t = new Teglalap03(1,2);
        //t.a = 2;//private miatt nem elérhető
        System.out.println("Téglalap 1,2 paraméterrel:");
        t.info();
        
        System.out.println("Téglalap -1,-2 paraméterrel:");
        Teglalap03 t2 = new Teglalap03(-1,-2);
        t2.info();
    }
}
