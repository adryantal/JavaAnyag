package adatszerkezetgyakorlas;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class AdatszerkezetGyakorlas {

    public static void main(String[] args) throws IOException {

        String path = "src/res/dalok.txt";
        List<String> dalSorok = new ArrayList<>();

        // This text is added only once to the file.
        if (Files.exists(Paths.get(path))) {
            dalSorok = Files.readAllLines(Paths.get(path));

            ArrayList<Dal> dalLista = new ArrayList<>();
            for (String sor : dalSorok) {
                dalLista.add(new Dal(sor));
            }
            kiirLista("Eredeti lista", dalLista);

            List<Dal> dalListaCopy = new ArrayList<>(dalLista);
            
            //Egyenlőségvizsgálat
            System.out.println("Egyenlőségvizsgálat:");
            System.out.println(dalListaCopy.get(8).equals( dalListaCopy.get(9))); // Valami / Együttes2 és Valami / Együttes1
            System.out.println(dalListaCopy.get(9).equals( dalListaCopy.get(10))+"\n"); // Valami / Együttes1 és Valami / Együttes1
            
            //Feladatmegoldások

           
            Collections.sort(dalListaCopy);
            kiirLista("Rendezett lista (elsődleges: cím / másodlagos: előadó)", dalListaCopy);
            
             /* 1. feladat --> a) Fájlból olvasd be a tartalmat, majd jelenítsd meg a dalokat cím szerinti ábécésorrendben (dal / előadó)*/
               Collections.sort(dalListaCopy, new CimComparator());
            kiirLista("Rendezett lista (cím szerinti növekvő)", dalListaCopy);

            
             /* 4. feladat --> a) jelenítsd meg a dalokat előadó szerinti ábécésorrendben (dal / előadó)*/
            Collections.sort(dalListaCopy, new EloadoNevComparator());
            kiirLista("Rendezett lista (előadó neve szerinti növekvő)", dalListaCopy);
            
      

            /*5. feladat --> a) Ne kelljen ismerni a külső rendező osztályt*/
            Collections.sort(dalListaCopy, Dal.EloadoNevRendezo());
            kiirLista("Rendezett lista (előadó neve szerinti növekvő) / rendező oszt. ismerete nélkül.", dalListaCopy);
            
            /*5. feladat --> b) Ne kelljen ismerni a külső rendező osztályt*/
            Collections.sort(dalListaCopy, Dal.CimRendezo());
            kiirLista("Rendezett lista (cím szerinti növekvő) / rendező oszt. ismerete nélkül.", dalListaCopy);
            
            /*5. feladat --> c) Ne kelljen ismerni a külső rendező osztályt*/
            Collections.sort(dalListaCopy, (Dal d1, Dal d2) -> {
                Collator col = Collator.getInstance();
                return col.compare(d1.getEloado(), d2.getEloado());
            });
            kiirLista("Rendezett lista (előadó neve szerinti növekvő) / névtelen belső oszt.", dalListaCopy);
            
            //7.  feladat --> Bővítve a fájl tartalmát, szűrjük ki az ismétlődéseket!
            // Az EloadoNevComparator + Treeset kombo --> az előadójú elemek közül CSAK egyet hagy benne a halmazban!
            Set<Dal> dalListaIsmNelkulEaRend = new TreeSet<>(new EloadoNevComparator());            
            for (int i = 0; i < dalListaCopy.size(); i++) {
                dalListaIsmNelkulEaRend.add(dalListaCopy.get(i));
            }
            kiirHalmaz("Ismétlődő elemek kiszűrése (előadó szerinti rendezés)", dalListaIsmNelkulEaRend);
            
      
           //8.  feladat --> Bővítve a fájl tartalmát, szűrjük ki az ismétlődéseket! Tartsuk meg a dalcím szerinti rendezést!
           // A CimComparator + Treeset kombo --> az azonos című elemek közül CSAK egyet hagy benne a halmazban!
            Set<Dal> dalListaIsmNelkulCimRend = new TreeSet<>(new CimComparator()); 
            for (int i = 0; i < dalListaCopy.size(); i++) {
                dalListaIsmNelkulCimRend.add(dalListaCopy.get(i));
            }
            kiirHalmaz("Ismétlődő elemek kiszűrése (cím szerinti rendezés)", dalListaIsmNelkulCimRend);
            

        } else {
            System.err.println("A file nem található!");
        }

    }

    private static void kiirLista(String szoveg, List<Dal> lista) {
        System.out.println(szoveg);
        System.out.println("----------------------------");
        for (Dal dal : lista) {
            System.out.printf("%s (%s)\n", dal.getCim(), dal.getEloado());
        }
        System.out.println("\n");
    }

    private static void kiirHalmaz(String szoveg, Set<Dal> halmaz) {
        System.out.println(szoveg);
        System.out.println("----------------------------");
        for (Dal dal : halmaz) {
            System.out.printf("%s (%s)\n", dal.getCim(), dal.getEloado());          
            
        }
        System.out.println("\n");
    }

//    private static TreeSet<Dal> listToTreeSet(List<Dal> lista, Comparator<Dal>rendezo ){
//     Set<Dal> halmaz = new TreeSet<>(rendezo);   
//     for (int i = 0; i < lista.size(); i++) {
//                halmaz.add(lista.get(i));
//            } 
//    return (TreeSet<Dal>) halmaz;
//    } 
}
