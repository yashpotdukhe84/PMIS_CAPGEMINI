
package com.example.demo.controller;

import com.example.demo.entity.Book;
import com.example.demo.service.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class GetBookByIdController {

    private final BookService bookService;

    public GetBookByIdController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/{bookId}")
    public ResponseEntity<Book> getBookById(
            @PathVariable Long bookId) {

        Book book = bookService.getBookById(bookId);

        if (book == null) {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .build();
        }

        return ResponseEntity.ok(book);
    }
}
