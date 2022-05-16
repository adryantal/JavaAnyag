package masolas;

import java.util.UUID;

public class Auto implements Cloneable{ //Cloneable: marker interfész, nincs metódusa
    int ev;
    String marka;
    UUID id;

    public Auto(int ev, String marka) {
        this.ev = ev;
        this.marka = marka;
        id = UUID.randomUUID();
    }

    @Override
    public String toString() {
        return "Auto{" + "ev=" + ev + ", marka=" + marka + ", id=" + id + '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        /* sekély másolat: a referencia - UUID - nem kerül másolásra, csak a primitív adattípusok értékei --> UUID is egy osztály, tehát objektum/referencia típus*/
        //return super.clone();  //az UUID ugyanaz marad
        
     
        /* mély másolat: meg kell írni, hogy minden referenciából adjunk vissza újat */
        //külön meg kell adni, hogy új objektum/példány jöjjön létre (new), és annak új UID-ja legyen
        Auto auto = new Auto(ev, marka); 
        auto.id = UUID.randomUUID(); //a másolatnak már más lesz az UUID-ja, mint az eredetinek
        return auto;
    }
    
    /*Sekély másolat: csak a primitív adattagok értékei másolódnak át; ha az eredeti objektum egy v. több adattagja referenciatípus (azaz objektum),
    akkor annak csak a mutatója másolódik, így a másolat objektumban található mutató ugyanarra az alobjektumra(memóriaterületre) mutat, mint az eredeti objektum ugyanazon adattagjának mutatója
    . A hivatkozott objektumokon történt változtatások mind az eredetiben, mind a másolatban megjelennek, mivel a hivatkozott objektumról nem készült másolat.*/
    /*Mély másolat: Mély másolatban az érték szerint tárolt mezők az eddigiekhez hasonlóan másolódnak, de a hivatkozásként tárolt objektumok mutatói nem másolódnak. 
    Ehelyett mély másolatot készít a hivatkozott (al-)objektumokból, melyekre mutatókat tárol az új objektumban. 
    A hivatkozott objektumokon végrehajtott bármilyen változás nem érinti az objektum más példányait.    */
    
}
