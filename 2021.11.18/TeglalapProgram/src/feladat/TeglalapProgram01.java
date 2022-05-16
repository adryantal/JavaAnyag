package feladat;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.xml.bind.DatatypeConverter;

class Teglalap01{
    /* ez nem jó, mert minden példány ezt kapja */
    //private int a=3, b=3;
    
    private int a, b;
    
    public void info(){
        System.out.printf("a: %d, b: %d\n",a,b);
    }
}

public class TeglalapProgram01 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        Teglalap01 t = new Teglalap01();
        //t.a = 2;//private miatt nem elérhető
        t.info();
        
        Teglalap01 t2 = new Teglalap01();
        t2.info();
    }
}
