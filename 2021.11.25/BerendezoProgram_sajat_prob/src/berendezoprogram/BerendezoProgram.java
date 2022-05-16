
package berendezoprogram;


public class BerendezoProgram {

  
    public static void main(String[] args) {
        
        Redony r1 = new Redony(4,3);
        
        r1.leenged(r1.getMag());
        System.out.println(r1.toString());
        r1.rajzol();
        
        r1.felhuz();
        System.out.println(r1.toString());
        r1.rajzol();
        
        r1.leenged(2);
        System.out.println(r1.toString());
        r1.rajzol();
        
        r1.setZart(false);
        r1.leenged(3);
        System.out.println(r1.toString());
        r1.rajzol();
        
     
         System.out.println("\nASZTAL\n");
       Asztal a = new Asztal(1,2);
        System.out.println(a.toString());
        a.rajzol();
        
        a.setMegteritve(true);
        System.out.println(a.toString());
        a.rajzol();
        
        
          System.out.println("\nSZOBA\n");          
          Szoba szoba = new Szoba(r1, new Redony(2,2), a); //ha 2x akarom pl. r1*et berakni, az HIBA!     
         System.out.println(szoba.toString());
          
    }
    
}
