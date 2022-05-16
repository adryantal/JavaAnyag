package sajat;
public class SokSzog extends Alakzat implements IPontjaiVannak, IRajzol3D{

    public SokSzog(String nev) {
        super(nev);
    }

    @Override
    public void rajzol() {
        System.out.println("Sokszög rajzolása");
    }

    @Override
    public int pontok() {
        return 6;
    }

    @Override
    public void rajzol3D() {
        System.out.println("3D Sokszög rajzolása");
    }
    
}
