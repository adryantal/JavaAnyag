
package berendezoprogram;

public class Szoba {
    private Asztal asztal;
    private Redony elsoRedony, hatsoRedony;

    public Szoba(Redony elsoRedony, Redony hatsoRedony, Asztal asztal) {
        //asztal = new Asztal(1,1);
        this.asztal = asztal;
        //redony1 = new Redony(3,4);
        //redony1 = new Redony(4,5);
        this.elsoRedony=elsoRedony;
        this.hatsoRedony=hatsoRedony;
        
        
    }

    public Redony getElsoRedony() {      return elsoRedony;
    }

    public Redony getHatsoRedony() {      return hatsoRedony;    }

    public Asztal getAsztal() {
        return asztal;
    }
    

    public void mindenRedonytLeenged(){
    elsoRedony.leenged(elsoRedony.getMag());
     hatsoRedony.leenged(hatsoRedony.getMag());
            }
    
    
    public void mindenRedonytFelhuz(){
    elsoRedony.felhuz();
     hatsoRedony.felhuz();
            }

    @Override
    public String toString() {
        return "Szoba{" + "\n\tasztal=" + asztal + ", \n\telsoRedony=" + elsoRedony + ", \n\thatsoRedony=" + hatsoRedony +'\n'+ '}';
    }
    
    
    public void mindenRedonytLeenged(int aktMag){
    elsoRedony.leenged(aktMag);
     hatsoRedony.leenged(aktMag);
            }
    
}
