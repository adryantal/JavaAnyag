package feladat;

class Teglalap02{
    private int a, b;
    
    public Teglalap02(int a, int b){
        this.a = a;
        this.b = b;
    }
    
    public void info(){
        System.out.printf("a: %d, b: %d\n",a,b);
    }
}

public class TeglalapProgram02 {
    public static void main(String[] args) {
        //Teglalap02 t = new Teglalap02();
        Teglalap02 t = new Teglalap02(1,2);
        //t.a = 2;//private miatt nem elérhető
        t.info();
        
        Teglalap02 t2 = new Teglalap02(-1,-2);
        t2.info();
    }
}
