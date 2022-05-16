package idomok;

public class Gomb extends FaIdom{
    private double sugar;

    /* Generált ALT + INSERT */
    @Override
    public double terfogat() {
        //4*r^3*pi/3
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Gomb(double sugar) {
        this.sugar = sugar;
    }

    @Override
    public String toString() {
        return "Gomb{" + "sugar=" + sugar + '}';
    }
}
