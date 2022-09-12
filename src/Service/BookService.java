package Service;

import Information.Book;
import java.util.Collection;

public interface BookService {

    Collection<Book> findAll();

    Book findOneById(String id);

    void create(String title, String author, String genre);

    void update(String id, String title, String author, String genre);

    void delete(String id);
}
