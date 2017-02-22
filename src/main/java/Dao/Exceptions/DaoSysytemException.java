package Dao.Exceptions;

/**
 * Created by Admin on 2/22/2017.
 */
public class DaoSysytemException extends Exception{

    public DaoSysytemException(String message){
        super(message);
    }

    public DaoSysytemException(String message, Throwable cause){
        super(message, cause);
    }
}
