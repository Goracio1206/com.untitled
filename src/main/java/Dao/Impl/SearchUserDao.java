package Dao.Impl;

import DBProcessor.DBProcessor;
import Dao.Exceptions.DaoSysytemException;
import Dao.Exceptions.NoSuchUserException;
import Dao.Exceptions.UserAlreadyExistException;
import Dao.UserDao;
import Entity.Address;
import Entity.User;
import Entity.UserN;

import java.sql.*;
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
    public UserN selectUser(String login, String password) throws NoSuchUserException, DaoSysytemException, SQLException{
        final String USERNAME = "root";
        final String USERPASSWORD = "root";
        final String URL = "jdbc:mysql://localhost:3306/mysql";

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        DBProcessor db = new DBProcessor();
        Connection conn = db.getConnection(URL, USERNAME, USERPASSWORD);
        String query = "select * from undefined.users where user_name = ? or user_email = ? and user_password = ? ";
        PreparedStatement statement = conn.prepareStatement(query);
        statement.setString(1, login);
        statement.setString(2, login);
        statement.setString(3, password);
        ResultSet resultSet = statement.executeQuery();

        UserN user = null;
        int id;
        String userName;
        String userPassword;
        String email;
        while(resultSet.next()){
            id = resultSet.getInt("user_id");
            userName = resultSet.getString("user_name");
            userPassword = resultSet.getString("user_password");
            email = resultSet.getString("user_email");
            user = new UserN(id, userName, userPassword, email);
        }
        statement.close();
        conn.close();

        return user;
    }

    @Override
    public void createNewUser(String fName, String eMail, String password) throws UserAlreadyExistException, DaoSysytemException {

    }
}
