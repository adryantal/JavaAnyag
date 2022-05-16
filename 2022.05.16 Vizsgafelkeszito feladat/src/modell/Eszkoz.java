/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modell;

import java.io.Serializable;
import java.text.Collator;
import java.util.Comparator;


public class Eszkoz implements Serializable{
    String nev;
    double suly;

    public Eszkoz(String nev, double suly) {
        this.nev = nev;
        this.suly = suly;
    }

    public String getNev() {
        return nev;
    }

    public double getSuly() {
        return suly;
    }

    @Override
    public String toString() {
        return "Eszkoz{" + "nev=" + nev + ", suly=" + suly + '}';
    }
    
    
     /*STATIKUS RENDEZŐMETÓDUSOK -  - ATTRIBÚTUMOK SZERINTI RENDEZÉSHEZ, COMPARATOR OSZTÁLYOK FELHASZNÁLÁSÁVAL*/
    public static NevComparator NevRendezo() {
        return new NevComparator();
    }
   }  
    
    /*COMPARATOR OSZTÁLYOK - ATTRIBÚTUMOK SZERINTI RENDEZÉSHEZ*/
class NevComparator implements Comparator<Eszkoz> {
    @Override
    public int compare(Eszkoz e1, Eszkoz e2) {
        Collator col = Collator.getInstance();
        return col.compare(e1.getNev(), e2.getNev());
    }
}

