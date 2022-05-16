package berendezoprogram;
public class BerendezoProgram {
    public static void main(String[] args) {
        Redony r1 = new Redony(3, 4);
        r1.leenged(r1.getMag());
        //r1.info();
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
        
        System.out.println("----------\nASZTAL:");
        Asztal a = new Asztal(1,2);
        System.out.println(a.toString());
        a.rajzol();
        
        a.setMegteritve(true);
        System.out.println(a.toString());
        a.rajzol();
        
        System.out.println("----------\nSZOBA:");
        Szoba szoba = new Szoba(r1, new Redony(2, 2), a);
        //Szoba szoba = new Szoba(r1, r1, a);//1 redőny duplán van
        //szoba.asztal.rajzol();
        
        System.out.println("A szoba első redőnye: ");
        System.out.println(szoba.getElsoRedony().toString());
        System.out.println("minden redőnyt leengedek");
        szoba.mindenRedonytLeenged();
        System.out.println("Szoba állapota: ");
        System.out.println(szoba.toString());
    }
    
}
