package hengerprogram;

/* ha külön package-ben vannnak a felhasználandó osztályok, importálni kell őket*/
import modell.LyukasHenger;
import modell.Henger;
import java.util.ArrayList;
import modell.TomorHenger;

public class Program {
    
    private ArrayList<Henger> hengerek;
    
    public static void main(String[] args) {
        /*
        Henger h = new Henger(1, 1);
        TomorHenger t = new TomorHenger(2,2);
        LyukasHenger cs = new LyukasHenger(3, 3, 3);
        LyukasHenger cs1 = new LyukasHenger(3, 3, 0.5, 3);
        
        System.out.println("Hengerek száma: " + Henger.getHengerDb());
        */  
        
        /* protected csak utód OSZTÁLYBÓL elérhető */
        //Henger.setHengerDarabMinusEgy();
        new Program().run();
    }

    public Program() {
        hengerek = new ArrayList<>();
        //hengerek.add(new Henger(1, 1));
        //hengerek.add(new Henger(1, 1));
        //hengerek.add(new TomorHenger(1,1));
        //hengerek.add(new TomorHenger(1,1));
        //hengerek.add(new TomorHenger(2,2, 0.8));
        hengerek.add(new LyukasHenger(1, 1, .1));
       //hengerek.add(new LyukasHenger(3, 3, 0.5, 3));
    }
    
    public void run(){
        System.out.printf("A programban szereplő hengerek (%d):\n", Henger.getHengerDb());
        //for (Henger henger : hengerek) {
        for (Henger henger : lista()) {
            System.out.println(henger);
            System.out.println("-------------");
        }
        
        System.out.println("Hengerek átlag térfogata: " + atlagTerfogat());
        System.out.println("Csövek össz súlya: " + csovekSulya());
        
        System.out.printf("A programban szereplő hengerek (%d):\n", Henger.getHengerDb()); //(%d) helyére fog bekerülni Henger.getHengerDb()) értéke
    }
    
    public double atlagTerfogat(){
        double ossz = 0;
        //for (Henger henger : hengerek) {
        for (Henger henger : lista()) {
            ossz += henger.terfogat(); //mindegyik hengertípusnál a legalsó (saját) osztálybeli térfogat metódus fut le
        }
        return ossz / Henger.getHengerDb();
    }
    
    public double csovekSulya(){
        double ossz = 0;
        
        /* Ha nem LyukasHegert alakítunk át, akkor: 
        ClassCastException: hengerprogram.Henger cannot be cast to hengerprogram.LyukasHenger
        */
        for (Henger henger : lista()) {
            /* csak a LyukasHengerket castolhatjuk */
            if(henger instanceof LyukasHenger){ //meg kell vizsgálni, hogy az adott henger valóban a Lyukashenger osztály példánya-e
                ossz += ((LyukasHenger)henger).suly(); //amennyiben igen, akkor castolható, és a TomorHenger osztályban definiált suly() metódust hívjuk meg
            }                                           //mivel a LyukasHenger a TomorHengerből öröklődik, és mindent tud, amit a TomorHenger
                                                        //ehhez szükség van típuskényszerítésre is, mivel a henger változó alapjáraton Henger típusú, és a Henger osztálynak nincs suly() metódusa
                                                        //tehát a henger változót Lyukashenger-ré kell castolni
        }
        return ossz;
    }
    
    private ArrayList<Henger> lista(){
        return hengerek;
    }
}
