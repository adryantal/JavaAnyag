package sorrend;

public class Tanulo implements Comparable<Tanulo>{
    private String nev;
    private double atlag;

    public Tanulo(String nev, double atlag) {
        this.nev = nev;
        this.atlag = atlag;
    }

    public String getNev() {
        return nev;
    }

    public double getAtlag() {
        return atlag;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.atlag) ^ (Double.doubleToLongBits(this.atlag) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Tanulo other = (Tanulo) obj;
        if (Double.doubleToLongBits(this.atlag) != Double.doubleToLongBits(other.atlag)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Tanulo{" + "nev=" + nev + ", atlag=" + atlag + '}';
    }

    @Override //átlag alapján rendezünk
    public int compareTo(Tanulo masik) {
        return Double.compare(this.atlag, masik.atlag);
    }
}