package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataSourceUtil {
    public static final String USER_NAME = "root";
    public static final String PASSWORD = "03021985";
    public static final String URL = "jdbc:mysql://localhost:3306/mysql";
     public static Connection connection;

    public static Connection getConnection() throws SQLException {
        return connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
    }

    public static void returnConnection(Connection connection) throws SQLException {
        connection.close();
    }
}
