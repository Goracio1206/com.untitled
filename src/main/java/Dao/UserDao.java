package Dao;

import Dao.Exceptions.DaoSysytemException;
import Dao.Exceptions.NoSuchUserException;
import Dao.Exceptions.UserAlreadyExistException;
import Entity.User;
import Entity.UserN;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Admin on 2/22/2017.
 */
public interface UserDao {
    User SelectByID(int id) throws NoSuchUserException, DaoSysytemException;

    List<User> SelectAllUsers() throws NoSuchUserException, DaoSysytemException;

    UserN selectUser(String login, String password) throws NoSuchUserException, DaoSysytemException, SQLException;

    void createNewUser(String fName, String eMail, String password) throws UserAlreadyExistException, DaoSysytemException;
}
