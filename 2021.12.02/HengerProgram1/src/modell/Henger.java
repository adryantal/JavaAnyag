package modell;
public class Henger {
    
    private static int hengerDb = 0; //osztályszintű számláló; amikor létrejön egy példány, mindig növeljük 1-el
    public static int getHengerDb() { return hengerDb; }
    //public static void setHengerDarab(int db){ hengerDb -= db; }
    protected static void setHengerDarabMinusEgy(){ hengerDb--; }
   
    private double r, m;
 
    public Henger(double r, double m) {
        this.r = r;
        this.m = m;
        hengerDb++;
    }

    public double getR() { return r; }
    public double getM() { return m; }

    @Override
    public String toString() {
        return "Henger{" + "r=" + r + ", m=" + m + '}';
    }
    
    public double terfogat(){
        return Math.pow(r, 2) * Math.PI * m;
    }
}
