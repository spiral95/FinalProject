package Repository;

import Information.Book;
import java.util.Collection;
import java.util.Optional;

public interface BookRepository {

    Collection<Book> findAll();

    Optional<Book> findOneById(String id);

    Book save(Book book);

    long delete(Book book);
}
