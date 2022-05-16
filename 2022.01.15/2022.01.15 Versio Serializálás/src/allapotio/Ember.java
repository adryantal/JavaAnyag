package allapotio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;
import java.util.UUID;

public class Ember implements Serializable{
    /* Az osztály -static- dolgai nem íródnak ki */
    private static final long serialVersionUID = 3L; //https://www.youtube.com/watch?v=GjtZb61YgMg  osztályverzió
                                                      //https://www.baeldung.com/java-serial-version-uid 
    /*Simply put, we use the serialVersionUID attribute to remember versions of a Serializable class 
    to verify that a loaded class and the serialized object are compatible.*/
    
    private static Random rnd = new Random();
    
    /* láthatóságtól függetlenül minden kiííródik */
    private String nev;
    private int kor;
    private ArrayList<String> targyak;
    
    /* A transient jelöléseket nem írja ki:
    érzékeny adat, generált/származtatott adat, stb */
    private transient UUID id; //https://www.baeldung.com/java-transient-keyword
    //ennek a mezőnek az értéke nem fog kiíródni a fájlba a szerializáció folyamán, nem kerül mentésre    
    /*Serialization is the process of converting an object into a byte stream, and deserialization is the opposite of it.
    When we mark any variable as transient, then that variable is not serialized. 
    Since transient fields aren't present in the serialized form of an object, 
    the deserialization process would use the default values for such fields when creating an object out of the serialized form.*/    
    //mivel nincs default id érték megadva, ezért deszerializációkor alapból null értéket vesz fel az id mező
    //kívülről, a setterrel lehet majd új id-t generálni
    

    public Ember() {
        this(".");
        kor = 1;
        
        
//        nev = "";//"." " " "nincs neve"
//        kor = 1;
//        targyak = new ArrayList<>();
    }
    
    public Ember(String nev) {
        this.nev = nev;
        this.kor = rnd.nextInt(80-10+1)+10;//10-80 //kor;
        targyak = new ArrayList<>();
        ujId(); //id mező 
    }

    public void ujId(){
        id = UUID.randomUUID(); //random ID generálása (setter)--> ennek a metódusnak a hívásával kívülről új ID-t tudunk beállítani
                                //mivel az eredeti id mező transient, így nem fog szerializálódni,
                                 //ezért a deszerializáció (visszaállítás) folyamán alapból null lesz az id értéke
    }
    
    public void felvesz(String targy){
        targyak.add(targy);
    }
    
    
    @Override
    public String toString() {
        String sep = System.lineSeparator();
        String felsz = "";
        for (String f : targyak) {
            felsz += sep + "\t" + f;
        }
        return "Ember{" 
                + sep + "nev=" + nev + ", kor=" + kor 
                + sep + "tárgyak:"
                + felsz
                + sep + "ID: " + id
                + sep + '}';
    }
}
