package kivetelkezeles;

public class Muvelet {

    void szamol(String szam) {
        int c = 0;
        try {
            int a = Integer.parseInt(szam);
            int b = 0;
            c = a / b;

            System.out.println("eredmény: " + c);
            
            //egy kalap alatt kezelve
        } catch (NumberFormatException | ArithmeticException ex) {

            System.err.println("A paraméter nem szám! ");
            System.err.println("0-val nem oszthatunk " + ex.getMessage());
            
            for (StackTraceElement st: ex.getStackTrace()){ //megmutatja a kivétel "terjedési" láncát
                System.out.println(st);
           
            }
            
            //külön kezelve
//        } catch (NumberFormatException nx) {
//            //itt már van vmi hiba,  ne akarjunk FELTÉTLEN helyes működést elérni
//            System.err.println("A paraméter nem szám! " + nx.getMessage());
//        } catch (ArithmeticException ax) {
//            //itt már van vmi hiba,  ne akarjunk FELTÉTLEN helyes működést elérni
//            System.out.println("eredmény: " + c);
//            System.err.println("0-val nem oszthatunk " + ax.getMessage());
//        }

        }
    }
}
