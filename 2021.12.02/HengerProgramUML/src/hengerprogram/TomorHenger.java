package hengerprogram;
public class TomorHenger extends Henger{
    private double fajsuly;

    public TomorHenger(double r, double m) {
        this(r, m, 1);
    }

    public TomorHenger(double r, double m, double fajsuly) {
        super(r, m);
        this.fajsuly = fajsuly;
    }

    public double getFajsuly() { return fajsuly; }

    @Override
    public String toString() {
        return "TomorHenger{" + "fajsuly=" + fajsuly + '}';
    }
    
    public double suly(){
        return 0;
    }
}
