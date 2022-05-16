package modell;

import java.io.File;
import java.io.Serializable;
import java.util.Date;

public class Festmeny extends KiallitasiTargy implements Serializable{

    private String eleresiUt;

    public Festmeny(Date letreDatum, String keszito, String cim) throws InvalidDateException {
        super(letreDatum, keszito, cim);
        this.eleresiUt="";
    }

    public Festmeny(String keszito, String cim) throws InvalidDateException {
        super(keszito, cim);
           this.eleresiUt="";
    }      

    public Festmeny(String eleresiUt, Date letreDatum, String keszito, String cim) throws InvalidDateException {
        super(letreDatum, keszito, cim);
        this.eleresiUt = keresFajlt(eleresiUt);
    }

    public Festmeny(String eleresiUt, String keszito, String cim) throws InvalidDateException {
        super(keszito, cim);
        this.eleresiUt = keresFajlt(eleresiUt);
    }

    private String keresFajlt(String eUT) {
        File file = new File(eUT);
        String uzenet;
        if (file.exists()) {
            uzenet = "Megjelenítés folyamatban...";
        } else {
            uzenet = "Nem lehet megjelníteni!";
        }
        return uzenet;
    }

    @Override
    public String toString() {
        return  "Festmeny{" +super.toString()+ ", eleresiUt = " + eleresiUt + '}';
    }

   
    
    

}
