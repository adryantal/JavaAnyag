/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konyvtar;

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
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Konyvtar implements Serializable {

    private ArrayList<Konyv> konyvLista;

    public Konyvtar() {
        konyvLista = new ArrayList<>(); //konstruktor --> adattaggok inicializálása
    }

    //"kézi" rögzítés
    public void rogzit(Konyv konyv) {
        konyv.setUjID();  //a listába való behelyezésekor kapjon csak új ID-t
        konyvLista.add(konyv);
    }

    //rögzítés fájlból
    public void rogzit(String fileNev) {
        String path = "src/res/" + fileNev;
        try {
            List<String> sorok = Files.readAllLines(Paths.get(path));
            for (String sor : sorok) {
                Konyv konyv = new Konyv(sor);
                konyv.setUjID();  //a könyvtárba való behelyezésekor kapjon csak új ID-t
                this.rogzit(konyv); //ehhez adja hozzá
            }
        } catch (IOException ex) {
            Logger.getLogger(Konyvtar.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    //kiírás fájlba
    public void fajlbaIr(String fileNev, List<Konyv> lista) {
        try {
            FileWriter myWriter = new FileWriter(fileNev);
            String str = "";
            for (Konyv konyv : lista) {
                str += konyv.getCim() + ";" + konyv.getSzerzo() + ";" + konyv.getKiadasiEv() + ";" + konyv.getAr() + ";\n";
            }
            myWriter.write(str.trim());
            myWriter.close();
            System.out.println("\nFájlba írás sikeres!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    public List<Konyv> getKonyvLista() { //List-re kell állítani, mivel az Collections.unmodifiableList is List-tel tér vissza
//         return Collections.unmodifiableList(konyvLista);
//    }
    //másolatlistát adunk vissza
    public /*Array*/ List<Konyv> getKonyvLista() {
        ArrayList<Konyv> masolatLista = new ArrayList<>();
        for (Konyv konyv : konyvLista) {
            masolatLista.add(konyv);
        }
        return masolatLista;
    }

    //állapot mentése 1 --> lista inputtal
    public void objKiirFajlba(String fileNev, List<Konyv> lista) {
        try {
            ObjectOutputStream objKi = new ObjectOutputStream(new FileOutputStream(fileNev));
            objKi.writeObject(lista); //fájlba írjuk ki Object-ként
            //objKi.writeObject(this); //ha magát a Konyvtar obj-t akarnak kiiratni
            System.out.println("\nSzerializáció - Fájlba írás megtörtént.\n");
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    //--> lista inputból
    public static Konyvtar objBeolvasFajlbol(String fileNev) {
        Konyvtar konyvtar = new Konyvtar();
        List<Konyv> inputLista = new ArrayList<>();
        try {
            ObjectInputStream objBe = new ObjectInputStream(new FileInputStream(fileNev));
            inputLista = (List) objBe.readObject();
            for (Konyv konyv : inputLista) {
                konyv.setUjID(); //id --> új ID-t kell generálni a visszaállítandó Konyv objektumoknak, mivel az id mező transient adat, és nem szerializálódott, nem íródott ki a fájlba
                konyvtar.rogzit(konyv);
            }
            System.out.println("\nDeszerializáció - Könyvtár beolvasva a fájlból.\n");

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return konyvtar;
    }

    //állapot mentése2
    public void allapototLement(String fileNev) {
        try {
            ObjectOutputStream objKi = new ObjectOutputStream(new FileOutputStream(fileNev));
            objKi.writeObject(this); //fájlba írjuk ki Object-ként
            //objKi.writeObject(this); //ha magát a Konyvtar obj-t akarnak kiiratni
            System.out.println("\nSzerializáció - Fájlba írás megtörtént.\n");
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static Konyvtar allapototBeolvas(String fileNev) {
        Konyvtar konyvtar = new Konyvtar();
        try {
            ObjectInputStream objBe = new ObjectInputStream(new FileInputStream(fileNev));
            konyvtar = (Konyvtar) objBe.readObject();
            for (Konyv konyv : konyvtar.getKonyvLista()) {
                konyv.setUjID(); //id --> új ID-t kell generálni a visszaállítandó Konyv objektumoknak, mivel az id mező transient adat, és nem szerializálódott, nem íródott ki a fájlba

            }
            System.out.println("\nDeszerializáció - Könyvtár beolvasva a fájlból.\n");

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return konyvtar;
    }

    public List<Konyv> ListaCimSzerintNov() {
        ArrayList<Konyv> masolatLista = new ArrayList<>();
        for (Konyv konyv : konyvLista) {
            masolatLista.add(konyv);
        }
        masolatLista.sort(new CimComparator());
        //masolatLista.sort(Konyv.CimRendezo());
        return masolatLista;
    }

    public List<Konyv> ListaArSzerintNov() {
        ArrayList<Konyv> masolatLista = new ArrayList<>();
        for (Konyv konyv : konyvLista) {
            masolatLista.add(konyv);
        }
        masolatLista.sort(new ArComparator());
        //masolatLista.sort(Konyv.ArRendezo());
        return masolatLista;
    }

    public List<Konyv> KiadasiEvSzerintNov() {
        ArrayList<Konyv> masolatLista = new ArrayList<>();
        for (Konyv konyv : konyvLista) {
            masolatLista.add(konyv);
        }
        masolatLista.sort(new KiadasiEvComparator());
        //masolatLista.sort(Konyv.KiadasiEvRendezo());
        return masolatLista;
    }

    public List<Konyv> SzerzoSzerintNov() {
        ArrayList<Konyv> masolatLista = new ArrayList<>();
        for (Konyv konyv : konyvLista) {
            masolatLista.add(konyv);
        }
        masolatLista.sort(new SzerzoComparator());
        //masolatLista.sort(Konyv.SzerzoRendezo());
        return masolatLista;
    }

    
    

}
