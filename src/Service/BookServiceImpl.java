package Service;

import Information.Book;
import Connection.DataSourceUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

public class BookServiceImpl implements BookService {


    @Override
    public Collection<Book> findAll() throws SQLException {
        Connection cn = DataSourceUtil.getConnection();
        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM mysql");
        ArrayList<Book> books = new ArrayList<>();
        while (rs.next()) {
            int id = rs.getInt(1);
            String title = rs.getString(2);
            String author = rs.getString(3);
            String genre = rs.getString(4);
            books.add(new Book(id, title, author, genre));
        }
        return books;
    }

    @Override
    public Book findOneById(String id) {
        return null;
    }

    @Override
    public void create(String title, String author, String genre) {

    }

    @Override
    public void update(String id, String title, String author, String genre) {

    }

    @Override
    public void delete(String id) {

    }
}
