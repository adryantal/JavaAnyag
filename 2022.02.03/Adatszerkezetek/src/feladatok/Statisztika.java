package feladatok;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Statisztika {
    public static void main(String[] args) throws IOException {
        //src mappával egy szinten
        //Files.readAllLines(Paths.get("adatok.txt"));
        
        List<String> sorok = Files.readAllLines(Paths.get("src/res/adatok.txt"));
        
        //Péter;Bp;23
        //Ember e = new Ember("Péter;Bp;23");
        ArrayList<Ember> emberLista = new ArrayList<>();
        for (String sor : sorok) {
            emberLista.add(new Ember(sor));
        }
        
        /* minden infó ott van az emberLista adatszerkezetben */
        Ember e = emberLista.get(3);
        System.out.println("ember: " + e);
        System.out.println("cím: " + e.getCim());
  
        System.out.println("Lakóhelyek:");
        HashSet<String> cimek = new HashSet<>();
        for (Ember ember : emberLista) {
            cimek.add(ember.getCim());
        }
        
        for (String cim : cimek) {
            System.out.println(cim);
        }
        
        /* akkor azonos 2 ember, ha
         * nevük és címük is azonos
         * hashCode és equals felüldef!
        */
        System.out.println("\nKül. emberek:");
        Set<Ember> emberHalmaz = new HashSet<>(emberLista);
        for (Ember ember : emberHalmaz) {
            System.out.println(ember);
        }
        
        System.out.println("\nMelyik címen hányan laknak");
        Map<String, Integer> cimDb = new HashMap<>();
        /* 2 érdi: */
        //for (Ember ember : emberLista) {
        
        /* 1 érdi */
        for (Ember ember : emberHalmaz) {
            String kulcs = ember.getCim();
            if(cimDb.containsKey(kulcs)){
                int hanyanLaknak = cimDb.get(kulcs); //a címhez, mint kulcshoz tart. AKT. érték (hányan laknak azon a címen) lekérése 
                cimDb.put(kulcs, ++hanyanLaknak); //ha van találat, visszarakjuk a kulcsot a megnövelt értékkel; a Hashmap garantálja az egyediséget
            }else{
                cimDb.put(kulcs, 1);
            }
        }
        //kulcs-érték párok bejárása
        for (Map.Entry<String, Integer> entry : cimDb.entrySet()) { //egy Entry (generikus típus) típusú változó segítségével járjuk be a hashmap-et
            String key = entry.getKey(); //AKT. kulcs lekérése
            Integer value = entry.getValue(); //AKT. kulcshoz tart. érték lekérése
            System.out.printf("%s: %d fő\n", key, value);
        }
    }
}
