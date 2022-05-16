package gyakorlas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Gyakorlas {
    public static void main(String[] args) {
        /* EGYETÉSEK */
        
         //A példa értelmében akkor tekintük 2 téglalapot egyenlőnek, ha területük megegyezik
        Teglalap t1 = new Teglalap(3, 4);
        Teglalap t2 = new Teglalap(2, 6);
        Teglalap t3 = new Teglalap(3, 4);
        
        System.out.println(t1);
        System.out.println(t2);
        
        //Equals: mi döntjük el az override-oláskor, hogy mi alapján legyen egyenlő 2 obj.
        //Hashcode: akkor ugyanaz 2 obj. esetében, ha "értékbeli" egyenőség áll fenn
        
        System.out.println("t1 == t2: ");
        System.out.println(t1.equals(t2));
        
        System.out.println("hc1: " + t1.hashCode());
        System.out.println("hc2: " + t2.hashCode());
        
        System.out.println("t1 == t3: ");
        System.out.println(t1.equals(t3));
        
        System.out.println("hc3: " + t3.hashCode());
        
        /* SORREND */
        List<Teglalap> teglalapLista = feltolt();
        kiir("eredeti: ", teglalapLista);
        Collections.sort(teglalapLista);
        kiir("rendezett: ", teglalapLista);
    }

    private static List<Teglalap> feltolt() {
        ArrayList<Teglalap> lista = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            double a = (int)(Math.random() * 10) + Math.random();
            double b = (int)(Math.random() * 10) + Math.random();
            lista.add(new Teglalap(a, b));
        }
        return lista;
    }

    private static void kiir(String str, List<Teglalap> lista) {
        System.out.println(str);
        for (Teglalap teglalap : lista) {
            System.out.println(teglalap);
        }
    }
    
}
