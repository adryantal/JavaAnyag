package kockakazasztalon;
public class Asztal {
    private Kocka[] kockak;
    

    public Asztal() {
        kockak = new Kocka[2];
        //a tömb feltöltése
        kockak[0] = new Kocka();
        kockak[1] = new Kocka();
        
    }

    public Asztal(int kockaDb) {
        //kockak = new Kocka[kockaDb];
        this(new Kocka[kockaDb]);
    }
    
    public Asztal(Kocka[] kockak) { 
        this.kockak = kockak;
        
    }
    
    public void belerug(){
        kockak = new Kocka[0]; //egy új üres tömböt adunk át
    }

    
    
    
    /*SAJÁT HOZZÁADÁS:*/
    
    @Override
    public String toString() {
        String txt="";
        for (Kocka kocka : kockak){
            txt+="\t"+kocka.megnez()+"\n";
            }
        return "\n>> Asztal >>" + "\n\tKockák dobott értékei:\n\t---------------------\n" + txt;
    }
    
    
}
