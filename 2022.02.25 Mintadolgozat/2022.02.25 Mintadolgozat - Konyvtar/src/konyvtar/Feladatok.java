package konyvtar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Feladatok {

    private Konyvtar konyvtar;

    public Feladatok() throws CloneNotSupportedException {

        //kézi rögzítés
        konyvtar = new Konyvtar();
        konyvtar.rogzit(new Konyv("Összes versei 1", "Petőfi Sándor", 1998, 2500));
        konyvtar.rogzit(new Konyv("Összes versei 2", "Petőfi Sándor", 1998, 2500));
        konyvtar.rogzit(new Konyv("A vörös oroszlán 1", "Szepes Mária", 1996, 3500));
        konyvtar.rogzit(new Konyv("A vörös oroszlán 2", "Szepes Mária", 1999, 3700));
        konyvtar.rogzit(new Konyv("Összes versei 1", "Petőfi Sándor", 1998, 2500)); //direkt duplikátum
        konyvtar.rogzit(new Konyv("Összes versei 2", "Petőfi Sándor", 1998, 2500)); //direkt duplikátum
        konyvtar.rogzit(new Konyv("A kis herceg", "Antoine de Saint-Exupéry", 1978, 3200));
        konyvtar.rogzit(new Konyv("Vörös és fekete", "Stendhal", 1988, 3100));
        konyvtar.rogzit(new Konyv("Bánk Bán", "Katona József", 1982, 3350));

        //alapért. lista kiírása
        konyvListaKiir("Alap");

        //szerializáció/deszerializáció - listás változat
        konyvtar.objKiirFajlba("konyvtar.bin", konyvtar.getKonyvLista());
        System.out.println("Fájlba írás után, beolvasás előtt --> konyvtar=null");
        konyvtar = null; //változó "lenullázása", előkészítése a fájl tartalmának beolvasásához
        konyvtar = Konyvtar.objBeolvasFajlbol("konyvtar.bin");
        //ha nem Konyvtar.objBeolvasFajlbol nem lenne static metodus:
        //konyvtar=new Konyvtar();
        //konyvtar=konyvtar.objBeolvasFajlbol("konyvtar.bin");        
        konyvListaKiir("Beolvasás eredménye");

        //szerializáció/deszerializáció - könyvtáras változat
        konyvtar.allapototLement("konyvtar2.bin");
        System.out.println("Állapotmentés után, beolvasás előtt --> konyvtar=null");
        konyvtar = null; //változó "lenullázása", előkészítése a fájl tartalmának beolvasásához
        konyvtar = Konyvtar.allapototBeolvas("konyvtar2.bin");
        konyvListaKiir("Visszaállítás eredménye");

        //adatok rögzítése fájlból
        konyvtar.rogzit("adatok.txt");
        konyvListaKiir("Adatok rögzítése fájlból");

        //adatok kiírása fájlba
        konyvtar.fajlbaIr("output.txt", konyvtar.getKonyvLista());

        //cím szerinti rend. kimenete
        listaKiir(konyvtar.ListaCimSzerintNov(), "Cím szerint növ.");

        //clone test
         System.out.println("\nClone test:");
        Konyv k1 = new Konyv("Álmoskönyv", "Márai Sándor", 1995, 3500);
        Konyv k2 = (Konyv) k1.clone();
        k2.setUjID();
        System.out.println(k2);
        Konyv k3 = (Konyv) k2.clone();
        k3.setUjID();
        System.out.println(k3);
    }

    //alap könyvlista listakiíratása
    public void konyvListaKiir(String megjegyzes) {
        System.out.println("\n" + megjegyzes + ":");
        for (Konyv konyv : konyvtar.getKonyvLista()) {
            System.out.println("\t" + konyv);
        }

    }

    //ált. listakiíratás
    public void listaKiir(List<Konyv> lista, String megjegyzes) {
        System.out.println("\n" + megjegyzes + ":");
        for (Konyv konyv : lista) {
            System.out.println("\t" + konyv);
        }

    }

}
