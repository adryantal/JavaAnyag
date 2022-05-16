package faidomokprogram;

import idomok.FaIdom;
import idomok.Gomb;
import idomok.Hasab;
import java.util.ArrayList;

public class FaIdomok {
    private ArrayList<FaIdom> idomok;

    public FaIdomok() {
        idomok = new ArrayList<>();
        idomok.add(new Gomb(1));
        idomok.add(new Hasab(1, 1, 1));
        idomok.add(new Hasab(2, 2, 2));
        idomok.add(new Gomb(2));
        idomok.add(new Hasab(3, 3, 3));
    }
    
    public void run(){
        System.out.println("Idomok listája:");
        //System.out.println(idomok);
        for (FaIdom idom : idomok) {
            System.out.println(idom);
        }
        
        System.out.println("Idomok összes súlya: " + osszSuly());
        System.out.println("Gömbök összes súlya: " + osszGombSuly());
        
        FaIdom minVIdom = minV();
        FaIdom maxVIdom = maxV();
        System.out.println("min V: " + minVIdom);
        System.out.println("max V: " + maxVIdom);
    }
    
    public double osszSuly(){
        double ossz = 0;
        for (FaIdom idom : idomok) {
            ossz += idom.suly();
        }
        return ossz;
    }
    
    public double osszGombSuly(){
        double ossz = 0;
        for (FaIdom idom : idomok) {
            if(idom instanceof Gomb){
                ossz += idom.suly();
            }
        }
        return ossz;
    }
    
    public FaIdom minV(){
        int ind = 0;
        for (int i = 1; i < idomok.size(); i++) {
            if(idomok.get(i).terfogat() < idomok.get(ind).terfogat()){
                ind = i;
            }
        }
        return idomok.get(ind);
    }
    
    public FaIdom maxV(){
        int ind = 0;
        for (int i = 1; i < idomok.size(); i++) {
            if(idomok.get(i).terfogat() > idomok.get(ind).terfogat()){
                ind = i;
            }
        }
        return idomok.get(ind);
    }
}
