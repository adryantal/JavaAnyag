package alap;
public class InterfaceHasznalat {
    public static void main(String[] args) {
        Ajto ajto = new Ajto();
        Esernyo esernyo = new Esernyo();
        
        Object[] objTargyak = {ajto, esernyo, new Boolean(true)};
        
        IKinyithato[] kinyithatoTargyak = {ajto, esernyo};
        
        System.out.println("kinyitható tárgyak:");
        for (IKinyithato targy : kinyithatoTargyak) {
            targy.kinyit();
        }
        
        System.out.println("Egyenként:");
        IKinyithato kinyithato;
        kinyithato = new Ajto(); //'interfész tapusú változó' = new Objektum(); --> olyan obj. amely megvalósítja azt az interfészt, amelyből a változó származik
        kinyithato.kinyit();
        kinyithato = new Esernyo();
        kinyithato.kinyit();
        /* Általában NEM példányosítjuk az interface típust,
        ilyenkor névtelen belső osztályt kapunk
        */
        kinyithato = new IKinyithato() {
            @Override
            public void kinyit() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        kinyithato.kinyit();//UnsupportedOperationException
    }
    
}
