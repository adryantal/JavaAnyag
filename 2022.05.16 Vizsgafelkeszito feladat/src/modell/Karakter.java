package modell;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class Karakter implements Serializable, Iterable<Karakter>{
    
    //absztrakt osztálynak lehetnek nem absztrakt, tehát általános metódusai is

    String nev, faj;
    private ArrayList<Eszkoz> EszkozLista;

    public Karakter(String nev, String faj) throws InvalidNameException {
        if (nev.length() < 3) {
            throw new InvalidNameException("Helytelen név!");
        } else {
            this.nev = nev;
        }
        this.faj = faj;
        this.EszkozLista = new ArrayList<>();
    }
    
    public void felvesz(Eszkoz e){
        this.EszkozLista.add(e);
    }
    
     public void eldob(int index){ //https://www.javatpoint.com/remove-an-element-from-arraylist-in-java
         this.EszkozLista.remove(index);       
    }
     
      public void eldob(Eszkoz e){ //https://www.javatpoint.com/remove-an-element-from-arraylist-in-java
         this.EszkozLista.remove(e);
    }

    public String getNev() {
        return nev;
    }

    public String getFaj() {
        return faj;
    }
    
    public ArrayList<Eszkoz> getEszkozListaNevRend (){
    ArrayList<Eszkoz> masolatLista = new ArrayList<>();
        for (Eszkoz e : EszkozLista) {
            masolatLista.add(e);
        }
      masolatLista.sort(Eszkoz.NevRendezo());
       return masolatLista;
    }

    public ArrayList<Eszkoz> getEszkozLista() {
        //másolatlistát adunk vissza    
        ArrayList<Eszkoz> masolatLista = new ArrayList<>();
        for (Eszkoz e : EszkozLista) {
            masolatLista.add(e);
        }

        return masolatLista;
    }
    
    public String kiir(){
    StringBuilder str = new StringBuilder();
     str.append("Karakter\n\tNév: ").append(this.nev).append("\n\t");
     str.append("Faj: ").append(this.faj).append("\n\t");
     str.append("Eszközök: ").append("\n");
      for (Eszkoz e : this.getEszkozLista()) {
          str.append("\t\t").append(e.toString()).append("\n");  
        }   
   
    return str.toString();
    }
    
      
     
    @Override
    public String toString() {
        
        return kiir();
       // return "Karakter{" + "nev=" + nev + ", faj=" + faj + ", EszkozLista=" + EszkozLista + '}';
    }

    @Override
    public Iterator iterator() {
        return EszkozLista.iterator();
    }
    
    
    class Karakterterator implements Iterator<Eszkoz> {

        private int ind;

        public Karakterterator() {
            ind = 0;
        }

        @Override
        public boolean hasNext() {
            return ind < EszkozLista.size();
        }

        @Override
        public Eszkoz next() {
            return EszkozLista.get(ind++);
        }

    }
    
    

}
