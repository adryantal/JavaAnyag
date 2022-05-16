package kivetelkezeles;

public class Muvelet {
    void szamol(String szam){
        int c = 0;
        try {
            int a = Integer.parseInt(szam);
            int b = 0;
            c = a / b;
            System.out.println("eredmény: " + c);
        }catch (NumberFormatException | ArithmeticException ex){
            System.err.println("A paraméter nem szám!"); //NumberFormatException: the application has attempted to convert a string to one of the numeric types, but that the string does not have the appropriate format.
            System.err.println(ex.getMessage());
            
            for (StackTraceElement st : ex.getStackTrace()) {
                System.out.println(st);
            }
        }
//        } catch (NumberFormatException nx) {
//            /* itt már van valami hiba,
//            itt ne akarjunk FELTÉTLEN helyes működést elérni!
//            */
//            //System.out.println("eredmény: " + c);
//            System.err.println("A paraméter nem szám!");
//            System.err.println(nx.getMessage());
//        } catch (ArithmeticException ax){
//            /* itt már van valami hiba,
//            itt ne akarjunk FELTÉTLEN helyes működést elérni!
//            */
//            //System.out.println("eredmény: " + c);
//            System.err.println("Nem lehet osztani 0-val!");
//            System.err.println(ax.getMessage());
//        }
    }
}
