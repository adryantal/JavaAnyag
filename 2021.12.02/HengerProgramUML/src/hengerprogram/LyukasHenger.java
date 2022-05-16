package hengerprogram;
public class LyukasHenger extends TomorHenger{
    private double falvastagsag;

    public LyukasHenger(double r, double m, double falvastagsag) {
        this(r, m, 1, falvastagsag);
    }

    public LyukasHenger(double r, double m, double fajsuly, double falvastagsag) {
        super(r, m, fajsuly);
        this.falvastagsag = falvastagsag; //az ős konstruktorához képest ez "plussz" változó, külön inicializálni kell
    }

    @Override
    public String toString() {
        return "LyukasHenger{" + "falvastagsag=" + falvastagsag + '}';
    }

    @Override
    public double terfogat() {
        return super.terfogat();
    }
    
    
}
