package egyenloseg;

import java.util.HashSet;

class Teglalap{
    private double a, b;

    public Teglalap(double a, double b) {
        this.a = a;
        this.b = b;
    }
 
    public double terulet(){ return a*b; }

    @Override
    public String toString() {
        return "Teglalap{" + "a=" + a + ", b=" + b + ", ter=" + terulet() + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        //hash = 89 * hash + (int)this.terulet();//3.0 - 3.9999999 egyforma lesz
        hash = 89 * hash + Double.hashCode(this.terulet());
        //hash = 89 * hash + (int) (Double.doubleToLongBits(this.a) ^ (Double.doubleToLongBits(this.a) >>> 32));
        //hash = 89 * hash + (int) (Double.doubleToLongBits(this.b) ^ (Double.doubleToLongBits(this.b) >>> 32));
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
        final Teglalap other = (Teglalap) obj;
        if(this.terulet() != other.terulet()){
            return false;
        }
        return true;
    }

    
    
}

public class Teglalapok {
    public static void main(String[] args) {
        /* Primitívek csomagolóosztályával működik */
        HashSet<String> nevHalmaz = new HashSet<>();
        boolean siker;
        siker = nevHalmaz.add("Péter");
        if(!siker) {System.out.println("1. nincs bent");}
        
        siker = nevHalmaz.add("Pál");
        if(!siker) {System.out.println("2. nincs bent");}
        
        siker = nevHalmaz.add("Péter");
        if(!siker) {System.out.println("3. nincs bent");}
        
        siker = nevHalmaz.add("Xénia");
        if(!siker) {System.out.println("4. nincs bent");}
        System.out.println(nevHalmaz);
        
        /* Saját típusal */
        Teglalap t1 = new Teglalap(2, 3);
        Teglalap t2 = new Teglalap(1, 6);
        Teglalap t3 = new Teglalap(1, 2);
        
        System.out.println("hc1:" + t1.hashCode());
        System.out.println("hc2:" + t2.hashCode());
        System.out.println("hc3:" + t3.hashCode());
        HashSet<Teglalap> teglaHalmaz = new HashSet<>();
        teglaHalmaz.add(t1);
        teglaHalmaz.add(t2);
        teglaHalmaz.add(t3);
        System.out.printf("%d darab:\n%s\n",teglaHalmaz.size(),teglaHalmaz);
    }
    
}
