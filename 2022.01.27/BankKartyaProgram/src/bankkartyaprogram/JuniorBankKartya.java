package bankkartyaprogram;

public class JuniorBankKartya extends BankKartya{
    
    public JuniorBankKartya(int egyenleg) {
        super(egyenleg);
    }

    @Override
    public String toString() {
        return "JuniorBankKartya{" + super.toString() + '}';
//        String sep = System.lineSeparator();
//        return "JuniorBankKartya{" 
//                + sep + "\t" + super.toString()
//                + sep + '}';
    }
    
}
