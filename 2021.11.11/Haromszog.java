package egysegbezaras;
public class Haromszog {
    int a, b, c;
    
    /* ha nincs new akkor:
    NullPointerException
    */
    Pont kozep = new Pont();
    
    double kerulet(){
        return a + b + c;
    }
    
    double terulet(){
        double s = kerulet() / 2;
        return Math.sqrt(s * (s-a) * (s-b) * (s-c));
    }
    
    boolean szerkesztheto(){
        return a+b>c && a+c>b && b+c>a;
    }
    
    boolean derekszogu(){
        return c*c == a*a + b*b;
    }
    
    double tavOrigotol(){
        return kozep.tavOrigotol();
    }
    
    void info(){
        System.out.printf("Oldalak{a=%d, b=%d, c=%d}, közepe: ", a, b, c);
        kozep.info();
    }
}
