package Dao.Exceptions;

/**
 * Created by Admin on 2/22/2017.
 */
public class DaoException extends Exception {

    public DaoException(String message){
        super(message);
    }

    public DaoException(String message, Throwable cause){
        super(message, cause);
    }
}
