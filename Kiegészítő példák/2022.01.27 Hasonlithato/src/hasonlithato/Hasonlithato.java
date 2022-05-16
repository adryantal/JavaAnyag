package hasonlithato;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


/*Saját, Ember típusú Comparator osztály létrehozása a cím szerinti rendezésre*/
class CimComparator implements Comparator<Ember>{
    @Override
    public int compare(Ember egyik, Ember masik) {
        /* ékezetet nem jól kezeli */
        //return egyik.getCim().compareTo(masik.getCim());
        
        /* magyar ékezettel: */
        Collator col = Collator.getInstance();
        return col.compare(egyik.getCim(), masik.getCim());
    }
    
}

/*Saját, Ember típusú Comparator osztály létrehozása a kor szerinti rendezésre*/
class KorComparator implements Comparator<Ember>{

    @Override
    public int compare(Ember egyik, Ember masik) {
        return egyik.getSzulEv() - masik.getSzulEv();
    }
    
}

class Ember implements Comparable<Ember>{
    
    
    /*A rendező osztály ismerete nem szükséges --> saját Comparator típusú statikus metódus a kor rendezéséhez */
    public static KorComparator KorRendezo(){
        return new KorComparator();
    }
    
    private String nev, cim;
    private int szulEv;

    public Ember(String nev, String cim, int szulEv) {
        this.nev = nev;
        this.cim = cim;
        this.szulEv = szulEv;
    }

    public String getNev() { return nev;}
    public String getCim() { return cim;}
    public int getSzulEv() { return szulEv;}

    @Override
    public String toString() {
        return "Ember{" + "nev=" + nev + ", cim=" + cim + ", szulEv=" + szulEv + '}';
    }

    @Override
    public int compareTo(Ember masik) {
        /* Kor */
        //1.:
//        if(this.szulEv > masik.szulEv){
//            return 1;
//        }else if(this.szulEv < masik.szulEv){
//            return -1;
//        }else{
//            return 0;
//        }
//        
        //2.:
//        return this.szulEv - masik.szulEv;

        /* Név */
        //if(this.nev > masik.nev){return 0;}
        //return this.nev - masik.nev;
        
        //3.: ez mindenre jó
        /* ékezet nem jó */
        //return this.nev.compareTo(masik.nev);
        Collator col = Collator.getInstance();
        return col.compare(this.nev, masik.nev);
    }
    
}

public class Hasonlithato {
    public static void main(String[] args) {
        System.out.println("String típus");
        List<String> nevek = new ArrayList<>();
        nevek.add("Ede");
        nevek.add("Anna");
        nevek.add("Pisti");
        nevek.add("Misi");
        
        System.out.println("eredeti String: ");
        kiir1(nevek);
        
        System.out.println("\nrendezve String: ");
        Collections.sort(nevek);
        kiir1(nevek);
        
        System.out.println("\nEmber típus:");
        List<Ember> emberek = new ArrayList<>();
        emberek.add(new Ember("Ede", "Bp", 22));
        emberek.add(new Ember("Ádám", "Miskolc", 25));
        emberek.add(new Ember("Anna", "Miskolc", 25));
        emberek.add(new Ember("Pisti", "Bp", 23));
        emberek.add(new Ember("Xénia", "Bp", 23));
        emberek.add(new Ember("Misi", "Ab", 24));
        System.out.println("eredeti Ember: ");
        kiir2(emberek);
        
        System.out.println("\nrendezve (név) Ember: ");
        Collections.sort(emberek);
        kiir2(emberek);
        
        System.out.println("\nrendezve (kor) Ember: ");
        //hátráy: ismerni a KorComparator osztályt
        //Collections.sort(emberek, new KorComparator());
        /* előny: 
         * minden publikus getterhez lehjet saját comparatort Ă­rni
        */
//        Collections.sort(emberek, new Comparator<Ember>(){
//            //névtelen belső osztály:
//            @Override
//            public int compare(Ember o1, Ember o2) {
//                return o1.getSzulEv() - o2.getSzulEv();
//            }  
//        });
        kiir2(emberek);
        
        //extra kényelem - a rendező osztály ismerete nem szükséges, a statikus rendezőmetódust hívjuk meg:
        Collections.sort(emberek, Ember.KorRendezo());
        kiir2(emberek);
        
        System.out.println("\nrendezve (cím) Ember: ");
        //Collections.sort(emberek, new CimComparator());
        emberek.sort(new CimComparator());
        kiir2(emberek);
    }

    private static void kiir1(List<String> lista) {
        for (String str : lista) {
            System.out.println(str);
        }
    }

    private static void kiir2(List<Ember> lista) {
        for (Ember ember : lista) {
            System.out.println(ember);
        }
    }
}
