package gyakorlas;
public class NevsorProgram {
    public static void main(String[] args) {
        Nevsor ns = new Nevsor();
        
        System.out.println("biztonságos getter:");
        for (Ember ember : ns.getEmberLista()) {
            System.out.println(ember);
        }
        
        System.out.println("\nnem módosítható lista:");
        for (Ember ember : ns.getEmberUnModLista()) {
            System.out.println(ember);
        }
        
        System.out.println("\niterátorral:");
        for (Object n : ns) {
            System.out.println(n);
        }
    }
}
