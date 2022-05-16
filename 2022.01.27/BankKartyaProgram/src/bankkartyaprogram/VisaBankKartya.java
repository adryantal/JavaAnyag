package bankkartyaprogram;
public class VisaBankKartya extends BankKartya{
    
    public VisaBankKartya(int egyenleg) {
        super(egyenleg);
    }

    @Override
    public String toString() {
        return "VisaBankKartya{" + super.toString() + '}';
//        String sep = System.lineSeparator();
//        return "VisaBankKartya{" 
//                + sep + "\t" + super.toString()
//                + sep + '}';
    }
    
    
}
