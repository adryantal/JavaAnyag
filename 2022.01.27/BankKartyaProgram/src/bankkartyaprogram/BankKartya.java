package bankkartyaprogram;

public abstract class BankKartya implements Comparable<BankKartya>{
    private int egyenleg;

    public BankKartya(int egyenleg) {
        this.egyenleg = egyenleg;
    }

    @Override
    public String toString() {
        return "BankKartya{" + "egyenleg=" + egyenleg + '}';
    }

    @Override
    public int compareTo(BankKartya o) { // egyenleg alapján tört. rendezés
        return this.egyenleg - o.egyenleg;
    }
    
}
