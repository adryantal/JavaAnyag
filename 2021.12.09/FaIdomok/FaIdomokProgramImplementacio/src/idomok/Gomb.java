package idomok;

public class Gomb extends FaIdom{
    private double sugar;

    /* Generált ALT + INSERT */
    @Override
    public double terfogat() {
        return 4*Math.pow(sugar, 3)*Math.PI/3;
    }

    public Gomb(double sugar) {
        this.sugar = sugar;
    }

    @Override
    public String toString() {
        return "Gomb{" + "sugar=" + sugar 
                + ", V=" + terfogat()
                + ", S=" + suly()
                + '}';
    }
}
