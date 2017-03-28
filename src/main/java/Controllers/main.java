package Controllers;

import DBProcessor.DBProcessor;
import Entity.UserN;

import java.sql.*;

/**
 * Created by Admin on 3/21/2017.
 */
public class main {
    public static void main(String[] args) throws SQLException {
        final String USERNAME = "root";
        final String USERPASSWORD = "root";
       final String URL = "jdbc:mysql://localhost:3306/mysql";
        String login = "Admin@test.com";
        String password = "Qawsed1234";
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
            System.out.println(user);
        }
        statement.close();
        conn.close();
    }
}
