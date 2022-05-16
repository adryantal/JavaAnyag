package hengerprogram;
public class Henger {
    
    private static int hengerDb = 0;
    public static int getHengerDb() { return hengerDb; }
   
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
        return 0;
    }
}
