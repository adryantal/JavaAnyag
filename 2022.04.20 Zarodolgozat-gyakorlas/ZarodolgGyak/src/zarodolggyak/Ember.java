package zarodolggyak;

import java.text.Collator;
import java.util.Comparator;

public class Ember {

    private int kor, munkToltEv;
    private char nem;
    private String nev;

    //fájlba íráshoz, kézi sorfelvitelhez (ha 4 adatot tartalmaz a sor)
    public Ember(String nev, int kor, char nem, int munkToltEv) {
        this(nev + ";" + kor + ";" + nem + ";" + munkToltEv);
    }

    //fájlba íráshoz, kézi sorfelvitelhez (ha csak 3 adatot tartalmaz a sor)
    public Ember(String nev, int kor, char nem) {
        this(nev + ";" + kor + ";" + nem + ";"); 
    }

    //sorból történő beolvasáshoz
    public Ember(String sor) {  
        String[] sorTomb = sor.split(";");
        if (sorTomb.length == 4) {
            this.nev = sorTomb[0].trim();
            this.kor = Integer.parseInt(sorTomb[1].trim());
            this.nem = (sorTomb[2].trim()).charAt(0); //String --> char        
            this.munkToltEv = Integer.parseInt(sorTomb[3].trim()); //String --> int 
        } else {
            this.nev = sorTomb[0].trim();
            this.kor = Integer.parseInt(sorTomb[1].trim());
            this.nem = (sorTomb[2].trim()).charAt(0); //String --> char  
        }
    }

    public int getKor() {
        return kor;
    }

    public int getMunkToltEv() {
        return munkToltEv;
    }

    public char getNem() {
        return nem;
    }

    public String getNev() {
        return nev;
    }

    /*STATIKUS RENDEZŐMETÓDUSOK -  - ATTRIBÚTUMOK SZERINTI RENDEZÉSHEZ, COMPARATOR OSZTÁLYOK FELHASZNÁLÁSÁVAL*/
    public static NevComparator NevRendezo() {
        return new NevComparator();
    }

    public static KorComparator KorRendezo() {
        return new KorComparator();
    }

    public static NemComparator NemRendezo() {
        return new NemComparator();
    }

    public static MunkToltEvComparator MunkToltEvRendezo() {
        return new MunkToltEvComparator();
    }

    @Override
    public String toString() {
        return "Ember{" + "kor=" + kor + ", munkToltEv=" + munkToltEv + ", nem=" + nem + ", nev=" + nev + '}';
    }

}


/*COMPARATOR OSZTÁLYOK - ATTRIBÚTUMOK SZERINTI RENDEZÉSHEZ*/
class NevComparator implements Comparator<Ember> {

    @Override
    public int compare(Ember e1, Ember e2) {
        Collator col = Collator.getInstance();
        return col.compare(e1.getNev(), e2.getNev());
    }
}

class KorComparator implements Comparator<Ember> {

    @Override
    public int compare(Ember e1, Ember e2) {
        return Integer.compare(e1.getKor(), e2.getKor());
    }
}

class NemComparator implements Comparator<Ember> {

    @Override
    public int compare(Ember e1, Ember e2) {
        return Character.compare(e1.getNem(), e2.getNem());
    }
}

class MunkToltEvComparator implements Comparator<Ember> {

    @Override
    public int compare(Ember e1, Ember e2) {
        return Integer.compare(e1.getMunkToltEv(), e2.getMunkToltEv());
    }
}
