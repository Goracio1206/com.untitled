package DBProcessor;

import com.mysql.fabric.jdbc.FabricMySQLDriver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Admin on 3/21/2017.
 */
public class DBProcessor {
    private Connection connection;
    public DBProcessor() throws SQLException {
        DriverManager.registerDriver(new FabricMySQLDriver());
    }    
    public Connection getConnection(String url, String username, String password) throws SQLException{
        if (connection != null)
           return connection;
        connection = DriverManager.getConnection(url, username, password);
        return connection;
    }
}
