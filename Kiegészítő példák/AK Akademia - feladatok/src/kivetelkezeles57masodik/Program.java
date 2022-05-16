package kivetelkezeles57masodik;

public class Program {

    public static void main(String[] args) {
        Auto auto = new Auto();
        Lada lada = new Lada();
        //Suzuki suzuki = new Suzuki();
        if (auto instanceof Auto) {
            System.out.println("Az auto referencia változó Auto típusú objektumra mutat");
        }
        if (lada instanceof Lada) {
            System.out.println("A lada referencia változó Lada típusú objektumra mutat");
        }
        if (lada instanceof Auto) {
            System.out.println("A lada referencia változó Auto típusú objektumra mutat");
        }
        if (auto instanceof Lada) { //nem igaz
            System.out.println("Az auto referencia változó Lada típusú objektumra mutat");
        }

    }
    
    //az instanceof segítségével vizsgálja a program, melyik kivételosztálynak megfelelő catch ág fusson le 

}
