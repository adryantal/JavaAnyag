package bejarhato;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

class Auto {

    private String tipus;

    public Auto(String tipus) {
        this.tipus = tipus;
    }

    @Override
    public String toString() {
        return "Auto{" + "tipus=" + tipus + '}';
    }
}

class Garazs implements Iterable<Auto> {

    private ArrayList<Auto> autokLista;
    //private HashSet<Auto> autok;
    private Auto[] autokTomb;

    public Garazs() {
        autokLista = new ArrayList<>();
        //autok = new HashSet<>();
        autokLista.add(new Auto("VW"));
        autokLista.add(new Auto("BMW"));
        autokLista.add(new Auto("Suzuki"));
        
        autokTomb = new Auto[3];
        autokTomb[0] = new Auto("t-VW");
        autokTomb[1] = new Auto("t-BMW");
        autokTomb[2] = new Auto("t-Suzuki");
    }

    /* "Getter" előállítása / bejárhatóság biztosítása referencia adattípusra (listára, tömbre pl.)
    Problémák:
     * 1: referenciára adott getter az setter!!! (ha referenciaváltozót adunk át egy metódusnak, akkor attól még u.arra az objektumra mutat!!!)
     * 2: felfedtük az osztály belső reprezentációját
     */
    //public ArrayList<Auto> getAutok() { return autok; }
    //public HashSet<Auto> getAutok() { return autok; }
    /* Megoldások: 
     * 1, 2: adjunk vissza másolatot vagy nem módosítható példányt
     * 3: Iterator
     */
    public List<Auto> getAutokLista() {
        //ArrayList<Auto> lista = new ArrayList<>(autok);

        //másolatlista készítése az eredeti autokListáról
        ArrayList<Auto> masolatLista = new ArrayList<>();
        for (Auto auto : autokLista) {
            masolatLista.add(auto); 
        }
        return masolatLista;

        //nem módosítható
       // return Collections.unmodifiableList(masolatLista);
    }

    @Override
    public Iterator<Auto> iterator() { //Auto típusú iterátor
        
        //Iterátor tömbre:
          //return Arrays.stream(autokTomb).iterator();

        //Iterátor kollekcióra:
        return autokLista.iterator();
        //return new AutoIterator(); //ha saját iterátorosztályt hoztunk létre (ld. alább)
    }

    class AutoIterator implements Iterator<Auto> {

        private int ind;

        public AutoIterator() { //alapjáraton 0-ra állítjuk be az indexet
            ind = 0;
        }

        @Override
        public boolean hasNext() { //van-e még köv. elem: amíg nem érjük el a lista utolsó elemét
            return ind < autokLista.size();
        }

        @Override
        public Auto next() {
            return autokLista.get(ind++);
        }

    }
}

public class Bejarhato {

    public static void main(String[] args) {
        
        System.out.println("String típusú lista:");
        List<String> stringLista = new ArrayList<>();
        stringLista.add("VW");
        stringLista.add("BMW");
        stringLista.add("Suzuki");
        for (String tipus : stringLista) {
            System.out.println("\t"+tipus);
        }

        System.out.println("\nSaját típusú lista:");
        Garazs garazs = new Garazs();

        List<Auto> autok2 = garazs.getAutokLista(); //ez egy másolatlista az eredetiről
        kiir("autok2 - kezdeti:", autok2);
        autok2.set(0, new Auto("Trabi"));//1 a garázs autóit is állítja (autok2 egy másolatlista; tehát a másolatban lévő Autó objektumokat lehet így állítani, az eredeti "osztálylista" nem sérül)!
        kiir("autok2 - set utáni:", autok2);
        
        System.out.println("\nforeach (az alapértelmezett iterátor szerint hajtódik végre):");
        for (Auto auto : garazs) {  
            System.out.println("\t"+auto);
        }
        
        //ha a tömbös iterátort hagyom alapértelmezettnek, akkor a tömb elemeit járja be
        //ha a listához tart. iterátort hagyom alapértelmezettnek, akkor pedig a listát járja be
        
        
        System.out.println("\nforeach (autok2-re):");
        for (Auto auto : autok2) {  
            System.out.println("\t"+auto);
        }
        //!! ha az autok2-t járom be, akkor a set-elt eredmény jelenik meg; ha az eredeti garazs-t jarom be, akkor az eredeti autokLista elemei jelennek meg

        System.out.println("\niterator:");      
        Iterator it = garazs.iterator();
        Auto a = (Auto) it.next(); //az iterátor generikus típus; alapjáraton Object-re van szabva, ezért castolni kell Auto-vá
        //a hasNext pointer-e alapesetben a 0. elem előtt áll, és csak akkor ugrik előre, ha a next metódust lefuttatjuk, mivel az lépteti a pointert
        System.out.println("itt az 1. autó: " + a);
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    private static void kiir(String szoveg, List<Auto> lista) {
        System.out.println(szoveg);
        for (Auto auto : lista) {
            System.out.println("\t"+auto);
        }
    }

}
