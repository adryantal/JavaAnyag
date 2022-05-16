package berendezoprogram;

import java.util.Collections;

public class Redony {

    private int szel, mag;
    private int aktMag;
    private boolean zart;
    public static final String RESET = "\u001B[0m";
    public static final String PURPLE = "\u001B[35m";
    public static final String BLUE = "\u001B[34m";
    public static final String CYAN = "\u001B[36m";

    public Redony(int szel, int mag, boolean zart) {
        this.szel = szel;
        this.mag = mag;
        this.zart = zart;
    }

    public Redony(int szel, int mag) {
        this.szel = szel;
        this.mag = mag;
        aktMag = 0;
        zart = true;
    }

    public int getAktMag() {
        return aktMag;
    }

    public int getSzel() {
        return szel;
    }

    public int getMag() {
        return mag;
    }

    public boolean isZart() {
        return zart;
    }

    public void setZart(boolean zart) {
        this.zart = zart;
    }

    public void setAktMag(int aktMag) {
        this.aktMag = aktMag;
    }

    @Override
    public String toString() {
        return "Redony{" + "szel=" + szel + ", mag=" + mag + ", aktMag=" + aktMag + ", zart=" + zart + '}';
    }

    /*public void setAktMag(int aktMag) {
        this.aktMag = aktMag;
    }*/
    public void leenged(int egyseg) {
        if(egyseg<=mag)
            setAktMag(egyseg);
    }

    /* public void info(){     
     }*/
    public void felhuz() {
        setAktMag(0);
    }

    public void rajzol() {
        rajzolSzelesseg();
        rajzolMagassag();
        rajzolSzelesseg();
    }

    public void rajzolSzelesseg() {
        for (int i = 0; i < szel + 2; i++) {
            System.out.print(CYAN+"*");
        }
        System.out.println(RESET);
    }

    public void rajzolMagassag() {
        boolean elhuzva = isZart();
        if (!elhuzva) {

            for (int i = 0; i < aktMag; i++) {
                System.out.print(PURPLE+'|'+RESET + String.join("", Collections.nCopies(szel, " ")) + PURPLE+'|'+RESET + '\n');
            }
        } else {
            for (int i = 0; i < aktMag; i++) {
                System.out.print(PURPLE+'|' +BLUE + String.join("", Collections.nCopies(szel, "-")) +  PURPLE+'|' +RESET+ '\n');

            }

        }
    }

}
