package Information;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Library {

    private final List<Book> books = new ArrayList<>();

    public Library() {
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public Book getBook(int id) {
        return books.stream()
                .filter(b -> b.getId() == id)
                .findFirst()
                .orElseThrow(()->new IllegalArgumentException(String.format("Provided is not found %s", id)));
    }

    public List<Book> getBook(String title) {
        return books.stream()
                .filter(b -> b.getTitle().equals(title))
                .collect(Collectors.toList());
    }

    public Book updateBook(Book book) {
        Book found = books.stream()
                .filter(b -> b.getId() == book.getId())
                .findFirst()
                .orElseThrow(()->new IllegalArgumentException(String.format("Provided is not found %s", book.getId())));

        found.setAuthor(book.getAuthor());
        found.setTitle(book.getTitle());
        found.setGenre(book.getGenre());

        return found;
    }

    public boolean deleteBook(int id) {
        Book found = books.stream()
                .filter(b -> b.getId() == id)
                .findFirst()
                .orElseThrow(()->new IllegalArgumentException(String.format("Provided is not found %s", id)));
        return books.remove(found);
    }
}
