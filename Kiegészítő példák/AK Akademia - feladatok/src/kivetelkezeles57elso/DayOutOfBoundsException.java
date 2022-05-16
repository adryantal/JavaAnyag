//saját kivételosztály: a nap sorszáma kívül esik a legális határokon
//egy speciálisabb változata az InvalidDayException-nek

package kivetelkezeles57elso;

public class DayOutOfBoundsException extends InvalidDayException{

    
    private static final long serialVersionUID = 1L;
    
     public DayOutOfBoundsException() {       
    }
     
    public DayOutOfBoundsException(String message) {
        super(message);
    }

    public DayOutOfBoundsException(String message, Throwable cause) {
        super(message, cause);
    }

    public DayOutOfBoundsException(Throwable cause) {
        super(cause);
    }

    public DayOutOfBoundsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
  
    
}
