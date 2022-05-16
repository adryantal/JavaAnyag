package vonalprogram;

public class Vonal {

    private int hossz;
    private int kezdX;
    private String tipus;
    private String szin;

    /* HF: megoldani vmelyik verzióval */
    public static final String SZAGGATOTT = "sz";

    public enum Tipusok {
        SZAGGATOTT
    };

    /* GENERÁLT KÓDOK: ALT+INSERT */
    public Vonal() {
        //hossz = 1;
        this(1);    //ez hívja az 1 paraméterest
    }

    public Vonal(int hossz) {
        //this.hossz = hossz;
        this(hossz, 0);  //ez hívja a 2 paraméterest
    }

    public Vonal(int hossz, int kezdX) {
        //this.hossz = hossz;
        //this.kezdX = kezdX;
        this(hossz, kezdX, "normál");  //ez hívja a 3 paraméterest
        //this(hossz, kezdX, "normál", "fekete");
    }

    public Vonal(int hossz, int kezdX, String tipus) {
        //this.hossz = hossz;
        //this.kezdX = kezdX;
        //this.tipus = tipus;
        this(hossz, kezdX, tipus, "lila");  //ez hívja a 4 paraméterest
    }

    public Vonal(int hossz, int kezdX, String tipus, String szin) {
        if (hossz < 1) {
            hossz = 1;
        }
        this.hossz = hossz;
        this.kezdX = kezdX;
        this.tipus = tipus;
        this.szin = szin;
    }

    public void info() {
        System.out.printf("Vonal{H:%d, X:%d, T:%s, Sz:%s}\n", hossz, kezdX, tipus, szin);
    }

    public void rajzol() {
        //adattagok alapján kirajzoljuk:

        eltolas();
        //char jel = tipusBeallitas();
        //String rajzSzin = szinBeallitas();
        //hosszBeallitas(rajzSzin, jel);
        hosszSzinTipusRajzol();
    }

    private void eltolas() {
        //eltolás
        for (int i = 0; i < kezdX; i++) { //a bal szélhez képest kezdX egységgel beljebb (jobbra) kezdődik a vonal
            System.out.print(" ");
        }
    }

    private void hosszSzinTipusRajzol() {

        System.out.print(szinBeallitas()); //"aktiváljuk" a konstruktorban megadott színt; ilyen színű lesz az ezt követően kiírt szöveg (System.out.print kell a Java-s ANSI színkódok aktiválásához... )
                                            //https://stackoverflow.com/questions/5762491/how-to-print-color-in-console-using-system-out-println)
        //hossz
        for (int i = 0; i < hossz; i++) { //hossz egység hosszan rajzolja ki a beállított jeltípust
            //System.out.print(rajzSzin);
            //System.out.print(jel);
            System.out.print(tipusBeallitas());
        }
        System.out.println(szinBeallitas(true)); //itt true a reset paraméter, tehát visszaállítjuk a színt a default színre
    }

    private char tipusBeallitas() {
        //tipus
        char jel;
        switch (tipus) {
            default:
                /* normál */
                jel = '_';
                break;
            case "szaggatott":
                jel = '-';
                break;
            case "pont":
                jel = '.';
                break;
            case "dupla":
                jel = '=';
                break;
        }
        return jel;
    }

    private String szinBeallitas() { //"default" (tehát paraméter nélküli) színbeállítás: nincs reset, a konstruktorban beállított szín lesz a rajzszín
        return szinBeallitas(false);
    }

    private String szinBeallitas(boolean kellReset) {
        //szín
        //piros: "\033[0;31m"
        //zöld:  "\033[0;32m";
        //reset: "\033[0m";
        String fekete = "\033[0;30m";
        String piros = "\033[0;31m";
        String zold = "\033[0;32m";
        String lila = "\033[0;35m";
        String cyan = "\033[0;36m";
        String reset = "\033[0m"; 
        //Q:  Can you please explain what is the use of RESET if its color is BLACK, at least in my console? Is it like a default or sth.? 
        //A: The reset code turns off all ANSI attributes set so far, which should return the console to its defaults. 
        //It's useful if you don't know the default color or are also using some of the other attributes like background color, font styles, etc.

        String rajzSzin = reset;  //default színérték "definiálása"
        if (kellReset) {
            return rajzSzin;      //ha kérünk resetet, akkor a default színre térünk vissza (ezen a ponton meg is szakad a metódus futása)
        }

        switch (szin) {
            default:
                rajzSzin = lila;
                /*fekete;*/ break;
            case "piros":
                rajzSzin = piros;
                break;
            case "zöld":
                rajzSzin = zold;
                break;
        }

        return rajzSzin;
    }

}
