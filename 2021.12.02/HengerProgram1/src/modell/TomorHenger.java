package modell;
public class TomorHenger extends Henger{
    private double fajsuly;

    public TomorHenger(double r, double m) {
        this(r, m, 1);  //a fajsúlynak kell adnom egy default értéket (1)
    }

    public TomorHenger(double r, double m, double fajsuly) {
        super(r, m); //az ősosztálytól megörökli r-et és m-et
        this.fajsuly = fajsuly; //de neki ezenkívül még lesz egy fajsúlya is, amelyet külön inicializálni kell
    }

    public double getFajsuly() { return fajsuly; }

    @Override
    public String toString() {
        String os = super.toString();
        return os + "\n\tTomorHenger{" + "fajsuly=" + fajsuly + '}';
    }
    
    public double suly(){
        return fajsuly * terfogat();
    }
}

