package hengerprogram;

import java.util.ArrayList;

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
    }

    public Program() {
        hengerek = new ArrayList<>();
        hengerek.add(new Henger(1, 1));
        hengerek.add(new Henger(1, 1));
        hengerek.add(new TomorHenger(2,2));
        hengerek.add(new LyukasHenger(3, 3, 3));
        hengerek.add(new LyukasHenger(3, 3, 0.5, 3));
    }
    
    public void run(){
        
    }
    
    public double atlagTerfogat(){
        return 0;
    }
    
    public double csovekSulya(){
        return 0;
    }
    
    private ArrayList<Henger> lista(){
        return hengerek;
    }
}
