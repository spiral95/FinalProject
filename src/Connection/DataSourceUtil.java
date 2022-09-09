package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DataSourceUtil {
    public static final String USER_NAME = "root";
    public static final String PASSWORD = "03021985";
    public static final String URL = "jdbc:mysql://localhost:3306/mysql";
     public static Statement statement;

    public static Statement getConnection() throws SQLException {
        return statement = DriverManager.getConnection(URL, USER_NAME, PASSWORD).createStatement();
    }
}
