package sutes;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Program {
    public static void main(String[] args) {
        SutiSutes suti = new SutiSutes();
        suti.sutes();
//        Suto suto = new Suto();
//        suto.setBekapcsolva(true);
//        try {
//            suto.sut();
//            //suto.setBekapcsolva(false);
//        } catch (IOException ex) {
//            //Logger.getLogger(Program.class.getName()).log(Level.SEVERE, null, ex);
//            System.err.println(ex.getMessage());
//            //suto.setBekapcsolva(false);
//        } finally{
//            suto.setBekapcsolva(false);
//        }
        
        System.out.println("sütő bekapcsolva: " + suti.sutoAllapota());

        /* 
        Suto s = suti.getSuto();
        System.out.println(s);

        //lehet setternek használni a gettert!:
        s.setBekapcsolva(true);
        System.out.println(s);
        */
    }
}
