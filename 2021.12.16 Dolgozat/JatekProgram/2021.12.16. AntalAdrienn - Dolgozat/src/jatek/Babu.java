package jatek;

public class Babu {

    private int ero;
    private String szin;
    

    public Babu(int ero, String szin) throws IllegalArgumentException {
        if (ero >= 1 && ero <= 9) {
            this.ero = ero;
        } else {
            throw new IllegalArgumentException("Helytelen ero!");
        }
        this.szin = szin;
    }

    public Babu(String szin) {
        this(1, szin);
    }

    public int getEro() {
        return ero;
    }

    public String getSzin() {
        return szin;
    }
    
  

}
