package adatszerkezetgyakorlas;

import java.text.Collator;
import java.util.Comparator;
import java.util.Objects;

public class Dal implements Comparable<Dal> {

    private String cim, eloado;

    public Dal(String sor) {
        String[] s = sor.split("/");
        this.cim = s[0].trim();
        this.eloado = s[1].trim();
    }

    public Dal(String cim, String eloado) {
        this(cim + " / " + eloado);
    }

    public String getCim() {
        return cim;
    }

    public String getEloado() {
        return eloado;
    }

    @Override
    public String toString() {
        return "Dal{" + "cim=" + cim + ", eloado=" + eloado + '}';
    }

    @Override
    public int compareTo(Dal d) {

        Collator col = Collator.getInstance();
        int cimSorrendNov = col.compare(this.getCim(), d.getCim());
        if (cimSorrendNov == 0) {
            cimSorrendNov = col.compare(this.getEloado(), d.getEloado());
        }
        return cimSorrendNov;

    }

    //A rendező osztály ismerete nélküli rendezéshez kell:
    //statikus metódus, amely meghívja az adott attribútum komparátor osztályának konstruktorát
    public static EloadoNevComparator EloadoNevRendezo() {
        return new EloadoNevComparator();
    }
    
       //A rendező osztály ismerete nélküli rendezéshez kell:
    //statikus metódus, amely meghívja az adott attribútum komparátor osztályának konstruktorát
    public static CimComparator CimRendezo() {
        return new CimComparator();
    }


    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.cim);
        hash = 53 * hash + Objects.hashCode(this.eloado);
        return hash;
    }

//   
    
    
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
        final Dal other = (Dal) obj;

        if (!Objects.equals(this.eloado, other.eloado) || !Objects.equals(this.cim, other.cim)) { //ha a cím v. előadó nem ua., akkor a 2 obj. se legyen egyenlő
            return false;            
        }

        return true;
    }
   
    
 //    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final Dal other = (Dal) obj;
//        if (!Objects.equals(this.cim, other.cim)) {
//            return false;
//        }
//        if (!Objects.equals(this.eloado, other.eloado)) {
//            return false;
//        }
//        return true;
//    }


}
