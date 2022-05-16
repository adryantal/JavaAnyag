package egysegbezaras;
public class HaromszogEsPontProgram {
    public static void main(String[] args) {
        Haromszog h = new Haromszog();
        
        h.kozep.x = 10;
        h.kozep.y = 0;
        h.info();
        szerkeszthetosegiVizsgalat(h);
        System.out.println("------------------");
        
        h.a = 3;
        h.b = 3;
        h.c = 5;
        h.info();
        if(h.szerkesztheto()){
            derekszogVizsgalat(h);
            System.out.println("A háromszög távolsága az origótól: " + h.tavOrigotol());
        }
        System.out.println("------------------");
        
        h.a = 3;
        h.b = 4;
        h.c = 5;
        h.kozep.x = 5;
        h.kozep.y = 12;
        h.info();
        if(h.szerkesztheto()){
            derekszogVizsgalat(h);
            System.out.println("A háromszög távolsága az origótól: " + h.tavOrigotol());
        }
    }

    private static void szerkeszthetosegiVizsgalat(Haromszog h) {
        if(h.szerkesztheto()){
            System.out.println("szerkeszthető");
        }else{
            System.out.println("nem szerkeszthető");
        }
    }

    private static void derekszogVizsgalat(Haromszog h) {
        if(h.derekszogu()){
            System.out.println("derékszögű");
        }else{
            System.out.println("nem derékszögű");
        }
    }
}
