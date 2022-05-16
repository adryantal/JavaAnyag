package berendezoprogram;

public class Asztal {
    /* ADATTAGOK -rejtve a külvilág elől */
    private int szel, hossz;
    private String anyag;
    private boolean megteritve;
    
    /* TAGFÜGGVÉNYEK */
    /* GENERÁLT KÓD: ALT + INSERT */
    //MINDEN cstr: MINDEN adattagot inicializálnia kell
    public Asztal(int szel, int hossz) {
        this(szel, hossz, "fenyő"); //legyen a default anyag "fenyő"
        //this.szel = szel;
        //this.hossz = hossz;
    }

    public Asztal(int szel, int hossz, String anyag) {
        this.szel = szel;
        this.hossz = hossz;
        this.anyag = anyag;
        megteritve = false; //kezdetben ne legyen megterítve; false legyen a default érték
    }

    public int getSzel() { return szel; }
    public int getHossz() { return hossz; }
    public String getAnyag() { return anyag; }
    public boolean isMegteritve() { return megteritve; }

    public void setMegteritve(boolean ertek) {
        this.megteritve = ertek;
    }

    @Override
    public String toString() {
        return "Asztal{" + "szel=" + szel + ", hossz=" + hossz + ", anyag=" + anyag + ", megteritve=" + megteritve + '}';
    }
    
    /* SAJÁT */
    public void rajzol(){
        vonal();
        for (int i = 0; i < hossz; i++) {
            char jel = megteritve ? 'O' : ' ';
            vonal('|', jel);
        }
        vonal();
    }

    private void vonal() {
        vonal('*','*');
    }

    private void vonal(char zaro, char jel) {
        System.out.print(zaro);
        for (int i = 0; i < szel; i++) {
            System.out.print(jel);
        }
        System.out.println(zaro);
    }
}
