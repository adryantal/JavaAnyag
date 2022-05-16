package sutes;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SutiSutes {
    private Suto suto;

    public SutiSutes() {
        suto = new Suto();
    }
    
    void sutes(){
        suto.setBekapcsolva(true);
        try {
            suto.sut();
            //suto.setBekapcsolva(false);
        } 
        //legspec kivétel
        catch (IOException ex) {
            //Logger.getLogger(Program.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println(ex.getMessage());
            //suto.setBekapcsolva(false);
        }
        catch (SutesException ex) {
            //Logger.getLogger(SutiSutes.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println(ex.getMessage());
        } 
        //legált. kivétel
        catch(Exception ex){
            System.err.println("ez nem lehet...");
        }
        finally{
            suto.setBekapcsolva(false);
        }
    }

    boolean sutoAllapota(){
        return suto.isBekapcsolva();
    }
    /* ez setter!!!
    public Suto getSuto() {
        return suto;
    }*/
    
    
}
