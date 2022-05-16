
package zarodolggyak;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Nevsor {
    
     private ArrayList<Ember> emberLista; //deklaráljuk a listát

    public Nevsor() {
        emberLista = new ArrayList<>(); //inicializáljuk a listát
    }
    
     /*ALAP EMBERLISTA LEKÉRÉSE KOR SZERINTI RENDEZÉSSEL*/
//másolatlistát adunk vissza
    public /*Array*/ List<Ember> getEmberLista() {
        ArrayList<Ember> masolatLista = new ArrayList<>();
        for (Ember ember : emberLista) { //végigiterálunk az eredeti listán, és egy másolatlistához adjuk az elemeket
            masolatLista.add(ember);
        }
        masolatLista.sort(Ember.KorRendezo()); //másolatlista rendezése
        return masolatLista;
    }
    
    
     /*ADATOK KÉZI RÖGZÍTÉSE*/
    public void felvesz(Ember ember) {      
        emberLista.add(ember);
    }

    /*ADATOK RÖGZÍTÉSE FÁJLBÓL*/
    public void felvesz(String fileNev) {
        String path = "src/res/" + fileNev;
        try {           
            List<String> sorok = Files.readAllLines(Paths.get(path)); //összes sor eltárolása változóban
            sorok.remove(0); //fejléc eltávolítása
            System.out.println( sorok);
            for (String sor : sorok) {  //a sorokat tart. lista bejárása
                Ember ember = new Ember(sor);   //új Ember obj. létrehozása a sor alapján           
                this.felvesz(ember);  //felvétel az emberListába 
            }
        } catch (IOException ex) {
            ex.getMessage();
        }
    }

   public void emberListaKiir(){
    listaKiir(emberLista, "Névsor");
   }
             
    

    public void listaKiir(List<Ember> lista, String megjegyzes) {
        System.out.println(megjegyzes + ":");
        for (Ember ember : lista) {
            System.out.println("\t" + ember.toString());
        }
    }
    
}
