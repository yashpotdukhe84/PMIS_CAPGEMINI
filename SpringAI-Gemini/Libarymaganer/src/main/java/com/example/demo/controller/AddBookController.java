
package com.example.demo.controller;

import com.example.demo.entity.Book;
import com.example.demo.service.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class AddBookController {

    private final BookService bookService;

    public AddBookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping
    public ResponseEntity<Book> addBook(
            @RequestBody Book book) {

        try {
            Book savedBook = bookService.addBook(book);

            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(savedBook);

        } catch (IllegalArgumentException e) {

            return ResponseEntity
                    .badRequest()
                    .build();
        }
    }
}
