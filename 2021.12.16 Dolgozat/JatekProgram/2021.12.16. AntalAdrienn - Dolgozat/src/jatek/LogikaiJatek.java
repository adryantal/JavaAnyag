package jatek;

public class LogikaiJatek extends Jatek {

    private Babu[][] tabla;
    private int[] sorrend;
    private int babuDb;

    public LogikaiJatek(int babuDb) throws IllegalArgumentException {
        if (babuDb >= 3 && babuDb <= 15) {
            this.babuDb = babuDb;
        } else {
            throw new IllegalArgumentException("Helytelen babuDB!");
        }
        this.tabla = tablaFeltolt();
        this.sorrend = sorrendBeallit();
    }

    public LogikaiJatek() {
        this(3);
    }

    //a táblán elfoglalt helyek koordinátáinak véletlenszerű generálása
    public int[][] veletlenIndexParosok(){    
            int[][] veletlenIndexParosok = new int [babuDb][2]; //[annyi páros kell, ahány db bábut helyezünk el a táblán,, ez lesz a tömb "hossza"][X és Y koordináta, tehát 2 db]
            int i=0;
            boolean talalt=false;
            while(i<veletlenIndexParosok.length) { 
            if(talalt && i>0){
                i--; //ha már előfordult a tömbben az előző iterációban generált páros, akkor ugorjunk vissza az előző indexre, és próbáljunk a "helyére" egy új indexpárost beszúrni
            }    
            int szamX=(int) (Math.random() * 4);
            int szamY=(int) (Math.random() * 5);            
            int j = 0;
            talalt = false;
            //különbözőség vizsgálata
            while (j < veletlenIndexParosok.length && !talalt) { //végigmegyünk a tömbön, amíg nem talál olyan párost, amelynek tagjai megegyeznek szamX-el és szamY-al
                if (veletlenIndexParosok[j][0] == szamX && veletlenIndexParosok[j][1]==szamY) {
                    talalt = true; //ha már előfordul a tömbben a generált páros, akkor "talált" legyen igaz
                }                
                j++;
            };           
            if (talalt==false) {
                veletlenIndexParosok[i][0] = szamX;
                veletlenIndexParosok[i][1]=szamY;              
            }            
            i++;            
            }
//            for (int k = 0; k < veletlenIndexParosok.length; k++) {
//            System.out.print(veletlenIndexParosok[k][0]+" ");
//            System.out.println(veletlenIndexParosok[k][1]);
//            }
//            System.out.println();
    return veletlenIndexParosok;
    }
   
    public Babu[][] tablaFeltolt() {  
        int[][] indexParosok = veletlenIndexParosok();
        boolean talalt = false;
        Babu[][] matrix = new Babu[4][5];
        for (int i = 0; i < matrix.length; i++) { //végighaladunk a tábla összes helyén/koordinátáján
            for (int j = 0; j < matrix[i].length; j++) {                
                for (int k = 0; k < indexParosok.length; k++) { //végighaladunk az indexpárosok tömbjén
                     talalt = (i==indexParosok[k][0] && j==indexParosok[k][1]); ///ha az adott hely koordinátái egyeznek az adott - generált - indexpároséival, akkor "talalt" legyen igaz
                if(talalt)
                    matrix[i][j] = new Babu(eroBeallitas(), szinBeallitas()); //ha az adott hely koordinátái egyeznek az adott - generált - indexpároséival, akkor oda szúrjon be egy bábut
                }
                
            }
        }

        return matrix;
    }

    public String tablatartalmaKiir() {
        
        String txt = "";
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                if (tabla[i][j] != null){
                    txt += tabla[i][j].getSzin() + tabla[i][j].getEro() + " ";
                }
                else
                {
                    txt += "-- ";
                }
            }
            txt += "\n";
        }
        return txt;
    }

    public boolean van8FelettEro() {
        boolean van = false;
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                if (tabla[i][j]!=null && tabla[i][j].getEro() > 8) { //ha ki van töltve, és az erő értéke > 8
                    van = true;
                }
            }
        }
        return van;
    }

    public String nyolcfeletti() {
        String nyolcfeletti = "";
        if (van8FelettEro()) {
            nyolcfeletti = "van";
        } else {
            nyolcfeletti = "nincs";
        }
        return nyolcfeletti;
    }

    @Override
    public void kezd() {
        System.out.println("Kezdés");

    }

    @Override
    public void ment() {
        System.out.println("Mentés");

    }

    @Override
    public void vege() {
        System.out.println("Vége!");

    }

    @Override
    public String toString() {

        return sorrendKiir() + tablatartalmaKiir() + "\n 8 feletti: " + nyolcfeletti()+"\n\n";
    }

    public String szinBeallitas() {
        String[] szinek = {"P", "F"};
        int randomIndex = (int) Math.round(Math.random());
        return szinek[randomIndex];
    }

    public int eroBeallitas() {
        int ero = (int) (Math.random() * 9) + 1;
        return ero;
    }

    public int[] sorrendBeallit() {
         int[] sorrendTomb = new int[10];
        int i = 0;
        boolean talalt=false;
        while (i < sorrendTomb.length) {
            if(talalt && i>0){  //ha már előfordult a tömbben az előző iterációban generált szám, akkor ugorjunk vissza az előző indexre, és próbáljunk a "helyére" egy új számot beszúrni
                i--;
            }
            int szam = (int) (Math.random() * 15) + 1;            
            int j = 0;
            talalt = false;
            //különbözőség vizsgálata
            while (j < sorrendTomb.length && !talalt) { //végigmegyünk a tömbön, amíg nem talál olyan számot, amely megegyezik szam-mal
                if (sorrendTomb[j] == szam) {
                    talalt = true; //ha már előfordul a tömbben a generált szám, akkor "talált" legyen igaz
                }                
                j++;
            };           
            if (talalt==false) {
                sorrendTomb[i] = szam;                
            }
            i++;
            
        }
        return sorrendTomb;
    }

    public String sorrendKiir() {
        String txt = "";
        for (int i = 0; i < sorrend.length; i++) {
            txt += sorrend[i] + " ";
        }
        return txt + "\n";
    }

}
