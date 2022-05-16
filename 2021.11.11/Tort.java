package egysegbezaras;
public class Tort {
    int szamlalo;
    int nevezo;
    
    public void mutat(){
        System.out.printf("Tört értéke: %d/%d\n",szamlalo, nevezo);
    }
    
    double ertek(){
        return szamlalo / nevezo;
    }

    void reciprokraValt(){
        int csere = nevezo;
        nevezo = szamlalo;
        szamlalo = csere; 
    }

    Tort reciprokotVisszaAd(){
        Tort t = new Tort();
        t.szamlalo = this.nevezo;
        t.nevezo = this.szamlalo;
        return t;
    }

}
