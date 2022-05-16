
//saját kivételosztály: a választott nap hétvégére esik

package kivetelkezeles57elso;


public class DayIsOnWeekendException extends InvalidDayException {
    
    private static final long serialVersionUID = 1L;

    public DayIsOnWeekendException() {
    }

    public DayIsOnWeekendException(String message) {
        super(message);
    }

    public DayIsOnWeekendException(String message, Throwable cause) {
        super(message, cause);
    }

    public DayIsOnWeekendException(Throwable cause) {
        super(cause);
    }

    public DayIsOnWeekendException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    
    
}
