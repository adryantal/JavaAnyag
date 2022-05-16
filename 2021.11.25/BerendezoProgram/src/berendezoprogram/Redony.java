package berendezoprogram;
public class Redony {
    /* ADATTAGOK -rejtve a külvilág elől */
    private int szel, mag, aktMag;  //mag: a redőny teljes hossz, max. eddig engedhető tehát le
    private boolean zart;
    
    /* TAGFÜGGVÉNYEK */
    /* GENERÁLT KÓD: ALT + INSERT */
    //cstr: minden adattagot inicializálnia kell
    public Redony(int szel, int mag) {
        this.szel = szel;
        this.mag = mag;
        //alapállapothoz inicializálom a köv. változókat (teljesen felhúzott és zárt redőny)
        aktMag = 0; 
        zart = true;
    }

    //setter
    //public void setAktMag(int aktMag) { this.aktMag = aktMag; }
    public void leenged(int aktMag) {
        if(aktMag > mag){ aktMag = mag; }
        this.aktMag = aktMag; 
    }

    public void setZart(boolean zart) {
        this.zart = zart;
    }
    
    //getterek
    public int getSzel() { return szel; }
    public int getMag() { return mag; }
    public int getAktMag() { return aktMag; }    
    public boolean isZart() { return zart; }

    @Override
    public String toString() {
        return "Redony{" + "szel=" + szel + ", mag=" + mag + ", aktMag=" + aktMag + ", zart=" + zart + '}';
    }
    
    /* SAJÁT */
    //az info feladatát a generált toString látja el
    //public void info(){ /* adattagok kiírása */ }
    
    public void felhuz(){
        aktMag = 0;
    }
    
    public void rajzol(){
        
        vonal();
        for (int i = 0; i < aktMag; i++) {
            char koztesJel = zart ? ' ' : '-'; //ha zárt, akkor szóköz legyen a köztes jel, egyébként pedig -
            vonal('|', koztesJel);
        }
        vonal();
    }

    private void vonal() { //a legfelső és legalsó vonal megrajzolása, amely a redőny tetejét és alját jelöli
        vonal('*','*'); //a 2 paraméterest hívja (ami itt alatta van)
    }

    private void vonal(char szelsoJel, char koztesJel) {
        System.out.print(szelsoJel);
        for (int i = 0; i < szel; i++) {
            System.out.print(koztesJel);
        }
        System.out.println(szelsoJel);
    }
    
}
