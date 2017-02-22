package Dao.Exceptions;


public class DaoBusinessException extends Exception {

    public DaoBusinessException(String message){
        super(message);
    }

    public DaoBusinessException(String message, Throwable cause){
        super(message, cause);
    }

}
