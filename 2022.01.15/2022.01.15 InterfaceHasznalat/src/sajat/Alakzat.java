package sajat;
public abstract class Alakzat {
    String nev;//láthatóság: package

    public Alakzat(String nev) {
        this.nev = nev;
    }
    
    public abstract void rajzol();

    @Override
    public String toString() {
        return "Alakzat{" + "nev=" + nev + '}';
    }
}
