package DataSourceUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DataSourceUtil {
    public static final String USER_NAME = "root";
    public static final String PASSWORD = "03021985";
    public static final String URL = "jdbc:mysql://localhost:3306/mysql";
    public static Connection connection;
    public static Statement statement;

    static {
        try {
            connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
            statement = connection.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }



}
