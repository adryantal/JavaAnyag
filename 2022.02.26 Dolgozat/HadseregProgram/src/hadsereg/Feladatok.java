package hadsereg;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Feladatok {

    private Hadsereg hadsereg;

    public Feladatok() throws CloneNotSupportedException {
        hadsereg = new Hadsereg();

        feladatKiiras("Kézi adatrögzítés tesztje");
        keziAdatRogzites(hadsereg);
        listaKiir(hadsereg.getKatonaLista(), "Hadsereg katonáinak listája - kézi rögzítés");

        feladatKiiras("Fájlból történő adatbeolvasás tesztje");
        hadsereg.felvesz("katonaAdatok.txt");
        listaKiir(hadsereg.getKatonaLista(), "Hadsereg katonáinak listája - fájlból");

        feladatKiiras("Fájlba írás tesztje tetszőleges rendezett kimenet választásával");
        hadsereg.fajlbaIr("AktKatonaLista.txt", hadsereg.KListaFokozatSzerintNov());

        feladatKiiras("Aktuális állapot mentése");
        hadsereg.allapotMentes("allapotMentes.bin");

        feladatKiiras("Korábbi állapot visszaállítása fájl alapján");
        hadsereg = null;
        hadsereg = hadsereg.allapotBeolvasas("allapotMentes.bin");
        listaKiir(hadsereg.getKatonaLista(), "Visszaállítás eredménye");

        feladatKiiras("Másolhatóság tesztelése");
        Katona k1 = new Katona("piros", 9, "ezredes", "rakéta");
        k1.setUjID();
        System.out.println(k1);
        Katona k2 = (Katona) k1.clone();
        System.out.println(k2);
        Katona k3 = (Katona) k2.clone();
        System.out.println(k3);

        feladatKiiras("Iterálhatóság tesztelése");
        iteratorralBejar(hadsereg);
    }

    public void keziAdatRogzites(Hadsereg hadsereg) {
        hadsereg.felvesz(new Katona("piros", 8, "őrmester", "gránát"));
        hadsereg.felvesz(new Katona("sárga", 5, "tiszt", "golyó"));
        hadsereg.felvesz(new Katona("kék", 6, "főtiszt", "akna"));
        hadsereg.felvesz(new Katona("piros", 7, "főtiszt", "dinamit"));
        hadsereg.felvesz(new Katona("kék", 7, "tizedes", "kézigránát"));
        hadsereg.felvesz(new Katona("sárga", 9, "ezredes", "bomba"));
        hadsereg.felvesz(new Katona("piros", 8, "hadnagy", "gránát"));
    }

    public void listaKiir(List<Katona> lista, String megjegyzes) {
        System.out.println(megjegyzes + ":");
        for (Katona katona : lista) {
            System.out.println("\t" + katona);
        }
    }
    
    public void iteratorralBejar(Hadsereg hadsereg){
     Iterator it = hadsereg.iterator();
        Katona k = (Katona) it.next();        
        System.out.println("\t1. katona: " + k);
        int i= 2;
        while (it.hasNext()) {
            System.out.println("\t"+(i++)+". katona: " + it.next());
        }
    }

    public void feladatKiiras(String cim) {
        System.out.println("\n***************** " + cim + " *****************");

    }

}
