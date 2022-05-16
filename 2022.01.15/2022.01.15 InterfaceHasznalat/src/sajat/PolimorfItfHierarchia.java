
//ABsztr. osztály: "sablon"
//Interfész: képesség(ek) tárolása absztrakt metódusok formájában. 
//Ha egy adott osztály példányai egy képesség birtokában vannak, akkor az osztálynak implementálnia kell a képességet tároló interfészt.
//Azt, hogy egy osztály példányai HOGYAN viselkednek egy képesség megvalósításakor, azt az osztály a képességet leíró metódusa fejti ki.

package sajat;
public class PolimorfItfHierarchia {
    public static void main(String[] args) {
        SokSzog sokszog = new SokSzog("Sokszög-1");
        HaromSzog hszog = new HaromSzog("Háromszög-1");
        
        String elvVonal = "\n------------------------------------\n";
        
        Alakzat[] alakzatok = {sokszog, hszog, new Kor("Kör-1"), new HaromDKor("3D Kör-1")};
        
        System.out.println("Alakzatok:");
        for (Alakzat alakzat : alakzatok) {
            System.out.println("\t"+alakzat.nev);
            System.out.print("\t\t");
            alakzat.rajzol();
        }
        
        System.out.println(elvVonal);
        
        System.out.println("Amely alakzatoknak pontjai vannak:");
        /* ClassCastException */
        //Kor kor = new Kor("kör");
        //IPontjaiVannak ipvKor = (IPontjaiVannak)kor;
        //System.out.println("kör pontjai: " + ipvKor.pontok());
        for (Alakzat alakzat : alakzatok) {
            if(alakzat instanceof IPontjaiVannak){
                String nev = alakzat.nev;
                //azon alakzatok, amelyek megvalósítják az IPontjaiVannak interfészt
                int pontDb = ((IPontjaiVannak) alakzat).pontok(); //típuskényszeríteni kell
                System.out.printf("\t%s: %d pontja van\n",nev, pontDb);
            }
        }
        
        System.out.println(elvVonal);
        
        System.out.println("3D-ben rendelhető alakzatok:");
        for (Alakzat alakzat : alakzatok) {
            if(alakzat instanceof IRajzol3D){
                System.out.println("\t"+alakzat.nev);
                System.out.print("\t\t");
                //azon alakzatok, amelyek megvalósítják az IRajzol3D interfészt
                ((IRajzol3D) alakzat).rajzol3D();    //típuskényszeríteni kell
            }
        }
    }
}
