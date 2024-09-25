package utils;

import domain.Book;

import java.util.List;

public class BookUtil {
    public static List<Book> createSampleBooks() {
        return List.of(
                new Book("Java Programming", "Author A", 29.99, 10),
                new Book("Python Programming", "Author B", 39.99, 5),
                new Book("C++ Programming", "Author C", 24.99, 8)
        );
    }
}
