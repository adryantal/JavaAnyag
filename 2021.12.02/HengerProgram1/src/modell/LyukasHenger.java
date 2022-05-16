package modell;
public class LyukasHenger extends TomorHenger{
    private double falvastagsag;

    public LyukasHenger(double r, double m, double falvastagsag) {
        this(r, m, 1, falvastagsag); //a fajsuly-nak default értéket adtam
    }

    public LyukasHenger(double r, double m, double fajsuly, double falvastagsag) {
        super(r, m, fajsuly); //az ősosztálytól megörökli r-et, m-et és a fajsúlyt
        this.falvastagsag = falvastagsag; //de neki ezenkívül még lesz egy falvastagsag-a is, amelyet külön inicializálni kell
    }

    @Override
    public String toString() {
        String os = super.toString();
        return os + "\n\t\tLyukasHenger{" + "falvastagsag=" + falvastagsag + '}';
    }

     @Override
    public double terfogat() {
        Henger belsoHenger = new Henger(this.getR() - falvastagsag, this.getM());// a "belső", "levegőből álló" henger szemléltetésére hozzuk létre az új objektumot
        //Henger.setHengerDarab(2);
        Henger.setHengerDarabMinusEgy(); //ez a metódus azért kell, mert a terfogat fv. minden meghívásakor újra lefut a konstruktor, és ezáltal növeli a számlálót; ezt pedig "kompenzálni" kell 
        return super.terfogat() - belsoHenger.terfogat(); //a "cső" térfogata = "nagy" henger - belső henger; a nagy henger a tömörhenger, tehát az ős, ezért kell a super hivatkozás!!!
    }
    
}
