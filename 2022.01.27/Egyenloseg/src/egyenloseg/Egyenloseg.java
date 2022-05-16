package egyenloseg;

import java.util.Objects;

class Ember{
    private String nev, cim;
    private int szulEv;

    public Ember(String nev, String cim, int szulEv) {
        this.nev = nev;
        this.cim = cim;
        this.szulEv = szulEv;
    }

    public String getNev() { return nev;}
    public String getCim() { return cim;}
    public int getSzulEv() { return szulEv;}

    @Override
    public String toString() {
        return "Ember{" + "nev=" + nev + ", cim=" + cim + ", szulEv=" + szulEv + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.nev);
        hash = 47 * hash + this.szulEv;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ember other = (Ember) obj;
        if (this.szulEv != other.szulEv) {
            return false;
        }
        if (!Objects.equals(this.nev, other.nev)) {
            return false;
        }
        return true;
    }

}

public class Egyenloseg {

    public static void main(String[] args) {
        String nev1 = "Pisti";
        String nev2 = "Pisti";
        System.out.println("hc: " + nev1.hashCode());
        System.out.println("hc: " + nev2.hashCode());
        System.out.println("nev1 == nev2: " + (nev1 == nev2));
        System.out.println("nev1.equals(nev2): " + nev1.equals(nev2));
        
        nev2 = new String("Pisti");
        System.out.println("hc: " + nev1.hashCode());
        System.out.println("hc: " + nev2.hashCode());
        System.out.println("nev1 == nev2: " + (nev1 == nev2));
        System.out.println("nev1.equals(nev2): " + nev1.equals(nev2));
        
        nev2 = nev1;
        System.out.println("nev1 == nev2: " + (nev1 == nev2));
        System.out.println("nev1.equals(nev2): " + nev1.equals(nev2));
        
        Ember e1 = new Ember("Peti", "Bp", 22);
        Ember e2 = new Ember("Peti", "Bp", 22);
        System.out.println("hc: " + e1.hashCode());
        System.out.println("hc: " + e2.hashCode());
        System.out.println("e1 == e2: " + (e1 == e2));
        System.out.println("e1.equals(e2): " + e1.equals(e2));
        
        e2 = e1;
        System.out.println("e1 == e2: " + (e1 == e2));
        System.out.println("e1.equals(e2): " + e1.equals(e2));
    }
    
}
