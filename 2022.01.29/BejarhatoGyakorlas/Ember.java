package gyakorlas;

public class Ember {
    private String nev;
    private int kor;

    public Ember(String nev, int kor) {
        this.nev = nev;
        this.kor = kor;
    }

    @Override
    public String toString() {
        return "Ember{" + "nev=" + nev + ", kor=" + kor + '}';
    }
}
