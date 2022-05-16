package ismerosok;

class Ember implements Cloneable{
    private String nev;
    private int kor;
    private Ember barat;

    public Ember(String nev, int kor){
        this(nev, kor, null);
    }
    
    public Ember(String nev, int kor, Ember barat) {
        this.nev = nev;
        this.kor = kor;
        this.barat = barat;
    }

    public String getNev() { return nev; }
    public int getKor() { return kor; }
    public Ember getBarat() { return barat; }

    public void setNev(String nev) { this.nev = nev; } 
    public void setBarat(Ember barat) { this.barat = barat; }
    public void setKor(int kor) { this.kor = kor; }
    
    
    @Override
    public String toString() {
        return "Ember{" + "nev=" + nev + ", kor=" + kor + ", barat=" + barat + '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();  //Object.clone()
    }

}

public class Ismerosok {
    public static void main(String[] args) throws CloneNotSupportedException {
        Ember e1 = new Ember("Péter", 22, new Ember("Tibi", 24));
        Ember e2 = (Ember)e1.clone(); //a clone() metódus alapértelmezetten Object-re van szabva, castolni kell (Object.clone())
        
        //kónozáskor létrejön egy új obj., u.azokkal az adattagokkal és hozzájuk tart. értékekkel, mint az eredeti
        //az új referencia erre a másolatra fog mutatni
        
        System.out.println("e1 kezdetben: " + e1);
        System.out.println("e2 kezdetben: " + e1);
        
        e2.setNev("Gizi");
        e2.setBarat(new Ember("Béla", 44));
        System.out.println("e1: " + e1);
        System.out.println("e2: " + e2);
        
        Ember barat = new Ember("Pisti", 25);
        Ember e3 = new Ember("Xénia", 22, barat);
        Ember e4 = (Ember)e3.clone();
         System.out.println("\ne3 kezdetben: " + e3);
        System.out.println("e4 kezdetben: " + e4);
        
        e4.setNev("Xavér");
        e4.setBarat(new Ember("Pál", 25));
        System.out.println("e3: " + e3);
        System.out.println("e4: " + e4);
    }
}
