package zarodolggyak;

import java.util.List;

public class Teszt {

    private Nevsor nevsor;

    public Teszt() {
        nevsor = new Nevsor();
        
        feladatKiiras("Kézi adatrögzítés tesztje");
        keziAdatRogzites(nevsor);
        nevsor.emberListaKiir();
        
        feladatKiiras("Fájlból történő adatbeolvasás tesztje");
        nevsor.felvesz("emberek.txt");
        nevsor.emberListaKiir();
    }

    public void feladatKiiras(String cim) {
        System.out.println("\n***************** " + cim + " *****************");

    }

    public void keziAdatRogzites(Nevsor nevsor) {
        nevsor.felvesz(new Ember("Eszter", 20, 'L', 2));
        nevsor.felvesz(new Ember("Kati", 18, 'L'));
        nevsor.felvesz(new Ember("Zénó", 21, 'F'));
        nevsor.felvesz(new Ember("Gábor", 50, 'F', 30));
    }

    public void listaKiir(List<Ember> lista, String megjegyzes) {
        System.out.println(megjegyzes + ":");
        for (Ember ember : lista) {
            System.out.println("\t" + ember);
        }
    }

}
