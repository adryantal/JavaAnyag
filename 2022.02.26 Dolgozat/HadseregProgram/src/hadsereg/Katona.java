package hadsereg;

import java.io.Serializable;
import java.text.Collator;
import java.util.Comparator;
import java.util.UUID;

public class Katona implements Comparable<Katona>, Serializable, Cloneable {

    private String szin, fokozat, lovedek; //a katonánál lévő lövedék típusát tárolom el egy Stringben
    private int eletero;
    private transient UUID id;

    public Katona(String szin, int eletero, String fokozat, String lovedek) {
        this(szin + ";" + eletero + ";" + fokozat + ";" + lovedek); //fájlba írásnál, kézi sorfelvitelnél

    }

    public Katona(String sor) {  //sorból történő beolvasásnál
        String[] sorTomb = sor.split(";");
        this.szin = sorTomb[0].trim();
        this.eletero = Integer.parseInt(sorTomb[1].trim());
        this.fokozat = sorTomb[2].trim();
        this.lovedek = sorTomb[3].trim();

    }

   /*GETTEREK*/ 
    public String getSzin() {
        return szin;
    }

    public String getFokozat() {
        return fokozat;
    }

    public String getLovedek() {
        return lovedek;
    }

    public int getEletero() {
        return eletero;
    }

    @Override
    public String toString() {
        return "Katona{" + "szin=" + szin + ", fokozat=" + fokozat + ", lovedek=" + lovedek + ", eletero=" + eletero + ", id=" + this.id + '}';
    }

    public void setUjID() {
        this.id = UUID.randomUUID();
    }

     /*ALAPÉRT. RENDEZÉS*/
    @Override
    public int compareTo(Katona masik) {
        Collator col = Collator.getInstance();
        return col.compare(this.szin, masik.getSzin());
    }

    
    /*STATIKUS RENDEZŐMETÓDUSOK -  - ATTRIBÚTUMOK SZERINTI RENDEZÉSHEZ, COMPARATOR OSZTÁLYOK FELHASZNÁLÁSÁVAL*/
    public static SzinComparator SzinRendezo() {
        return new SzinComparator();
    }

    public static EleteroComparator EleteroRendezo() {
        return new EleteroComparator();
    }

    public static FokozatComparator FokozatRendezo() {
        return new FokozatComparator();
    }

    public static LovedekComparator LovedekRendezo() {
        return new LovedekComparator();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //return super.clone(); 

        Katona katona = new Katona(szin, eletero, fokozat, lovedek);
        katona.id = UUID.randomUUID();  //katona.setUjID();
        return katona;
    }

}


/*COMPARATOR OSZTÁLYOK - ATTRIBÚTUMOK SZERINTI RENDEZÉSHEZ*/
class SzinComparator implements Comparator<Katona> {

    @Override
    public int compare(Katona k1, Katona k2) {
        Collator col = Collator.getInstance();
        return col.compare(k1.getSzin(), k2.getSzin());
    }
}

class EleteroComparator implements Comparator<Katona> {

    @Override
    public int compare(Katona k1, Katona k2) {
        return Integer.compare(k1.getEletero(), k2.getEletero());
    }
}

class FokozatComparator implements Comparator<Katona> {

    @Override
    public int compare(Katona k1, Katona k2) {
        Collator col = Collator.getInstance();
        return col.compare(k1.getFokozat(), k2.getFokozat());
    }
}

class LovedekComparator implements Comparator<Katona> {

    @Override
    public int compare(Katona k1, Katona k2) {
        Collator col = Collator.getInstance();
        return col.compare(k1.getLovedek(), k2.getLovedek());
    }
}
