package konyvtar;

import java.io.Serializable;
import java.text.Collator;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

class SzerzoComparator implements Comparator<Konyv> {

    @Override
    public int compare(Konyv k1, Konyv k2) {
        Collator col = Collator.getInstance();
        return col.compare(k1.getSzerzo(), k2.getSzerzo());
    }

}

class KiadasiEvComparator implements Comparator<Konyv> {

    @Override
    public int compare(Konyv k1, Konyv k2) {
        return Integer.compare(k1.getKiadasiEv(), k2.getKiadasiEv());
    }

}

class ArComparator implements Comparator<Konyv> {

    @Override
    public int compare(Konyv k1, Konyv k2) {
        return Integer.compare(k1.getAr(), k2.getAr());
    }

}

class CimComparator implements Comparator<Konyv> {

    @Override
    public int compare(Konyv k1, Konyv k2) {
        Collator col = Collator.getInstance();
        return col.compare(k1.getCim(), k2.getCim());
    }

}

public class Konyv implements Comparator<Konyv>, Comparable<Konyv>, Serializable {

    private String cim, szerzo;
    private int kiadasiEv, ar;
    private transient UUID id;
    private static int kotetszam=1;
   

    public Konyv(String cim, String szerzo, int kiadasiEv, int ar) {
        this(cim + ";" + szerzo + ";" + kiadasiEv + ";" + ar);
        //UUID-t nem a konstruktorban adjuk, mivel nem szerializáljuk --> külön setter állítja elő
        this.kotetszam=kotetszam;
       
    }

    public Konyv(String sor) {
        String[] sorTomb = sor.split(";");
        this.cim = sorTomb[0].trim();
        this.szerzo = sorTomb[1].trim();
        this.kiadasiEv = Integer.parseInt(sorTomb[2].trim());
        this.ar = Integer.parseInt(sorTomb[3].trim());
        this.kotetszam=kotetszam;      
    }

    public String getCim() {
        return cim;
    }

    public String getSzerzo() {
        return szerzo;
    }

    public int getKiadasiEv() {
        return kiadasiEv;
    }

    public int getAr() {
        return ar;
    }

    
    public int getKotetszam() {
        return kotetszam;
    }
    
    
    public void setUjID() {
        this.id = UUID.randomUUID();
    }

    @Override
    public String toString() {
        return "Konyv{" + "cim=" + cim + ", szerzo=" + szerzo + ", kiadasiEv=" + kiadasiEv + ", ar=" + ar + ", id=" + id + ", kötetszám=" + this.kotetszam + '}';
    }

   

    public static SzerzoComparator SzerzoRendezo() {
        return new SzerzoComparator();
    }

    public static KiadasiEvComparator KiadasiEvRendezo() {
        return new KiadasiEvComparator();
    }

    public static ArComparator ArRendezo() {
        return new ArComparator();
    }

    public static CimComparator CimRendezo() {
        return new CimComparator();
    }
             
    

    @Override
    public int compare(Konyv k1, Konyv k2) { //alapért. rendezés: cím szerint
        Collator col = Collator.getInstance();
        return col.compare(k1.getCim(), k2.getCim());
    }

    @Override
    public int compareTo(Konyv masik) { //alapért. rendezés: cím szerint
        Collator col = Collator.getInstance();
        return col.compare(this.getCim(), masik.getCim());
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //return super.clone(); //To change body of generated methods, choose Tools | Templates.
        Konyv konyv = new Konyv(cim,szerzo,kiadasiEv,ar);
        String eredetiCim= konyv.getCim().split(" ")[0];  //csak az "alapcímet" vesszük    
        konyv.setKotetszam(konyv.getKotetszam()+1);     //lekérem az eredeti kötetszámot, 1-el megnövelem, és ezt adom értékül a setternek   
        konyv.setCim(eredetiCim+" "+konyv.getKotetszam());
        return konyv;
        
           // if () ha az utolsó karakter szám, és előtte van space..
    }

    public void setKiadasiEv(int kiadasiEv) {
        this.kiadasiEv = kiadasiEv;
    }

    public void setSzerzo(String szerzo) {
        this.szerzo = szerzo;
    }

    public void setCim(String cim) {
        this.cim = cim;
    }

    public void setKotetszam(int kotetszam) {
        this.kotetszam = kotetszam;
    }

       
    

}
