
package modell;


public abstract class Ember{
    
    private String nev;
    private int kor;

    protected Ember(String nev, int kor) {
        this.nev = nev;
        this.kor = kor;
    }

    public String getNev() {
        return nev;
    }

    public int getKor() {
        return kor;
    }

    
    
       /*SAJÁT KIEGÉSZÍTÉS*/
    @Override
    public String toString() {
        return "Ember{" + "nev=" + nev + ", kor=" + kor + '}';
    }
    
        
    
    
}
