package Aplication;

import Connection.DataSourceUtil;
import Information.Library;
import Service.BookService;
import Service.BookServiceImpl;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws SQLException {

        // Выполняем подключение к БД и создаём объект Statement для взаимодействия с СУБД
        Connection cn = DataSourceUtil.getConnection();
        Statement st = cn.createStatement();

        // Так как будет обавление и редактирование книг из консоли - создаём объект Scanner
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();





        // Закрываем Statement и подключение
        st.close();
        cn.close();

    }




}
