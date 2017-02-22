package Dao.Exceptions;

/**
 * Created by Admin on 2/22/2017.
 */
public class NoSuchUserException extends Exception {

    public NoSuchUserException(String message){
        super(message);
    }

    public NoSuchUserException(String message, Throwable cause){
        super(message, cause);
    }
}
