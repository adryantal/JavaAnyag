package sorrend;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* HASHMAP / TREEMAP
HashMap, being a hashtable-based implementation, internally uses an array-based data structure to organize its elements according to the hash function.
A TreeMap stores its data in a hierarchical tree with the ability to sort the elements with the help of a custom Comparator.
Both TreeMap and HashMap don't support duplicate keys. If added, it overrides the previous element (without an error or an exception)
*/

       
public class Tanulok {
    public static void main(String[] args) {
        HashMap<String, Double> nevSzam = new HashMap<>();
        nevSzam.put("Péter", 4.45);
        nevSzam.put("Pál", 3.45);
        nevSzam.put("Pisti", 4.90);//azonos kulcs!
        nevSzam.put("Pisti", 1.15);//azonos kulcs!
        nevSzam.put("Ede", 4.55);
        
        for (Map.Entry<String, Double> entry : nevSzam.entrySet()) {
            String key = entry.getKey();
            Double value = entry.getValue();
            System.out.printf("[%s]=%.2f\n",key, value);
        }
        
        /* Saját osztály */
        Tanulo t1 = new Tanulo("Péter", 4.45);
        Tanulo t2 = new Tanulo("Pál", 3.45);
        Tanulo t3 = new Tanulo("Pisti", 4.90);
        Tanulo t4 = new Tanulo("Ede", 4.55);
        Tanulo t5 = new Tanulo("Feri", 4.55);
        
        ArrayList<Tanulo> tanuloLista = new ArrayList<>();
        tanuloLista.add(t1);
        tanuloLista.add(t2);
        tanuloLista.add(t3);
        tanuloLista.add(t4);
        tanuloLista.add(t5);
        
        System.out.println("\nÁtlag szerint:");
        //Collections.sort(tanuloLista);
        //csökkenve:
        Collections.sort(tanuloLista, Collections.reverseOrder());
        for (Tanulo tanulo : tanuloLista) {
            System.out.println(tanulo);
        }
        
        
        /* Tanulo osztályban a hashCode és equals() metódusok felüldefiniálása! */
        HashMap<Tanulo, ArrayList<Integer>> jegyek = new HashMap<>(); //itt fogjuk tárolni tanulónként a jegyeket
        
        /*
        Tanulók jegyeinek eltárolása:
        1. tanulónként egy külön listába mentjük a jegyeket
        2. a "jegyek" nevű HashMap-be betesszük a tanulót, mint kulcsadatot, értékként pedig a tanuló jegyeit tároló listát
        */
        
        ArrayList<Integer> jegyLista1 = new ArrayList<>();
        jegyek.put(t1, jegyLista1);
        jegyLista1.add(1);
        jegyLista1.add(4);
        jegyLista1.add(5);
        jegyLista1.add(2);
        
        ArrayList<Integer> jegyLista2 = new ArrayList<>();
        jegyLista2.add(4);
        jegyLista2.add(2);
        jegyek.put(t2, jegyLista2);
        
        ArrayList<Integer> jegyLista3 = new ArrayList<>();
        jegyLista3.add(2);
        jegyLista3.add(4);
        jegyLista3.add(5);
        jegyek.put(t3, jegyLista3);
        
        ArrayList<Integer> jegyLista4 = new ArrayList<>();
        jegyLista4.add(3);
        jegyLista4.add(4);
        jegyLista4.add(3);
        jegyLista4.add(2);
        jegyek.put(t4, jegyLista4);
        
        ArrayList<Integer> jegyLista5 = new ArrayList<>();
        jegyLista5.add(1);
        jegyLista5.add(2);
        jegyLista5.add(3);
        jegyLista5.add(1);
        jegyek.put(t5, jegyLista5);
        
        System.out.println("diákok jegyei:");
        for (Map.Entry<Tanulo, ArrayList<Integer>> entry : jegyek.entrySet()) {
            Tanulo key = entry.getKey(); //kulcsadat: a tanuló
            ArrayList<Integer> value = entry.getValue(); //a kulcshoz tartozó értékek a tanuló jegyei, ezeket tanulónként egy listában tároltuk el
            System.out.print(key.getNev() + " jegyei:\n\t");
            for (Integer jegy : value) {
                System.out.print(jegy + " ");
            }
            System.out.println("");
        }
        
        /* Comparable megvalósítva a Tanulo osztály által -> compareTo() metódus (átlag alapján rendezünk)*/
        TreeMap<Tanulo, ArrayList<Integer>> rendezettJegyek = new TreeMap<>();
        rendezettJegyek.put(t1, jegyLista1);
        rendezettJegyek.put(t2, jegyLista2);
        rendezettJegyek.put(t3, jegyLista3);
        rendezettJegyek.put(t4, jegyLista4);
        rendezettJegyek.put(t5, jegyLista5);
        System.out.println("\nrendezett TreeMap:");
        for (Map.Entry<Tanulo, ArrayList<Integer>> entry : rendezettJegyek.entrySet()) {
            Tanulo key = entry.getKey();
            ArrayList<Integer> value = entry.getValue();
            System.out.println(key);
        }
    }
}
