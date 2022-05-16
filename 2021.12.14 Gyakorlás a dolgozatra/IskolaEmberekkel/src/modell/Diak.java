
package modell;

public class Diak extends Ember {
    
    double atlag;

    public Diak(String nev, int kor, double atlag) {
        this(nev, kor);
        this.atlag = atlag;
    }

    public Diak(String nev, int kor) {
        super(nev, kor);
       
    }

    public double getAtlag() {
        return atlag;
    }

    public void setAtlag(double atlag) {
        this.atlag = atlag;
    }
    
    
    
    
    
    
}
