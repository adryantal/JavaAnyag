package egysegbezaras;
public class Kor {
    int r;
    String szin;
    
    double terulet(){
        return Math.pow(r, 2) * Math.PI;
    }
    
    double kerulet(){
        return 2 * r * Math.PI;
    }
   
    String getSzin(){ return szin; }
    
    void setSzin(String ujSzin){
        szin = ujSzin;
    }
    
    void info(){
        System.out.printf("Kor{r=%d, T=%f, K=%f, szín=%s}\n",r, terulet(), kerulet(), szin);
    }
}
