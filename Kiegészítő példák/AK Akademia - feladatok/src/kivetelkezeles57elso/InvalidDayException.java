
package kivetelkezeles57elso;

//saját kivételosztály: a nem választható napoknál jön elő
//le kell származtatnom a megfelelő osztályból
//ellenőrzött v. nem ellenőrzött kivétel lesz???
//ha ellenőrzött lesz, akkor a fordító for majd figyelmeztetni --> az Exceptionből kell leszárm.
//ha nem ellenőrzöttet akarunk, akkor a RuntimeExceptionből kell leszárm.


public class InvalidDayException extends Exception{
    
     //a konstruktorok nem öröklődnek
    //ha azt szeretnénk, h. olyan konstruktor legyen, mint az Exception osztályba,
    //akkor ALT+INSERT-tel le tudjuk generálni az ősosztály konstruktorait
    
    //az Exception osztály megvalósítja Serializable interface-t --> szerializálható
    //tehát a mi osztályunknak is szerializálhatónak kell lennie --> meg kell adni egy serial version ID-t:    
    private static final long serialVersionUID = 1L; //ez az 1-es verziója ennek az osztálynak

        public InvalidDayException() { 
        
    }

    
    public InvalidDayException(String message) { //bemenő param.: a hibaüzenet megadva Stringként
        super(message);
    }

    public InvalidDayException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidDayException(Throwable cause) { //bemenő param.: kiválto ok
        super(cause);
    }

    public InvalidDayException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
   
    
}
