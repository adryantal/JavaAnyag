package idomok;

public abstract class FaIdom {
    private static double fajsuly = 0.8;
    
    public abstract double terfogat();
    
    public double suly(){
        return fajsuly * terfogat();
    }
    
    /* Generált ALT + INSERT */
    @Override
    public String toString() {
        return super.toString();
    }
    
}
