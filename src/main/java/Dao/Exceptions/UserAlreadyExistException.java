package Dao.Exceptions;

/**
 * Created by Admin on 2/22/2017.
 */
public class UserAlreadyExistException extends Exception {

    public UserAlreadyExistException(String message){
        super(message);
    }

    public UserAlreadyExistException(String message, Throwable cause){
        super(message, cause);
    }
}
