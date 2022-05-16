package kockakazasztalon;

public class Kocka {
    private int oldalSzam, dobottErtek;

    public Kocka() {
        this(6);
    }
    
    public Kocka(int oldalSzam) {
        this.oldalSzam = oldalSzam;
        this.dobottErtek = dob(); //ha létrejön a kockaobjektum, akkor már dobunk is vele, ezáltal beállítódik a dobott érték
        
    }

    public int dob(){ //dobott érték beállítása, ez tul.képp egy setter (setDobottErtek)
        dobottErtek = (int)(Math.random()*oldalSzam)+1; //1-oldalSzam
        return dobottErtek; 
    }
    
    public int megnez(){ //ez pedig a dobottErtek gettere
        return dobottErtek;
    }
}
