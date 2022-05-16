package sutes;

import java.io.IOException;

public class Suto {
    private boolean bekapcsolva;

    public boolean isBekapcsolva() {
        return bekapcsolva;
    }

    public void setBekapcsolva(boolean bekapcsolva) {
        this.bekapcsolva = bekapcsolva;
    }

    @Override
    public String toString() {
        return "Suto{" + "bekapcsolva=" + bekapcsolva + '}';
    }
    
    public void sut() throws IOException, SutesException{
        double d = Math.random();
        if(d < .5){
            System.out.println("Minden rendben, süti elkészült!");
        }else if(d < .8){
            throw new SutesException("Nem sikerült a süti!");
        }else{
            throw new IOException("Valami baj van...");
        }
    }
}
