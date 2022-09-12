package Aplication;

import Connection.DataSourceUtil;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) throws SQLException {

        // Выполняем подсключение к БД и создаём объект Statement для взаимодействия с СУБД
        Connection cn = DataSourceUtil.getConnection();
        Statement st = cn.createStatement();



    }




}
