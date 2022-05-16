package allapotio;

import java.io.Serializable;

public class Ember implements Serializable{ //ez a stream miatt kell
    
    //To serialize an object means to convert its state to a byte stream so that the byte stream 
    //can be reverted back into a copy of the object. 
    //A Java object is serializable if its class or any of its superclasses implements either the java.
    
    
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
