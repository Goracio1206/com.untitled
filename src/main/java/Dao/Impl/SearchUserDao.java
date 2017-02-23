package Dao.Impl;

import Dao.Exceptions.DaoSysytemException;
import Dao.Exceptions.NoSuchUserException;
import Dao.Exceptions.UserAlreadyExistException;
import Dao.UserDao;
import Entity.Address;
import Entity.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Admin on 2/23/2017.
 */
public class SearchUserDao implements UserDao {
    public Map<Integer, User> users = new ConcurrentHashMap<Integer, User>();

    public SearchUserDao(){
        this.users.put(1, new User("Vitalii", "Nedzelskyi", new Address("Ukraine", "Lviv"), "Passw0rd", "Vitalii@test,com", "Admin"));
    }


    @Override
    public User SelectByID(int id) throws NoSuchUserException, DaoSysytemException {
        return null;
    }

    @Override
    public List<User> SelectAllUsers() throws NoSuchUserException, DaoSysytemException {
        return null;
    }

    @Override
    public User selectUser(String login, String password) throws NoSuchUserException, DaoSysytemException {
        return null;
    }

    @Override
    public void createNewUser(String fName, String eMail, String password) throws UserAlreadyExistException, DaoSysytemException {

    }
}
