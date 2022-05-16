package egysegbezaras;
public class KorProgram {
    public static void main(String[] args) {
        System.out.println("Kör program");
        Kor kor = new Kor();
        kor.info();
        
        kor.r = 1;
        kor.info();
        
        kor.szin = "piros";
        kor.info();
        
        kor.setSzin("green");
        if(kor.getSzin().equals("zöld")){
            System.out.println("a kör zöld színű");
        }else{
            System.out.println("a kör színe: " + kor.getSzin());
        }
    }
}
