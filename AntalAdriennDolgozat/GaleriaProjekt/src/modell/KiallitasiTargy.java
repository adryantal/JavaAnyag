package modell;

import java.io.Serializable;
import java.text.Collator;
import java.util.Comparator;
import java.util.Date;

public abstract class KiallitasiTargy implements Serializable{

    private Date letreDatum;
    private String keszito, cim;
    private static Date today = new Date();

    public KiallitasiTargy(Date letreDatum, String keszito, String cim) throws InvalidDateException {
        if (letreDatum.after(today)) {//ha a mai napnál későbbi dátumot adunk meg, dobjon kivételt
            throw new InvalidDateException("Helytelen dátum!");
        } else {
            this.letreDatum = letreDatum;
        }
        this.keszito = keszito;
        this.cim = cim;
    }

    public KiallitasiTargy(String keszito, String cim) throws InvalidDateException {
        this(today, keszito, cim);
    }

    public Date getLetreDatum() {
        return letreDatum;
    }

    public String getKeszito() {
        return keszito;
    }

    public String getCim() {
        return cim;
    }

    public static Date getToday() {
        return today;
    } 
    
  /*STATIKUS RENDEZŐMETÓDUSOK -  - ATTRIBÚTUMOK SZERINTI RENDEZÉSHEZ, COMPARATOR OSZTÁLYOK FELHASZNÁLÁSÁVAL*/
    public static KeszitoComparator KeszitoRendezo() {
        return new KeszitoComparator();
    }

    public static CimComparator CimRendezo() {
        return new CimComparator();
    }

    @Override
    public String toString() {
        return "letreDatum = " + letreDatum + ", keszito = " + keszito + ", cim = " + cim ;
    }
    
    
    

}


/*COMPARATOR OSZTÁLYOK - ATTRIBÚTUMOK SZERINTI RENDEZÉSHEZ*/
class KeszitoComparator implements Comparator<KiallitasiTargy> {

    @Override
    public int compare(KiallitasiTargy k1, KiallitasiTargy k2) {
        Collator col = Collator.getInstance();
        return col.compare(k1.getKeszito(), k2.getKeszito());
    }
}

class CimComparator implements Comparator<KiallitasiTargy> {

    @Override
    public int compare(KiallitasiTargy k1, KiallitasiTargy k2) {
        Collator col = Collator.getInstance();
        return col.compare(k1.getCim(), k2.getCim());
    }
}
