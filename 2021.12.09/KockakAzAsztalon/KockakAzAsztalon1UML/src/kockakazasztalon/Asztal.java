package kockakazasztalon;
public class Asztal {
    private Kocka[] kockak;

    public Asztal() {  //default-ból 2 kocka legyen az asztalon
        kockak = new Kocka[2];
    }

    public Asztal(Kocka[] kockak) { //kockak tömb inicializálása
        this.kockak = kockak;
    }
    
    public Asztal(int kockaDb) { //hány kocka legyen az asztalon
        kockak = new Kocka[kockaDb];
    }
    
    public void belerug(){}
}
