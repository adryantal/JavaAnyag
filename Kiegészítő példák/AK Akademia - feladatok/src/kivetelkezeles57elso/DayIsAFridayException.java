
//saját kivételosztály: a választott nap péntekre esik


package kivetelkezeles57elso;


public class DayIsAFridayException extends InvalidDayException{
    
    private static final long serialVersionUID = 1L;

    public DayIsAFridayException() {
    }

    public DayIsAFridayException(String message) {
        super(message);
    }

    public DayIsAFridayException(String message, Throwable cause) {
        super(message, cause);
    }

    public DayIsAFridayException(Throwable cause) {
        super(cause);
    }

    public DayIsAFridayException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    
    
}
