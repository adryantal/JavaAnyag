package sajat;
public class HaromSzog extends Alakzat implements IPontjaiVannak{

    public HaromSzog(String nev) {
        super(nev);
    }

    @Override
    public void rajzol() {
        System.out.println("Háromszög rajzolása");
    }

    @Override
    public int pontok() {
        return 3;
    }
    
}
