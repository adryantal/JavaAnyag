package hadsereg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Hadsereg implements Serializable, Iterable {

    private ArrayList<Katona> katonaLista; //deklaráljuk a listát

    public Hadsereg() {
        katonaLista = new ArrayList<>(); //inicializáljuk a listát
    }

    /*ADATOK KÉZI RÖGZÍTÉSE*/
    public void felvesz(Katona katona) {
        katona.setUjID();  //a listába való behelyezésekor kap csak új ID-t
        katonaLista.add(katona);
    }

    /*ADATOK RÖGZÍTÉSE FÁJLBÓL*/
    public void felvesz(String fileNev) {
        String path = "src/res/" + fileNev;
        try {
            List<String> sorok = Files.readAllLines(Paths.get(path));
            for (String sor : sorok) {
                Katona katona = new Katona(sor);
                katona.setUjID();
                this.felvesz(katona);
            }
        } catch (IOException ex) {
            ex.getMessage();
        }

    }

    //nem módosítható listát adunk vissza
//    public List<Katona> getKatonak() {
//        return Collections.unmodifiableList(katonaLista);
//    }

    /*ALAP KATONALISTA LEKÉRÉSE CIM SZERINTI RENDEZÉSSEL*/
//másolatlistát adunk vissza
    public /*Array*/ List<Katona> getKatonaLista() {
        ArrayList<Katona> masolatLista = new ArrayList<>();
        for (Katona katona : katonaLista) { //végigiterálunk az eredeti listán, és egy másolatlistához adjuk az elemeket
            masolatLista.add(katona);
        }
        masolatLista.sort(Katona.SzinRendezo()); //másolatlista rendezése
        return masolatLista;
    }

    /*FÁJLBA ÍRÁS*/
    public void fajlbaIr(String fileNev, List<Katona> lista) {
        try {
            FileWriter myWriter = new FileWriter(fileNev);
            String str = "";
            for (Katona katona : lista) {
                str += katona.getSzin() + ";" + katona.getEletero() + ";" + katona.getFokozat() + ";" + katona.getLovedek() + ";\n";
            }
            myWriter.write(str.trim());
            myWriter.close();
            System.out.println("Fájlba írás sikeres!");
        } catch (IOException e) {
            e.getMessage();
        }
    }

    /*RENDEZETT KIMENETEK*/
    public List<Katona> KListaSzinSzerintNov() {
        ArrayList<Katona> masolatLista = new ArrayList<>();
        for (Katona katona : katonaLista) {
            masolatLista.add(katona);
        }
        masolatLista.sort(new SzinComparator());
        //masolatLista.sort(Katona.SzinRendezo());
        return masolatLista;
    }

    public List<Katona> KListaEleteroSzerintNov() {
        ArrayList<Katona> masolatLista = new ArrayList<>();
        for (Katona katona : katonaLista) {
            masolatLista.add(katona);
        }
        masolatLista.sort(new EleteroComparator());
        //masolatLista.sort(Katona.EleteroRendezo());
        return masolatLista;
    }

    public List<Katona> KListaFokozatSzerintNov() {
        ArrayList<Katona> masolatLista = new ArrayList<>();
        for (Katona katona : katonaLista) {
            masolatLista.add(katona);
        }
        masolatLista.sort(new FokozatComparator());
        //masolatLista.sort(Katona.FokozatRendezo());
        return masolatLista;
    }

    public List<Katona> KListaLovedekSzerintNov() {
        ArrayList<Katona> masolatLista = new ArrayList<>();
        for (Katona katona : katonaLista) {
            masolatLista.add(katona);
        }
        masolatLista.sort(new LovedekComparator());
        //masolatLista.sort(Katona.LovedekRendezo());
        return masolatLista;
    }

    /*SZERIALIZÁCIÓ / DESZERIALIZÁCIÓ*/
    //állapot mentése2
    public void allapotMentes(String fileNev) {
        try {
            ObjectOutputStream objKi = new ObjectOutputStream(new FileOutputStream(fileNev));
            objKi.writeObject(this);
            System.out.println("Szerializáció --> Fájlba írás megtörtént.");
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static Hadsereg allapotBeolvasas(String fileNev) {
        Hadsereg hadsereg = new Hadsereg();
        try {
            ObjectInputStream objBe = new ObjectInputStream(new FileInputStream(fileNev));
            hadsereg = (Hadsereg) objBe.readObject();
            for (Katona katona : hadsereg.getKatonaLista()) {
                katona.setUjID();
            }
            System.out.println("Deszerializáció --> Könyvtár beolvasva a fájlból.");

        } catch (FileNotFoundException ex) { //utód
            System.out.println(ex.getMessage());
        } catch (IOException ex) {   //ős
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return hadsereg;
    }

    /*BEJÁRHATÓSÁG*/
    @Override
    public Iterator<Katona> iterator() {
        return katonaLista.iterator(); //ha szín szerinti rendezést szeretnénk elérni, akkor a getKatonaLista()-t kell returnolni (vagy az adott attr. szerint rendezett kimenetet kell kiválasztani)
        //return new KatonaIterator();
    }

    class KatonaIterator implements Iterator<Katona> {

        private int ind;

        public KatonaIterator() {
            ind = 0;
        }

        @Override
        public boolean hasNext() { 
            return ind < katonaLista.size();
        }

        @Override
        public Katona next() {
            return katonaLista.get(ind++);
        }

    }

}
