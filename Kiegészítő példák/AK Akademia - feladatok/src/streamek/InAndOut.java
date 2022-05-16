package streamek;

import java.io.IOException;

public class InAndOut {

    public static void main(String[] args) throws IOException {

        //  int adat = System.in.read(); //adat bekérése
        //  System.out.println("A karakter ASCII kódja: "+adat);
        //  System.out.println((char)adat);
        
        Writer w = new Writer();
        w.writeSingleChar();
        Reader r = new Reader();
        r.readSingleChar();
        Writer wm = new Writer();
        wm.writeMultipleCharacters();
        Reader rn = new Reader();
        rn.readMultipleCharacters();
        
        
    }

}
