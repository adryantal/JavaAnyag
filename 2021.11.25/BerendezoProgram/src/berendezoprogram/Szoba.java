package berendezoprogram;
public class Szoba {
    /* ADATTAGOK -rejtve a külvilág elől */
    private Asztal asztal;
    private Redony elsoRedony, hatsoRedony;

    /* TAGFÜGGVÉNYEK */
    /* GENERÁLT KÓD: ALT + INSERT */
    //cstr: minden adattagot inicializálnia kell
    public Szoba(Redony elso, Redony hatso, Asztal asztal) {
        this.asztal = asztal;
        this.elsoRedony = elso;
        this.hatsoRedony = hatso;
    }

    public Redony getElsoRedony() { return elsoRedony; }
    public Redony getHatsoRedony() { return hatsoRedony; }
    public Asztal getAsztal() { return asztal; }

    @Override
    public String toString() {
        return "Szoba{" 
                + "\n\tasztal=" + asztal 
                + "\n\telsoRedony=" + elsoRedony 
                + "\n\thatsoRedony=" + hatsoRedony 
                + "\n}";
    }
    
    /* SAJÁT */
    public void mindenRedonytLeenged(){ // a redőnyök TELJES leengedése
        elsoRedony.leenged(elsoRedony.getMag()); //getMag()-gal a teljes hosszúságát kérjük le egy redőnynek, tehát ameddig max. leengedhető
        hatsoRedony.leenged(hatsoRedony.getMag());
        
        /* ez valamilyen kódduplikálás, 
            ha módosítom a redőnyök tárolását, akkor 2 helyen kell
            átírni a kódot.
            A redőnyök nem egyforma magassak, de lehet
            egy nem szép megoldás:
            mindenRedonytLeenged(Integer.MAX_VALUE);
        */
        
    }
    
    public void mindenRedonytLeenged(int aktMag){ // a redőnyök egy bizonyos szintig (aktMag) történő leengedése
        elsoRedony.leenged(aktMag); 
        hatsoRedony.leenged(aktMag);
    }
    
    public void mindenRedonytFelhuz(){
        elsoRedony.felhuz();
        hatsoRedony.felhuz();
    }
}
