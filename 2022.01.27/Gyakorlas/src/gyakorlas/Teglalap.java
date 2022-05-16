package gyakorlas;

import java.util.Locale;

public class Teglalap implements Comparable<Teglalap>{
    private double a, b;

    public Teglalap(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() { return a; }
    public double getB() { return b; }

    public double terulet(){
        return a*b;
    }
    
    @Override
    public String toString() {
        Locale loc = Locale.ENGLISH;
        return "Teglalap{" 
                + "a=" + String.format(loc,"%5.2f",a) 
                + ", b=" + String.format(loc,"%5.2f",b)  
                + ", ter: " + String.format(loc,"%5.2f",terulet()) 
                + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.a) ^ (Double.doubleToLongBits(this.a) >>> 32));
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.b) ^ (Double.doubleToLongBits(this.b) >>> 32));
        return hash;
    }

    //Tekintsünk 2 téglalapot egyenlőnek akkor, ha területük megegyezik
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
//        if (this.a != other.a) {
//            return false;
//        }
//        if (this.b != other.b) {
//            return false;
//        }
        return true;
    }

    @Override
    public int compareTo(Teglalap o) {
        //1
//        if(this.terulet() > o.terulet()){
//            return 1;
//        }else if(this.terulet() < o.terulet()){
//            return -1;
//        }else{
//            return 0;
//        }

        //2
        return Double.compare(this.terulet(), o.terulet());
    }
    
    
}
