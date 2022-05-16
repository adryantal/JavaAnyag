
package modell;

public class Tanar extends Ember{
    
    private String targy;

    public Tanar(String nev, int kor, String targy) {
        super(nev, kor);
        this.targy = targy;
    }

    public String getTargy() {
        return targy;
    }

  
    public void tanit(Diak diak){
    
    
    }

    
       /*SAJÁT KIEGÉSZÍTÉS*/
    @Override
    public String toString() {
        String osToString = super.toString();
        return "Tanar{" + osToString+ "targy=" + targy + '}';
    }
    
    
    
    
    
}
