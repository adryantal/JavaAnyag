package idomok;

public class Hasab extends FaIdom{

    private double a,b, magassag;
    
    /* Generált ALT + INSERT */
    @Override
    public double terfogat() {
        //𝑻(alaplap)⋅𝒎
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Hasab(double a, double b, double magassag) {
        this.a = a;
        this.b = b;
        this.magassag = magassag;
    }

    @Override
    public String toString() {
        return "Hasab{" + "a=" + a + ", b=" + b + ", magassag=" + magassag + '}';
    }
}
