package domain;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Book> books;

    public Cart() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public double getTotalPrice() {
        return books.stream().mapToDouble(Book::getPrice).sum();
    }

    public List<Book> getBooks() {
        return books;
    }
}
