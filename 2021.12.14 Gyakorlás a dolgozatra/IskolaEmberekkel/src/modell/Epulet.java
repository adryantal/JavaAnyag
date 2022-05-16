
package modell;


public abstract class Epulet {
    
    private boolean biztonsagos;

    public Epulet(boolean biztonsagos) {
        this.biztonsagos = biztonsagos;
    }

    
    /*SAJÁT KIEGÉSZÍTÉS*/
    
    public boolean isBiztonsagos() {
        return biztonsagos;
    }


 
    
    
}
