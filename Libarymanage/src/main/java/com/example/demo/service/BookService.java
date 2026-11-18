
package com.example.demo.service;

import com.example.demo.entity.Book;
import com.example.demo.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    // Get all books
    public List<Book> getAllBooks() {
        return new ArrayList<>(
                bookRepository.getAllBooks().values());
    }

    // Get book by ID
    public Book getBookById(Long id) {
        return bookRepository.getBookById(id);
    }

    // Add new book
    public Book addBook(Book book) {

        if (book.getId() == null) {
            throw new IllegalArgumentException(
                    "Book ID is required");
        }

        if (bookRepository.getBookById(book.getId()) != null) {
            throw new IllegalArgumentException(
                    "Book ID already exists");
        }

        return bookRepository.saveBook(book);
    }

    // Update existing book
    public Book updateBook(Long id, Book updatedBook) {

        Book existingBook = bookRepository.getBookById(id);

        if (existingBook == null) {
            return null;
        }

        updatedBook.setId(id);

        return bookRepository.saveBook(updatedBook);
    }

    // Delete book
    public boolean deleteBook(Long id) {
        return bookRepository.deleteBook(id);
    }
}
