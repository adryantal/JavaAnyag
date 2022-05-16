package sutes;

public class SutesException extends Exception{ //saját kivételosztály; mindig extendálnia kell az Exception őst

    public SutesException(String uzenet) {
        super(uzenet);
    }
    
}
