package teglalap;

public class Teglalap {

    private int a;
    private int b;

    public Teglalap(int a, int b) throws IllegalArgumentException {
////        this.a = a;
////        this.b = b;
////        boolean letrehozhato = a > 0 && b > 0;

//        if (letrehozhato) {
            setA(a);
            setB(b);
//        } else {
//            throw new IllegalArgumentException("Nem megfelelő adatok!");
//        }

    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setA(int a) {
        if (a > 0) {
            this.a = a;
        } else {
            throw new IllegalArgumentException("Nem megfelelő adat!");

        }
    }

    public void setB(int b) {

          if (b > 0) {
            this.b = b;
        } else {
            throw new IllegalArgumentException("Nem megfelelő adat!");

        }
    }

    public int szamolKerulet() {
        return this.a * this.b;
    }

    public int szamolTerulet() {
        return 2 * this.a + 2 * this.b;
    }

    @Override
    public String toString() {
        return "{A téglalap oldalai:" + this.a + ", " + this.b + ", kerülete:" + this.szamolKerulet() + ", területe:" + this.szamolTerulet() + "}";
    }
}
