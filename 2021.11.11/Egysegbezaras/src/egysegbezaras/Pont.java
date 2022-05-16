package egysegbezaras;
public class Pont {
    int x, y;
    
    double tavOrigotol(){
        return Math.sqrt(x*x+y*y);
    }
    
    boolean fedi(Pont masik){
        return x == masik.x && y == masik.y;
    }
    
    void info(){
        System.out.printf("Pont{x=%d, y=%d}\n", x, y);
    }
}
