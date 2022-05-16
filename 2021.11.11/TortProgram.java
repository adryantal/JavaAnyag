package egysegbezaras;
public class TortProgram {
    public static void main(String[] args) {
        Tort tort1 = new Tort();
        tort1.szamlalo = 1;
        tort1.nevezo = 3;
        System.out.print("tort1: ");
        tort1.mutat();
        
        System.out.println("tört reciproka: ");
        tort1.reciprokraValt();
        System.out.print("tort1: ");
        tort1.mutat();
        
        Tort tort2 = new Tort();
        tort2.szamlalo = 3;
        tort2.nevezo = 5;
        System.out.print("tort2: ");
        tort2.mutat();
        
        System.out.println("tört reciproka egy másik törtben:");
        Tort t = tort2.reciprokotVisszaAd();
        System.out.print("tort2: ");
        tort2.mutat();
        System.out.print("t: ");
        t.mutat();
    }
    
}
