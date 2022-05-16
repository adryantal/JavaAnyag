package egysegbezaras;
public class PontProgram {
    public static void main(String[] args) {
        Pont p1 = new Pont();
        Pont p2 = new Pont();
        
        String valasz = p1.fedi(p2) ? "fedésben van" : "nincs fedésben";
        System.out.printf("p1(x:%d, y:%d) %s p2(x:%d, y:%d) ponttal\n", p1.x, p1.y, valasz, p2.x, p2.y);
        
        p1.x = 3;
        p1.y = 4;
        
        System.out.print("p1: ");
        p1.info();
        
        System.out.println("p1 távolsága az origótól: " + p1.tavOrigotol());
    }
}
