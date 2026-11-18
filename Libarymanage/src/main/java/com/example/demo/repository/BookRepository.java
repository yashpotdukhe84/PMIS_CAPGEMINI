
package com.example.demo.repository;

import com.example.demo.entity.Book;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class BookRepository {

    private final Map<Long, Book> books = new HashMap<>();

    public BookRepository() {

        books.put(1L, new Book(
                1L, "Java Programming",
                "James Gosling", "Programming", true));

        books.put(2L, new Book(
                2L, "Spring Boot",
                "Craig Walls", "Technology", true));

        books.put(3L, new Book(
                3L, "Clean Code",
                "Robert Martin", "Software Engineering", false));
    }

    public Map<Long, Book> getAllBooks() {
        return books;
    }

    public Book getBookById(Long id) {
        return books.get(id);
    }

    public Book saveBook(Book book) {
        books.put(book.getId(), book);
        return book;
    }

    public boolean deleteBook(Long id) {
        return books.remove(id) != null;
    }
}
