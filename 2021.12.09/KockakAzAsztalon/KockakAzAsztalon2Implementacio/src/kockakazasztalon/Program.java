package kockakazasztalon;

public class Program {

    public static void main(String[] args) {
        Asztal asztal = new Asztal(); //példányosítás
        //ha belerugok, akkor tobbet nem erem el a kockakat...        
       
        
        Kocka[] kockak = {new Kocka(), new Kocka()};
        asztal = new Asztal(kockak); 
        asztal.belerug(); //itt az asztalról lekerülnek a kockák, tehát azon keresztül már nem érhetőek el, mert az asztalbeli kockak
                          //az asztal változóhoz egy üres kockatömböt rendeltünk, viszont az ebben az osztályban definiált kockak tömb továbbra is fennmarad! (ismertség és nem tartalmazás)
        System.out.println("Kockák a talajon: ");
        System.out.println("k0: " + kockak[0].megnez());
        System.out.println("k1: " + kockak[1].megnez());
        
        
        
        
        /*SAJÁT HOZZÁADÁS:*/
        
         Asztal asztal2 = new Asztal(); //a paraméter nélküli konstruktorral 2 kocka obj. létrejön
        System.out.println(asztal2.toString());
        
        Asztal asztal3=new Asztal(3); //kockaDB-os konstruktor
         //System.out.println(asztal3.toString()); //itt lefuttatva a toStringet nullPointerExceptiont kapunk (nem működik a kockaDb-os konstruktor???)
        Kocka kockak3[] = {new Kocka(), new Kocka(), new Kocka(), new Kocka()};
        asztal3 = new Asztal(kockak3); //felülíródik az asztal3
        System.out.println(asztal3.toString());
        
        /*megjegyzés: a kockaDb paraméteres konstruktort ki is lehet hagyni, elég egy kockatömböt definiálni, és azt átadni a kockatömb paraméteres konstruktornak*/
    }
    
}
