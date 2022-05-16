package idomok;

public abstract class FaIdom {
    private static double fajsuly = 0.8;
    
    public abstract double terfogat(); //absz. metódus --> az utódoknak is lesz térfogat metódusuk, de utódonként testreszabott formában
    
    public double suly(){
        return 0;
    }
    
    /* Generált ALT + INSERT */
    @Override
    public String toString() {
        return super.toString();
    }
    
}
