package sajat;
public class HaromDKor extends Kor implements IRajzol3D{
    
    public HaromDKor(String nev) {
        super(nev);
    }

    @Override
    public void rajzol() {
        //meg lehetne hívni az őst
        System.out.println("3D Kör rajzolása 2D módban");
    }

    @Override
    public void rajzol3D() {
        System.out.println("3D Kör rajzolása");
    }
    
}
