/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sutes;

import java.io.IOException;

public class Suto {

    private boolean bekapcsolva;

    public void setBekapcsolva(boolean bekapcsolva) {
        this.bekapcsolva = bekapcsolva;
    }

    public boolean isBekapcsolva() {
        return bekapcsolva;
    }

    @Override
    public String toString() {
        return "Suto{" + "bekapcsolva=" + bekapcsolva + '}';
    }

    public void sut() throws IOException, SutesException { //tud dobni egy ilyen kivételt, a hívó félnek kezelni kell
        double d = Math.random();
        if (d < .5) {
            System.out.println("Minden OK");
        } else if (d < .8) {
            throw new SutesException("Nem sikerült");
                    
        } else {
        throw new IOException("Valami problema van!");
    }
}

}
