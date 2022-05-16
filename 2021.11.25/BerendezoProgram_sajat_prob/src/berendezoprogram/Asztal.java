package berendezoprogram;

public class Asztal {

    private int szel, hossz;
    private String anyag;
    private boolean megteritve;

    public Asztal(int szel, int hossz, String anyag) {
        this.szel = szel;
        this.hossz = hossz;
        this.anyag = anyag;
        megteritve = false;
    }

    public Asztal(int szel, int hossz) {
        this(szel, hossz, "fenyő");
    }

    public int getSzel() {
        return szel;
    }

    public int getHossz() {
        return hossz;
    }

    public String getAnyag() {
        return anyag;
    }

    public boolean isMegteritve() {
        return megteritve;
    }

    public void setMegteritve(boolean megteritve) {
        this.megteritve = megteritve;
    }

    @Override
    public String toString() {
        return "Asztal{" + "szel=" + szel + ", hossz=" + hossz + ", anyag=" + anyag + ", megteritve=" + megteritve + '}';
    }

    public void rajzol() {
        vonal();
        for (int i = 0; i < hossz; i++) {
            char jel = megteritve ? 'O' : ' ';
            vonal('|', jel);
        }
        vonal();
        System.out.println();
    }

    private void vonal() {

        vonal('*', '*');
    }

    private void vonal(char zaro, char jel) {
        System.out.print(zaro);
        for (int i = 0; i < szel; i++) {
            System.out.print(jel);
        }
        System.out.println(zaro);

    }

}
