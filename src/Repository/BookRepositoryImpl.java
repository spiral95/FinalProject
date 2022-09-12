package Repository;

import Information.Book;

import java.util.Collection;
import java.util.Optional;

public class BookRepositoryImpl implements BookRepository {

    @Override
    public Collection<Book> findAll() {
        return null;
    }

    @Override
    public Optional<Book> findOneById(String id) {
        return Optional.empty();
    }

    @Override
    public Book save(Book book) {
        return null;
    }

    @Override
    public long delete(Book book) {
        return 0;
    }
}
