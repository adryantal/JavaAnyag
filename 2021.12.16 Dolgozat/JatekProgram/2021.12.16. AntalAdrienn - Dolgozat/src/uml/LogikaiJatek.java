
package uml;


public class LogikaiJatek extends Jatek{
    
     private Babu[][] tabla = new Babu[4][5];
     private int[] sorrend= new  int[10];
     private int babuDb;

    public LogikaiJatek(int babuDb) {
        this.babuDb = babuDb;
        this.tabla = tabla;
        this.sorrend = sorrend;
    }

    public LogikaiJatek() {        
        this(3);
    }
    
    public boolean van8FelettEro(){
        return true;
    }
     
      @Override
    public void kezd() {
      
    }
    
        @Override
    public void ment() {
      
    }
    
        @Override
    public void vege() {
      
    }

    @Override
    public String toString() {
        return "LogikaiJatek{" + "tabla=" + tabla + ", sorrend=" + sorrend + ", babuDb=" + babuDb + '}';
    }
    
    
     
    
}
