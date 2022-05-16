
package jatek;

public abstract class Jatek {
    private static int jatekDb;

    public static int getJatekDb() {
        return jatekDb;
    }

    public Jatek() {
        jatekDb++;
    }    
    
    
     public abstract void kezd();
    
     public abstract void ment();
     
     public abstract void vege();

    
    
    
}
