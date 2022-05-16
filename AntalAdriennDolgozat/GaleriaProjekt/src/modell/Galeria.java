package modell;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Galeria implements Iterable, Serializable {

    private ArrayList<KiallitasiTargy> kiallitasiTargyLista;

    public Galeria() {
        kiallitasiTargyLista = new ArrayList<>();
    }

    /*ADATOK KÉZI FELVÉTELÉHEZ*/
    public void felvesz(KiallitasiTargy kt) {
        kiallitasiTargyLista.add(kt);
    }

    /*GALÉRIA TARTALMA - ALAP*/
//másolatlistát adunk vissza
    public List<KiallitasiTargy> getKTLista() {
        ArrayList<KiallitasiTargy> masolatLista = new ArrayList<>();
        for (KiallitasiTargy kt : kiallitasiTargyLista) {
            masolatLista.add(kt);
        }
        masolatLista.sort(KiallitasiTargy.CimRendezo());
        return masolatLista;
    }
    
        /*GALÉRIA TARTALMA CIM SZERINTI  RENDEZÉSSEL*/
    public List<KiallitasiTargy> getKTListaRendCim() {
        ArrayList<KiallitasiTargy> masolatLista = new ArrayList<>();
        for (KiallitasiTargy kt : kiallitasiTargyLista) {
            masolatLista.add(kt);
        }
        masolatLista.sort(KiallitasiTargy.CimRendezo());
        return masolatLista;
    }
    
    
        /*GALÉRIA TARTALMA KÉSZÍTŐ SZERINTI  RENDEZÉSSEL*/
    public List<KiallitasiTargy> getKTListaRendKeszito() {
        ArrayList<KiallitasiTargy> masolatLista = new ArrayList<>();
        for (KiallitasiTargy kt : kiallitasiTargyLista) {
            masolatLista.add(kt);
        }
        masolatLista.sort(KiallitasiTargy.KeszitoRendezo());
        return masolatLista;
    }
    
    
    
    /*SZERIALIZÁCIÓ / DESZERIALIZÁCIÓ*/
    //állapot mentése
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

    public static Galeria allapotBeolvasas(String fileNev) {
        Galeria galeria = new Galeria();
        try {
            ObjectInputStream objBe = new ObjectInputStream(new FileInputStream(fileNev));
            galeria = (Galeria) objBe.readObject();           
            System.out.println("Deszerializáció --> Könyvtár beolvasva a fájlból.");
            

        } catch (FileNotFoundException ex) { //utód
            System.out.println(ex.getMessage());
        } catch (IOException ex) {   //ős
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return galeria;
    }


    @Override
    public Iterator iterator() {
        return kiallitasiTargyLista.iterator();
    }

    class KiallitasiTargyIterator implements Iterator<KiallitasiTargy> {

        private int ind;

        public KiallitasiTargyIterator() {
            ind = 0;
        }

        @Override
        public boolean hasNext() {
            return ind < kiallitasiTargyLista.size();
        }

        @Override
        public KiallitasiTargy next() {
            return kiallitasiTargyLista.get(ind++);
        }

    }

}
