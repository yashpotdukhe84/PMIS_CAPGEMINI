
package com.example.demo.controller;

import com.example.demo.service.BookService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class DeleteBookController {

    private final BookService bookService;

    public DeleteBookController(BookService bookService) {
        this.bookService = bookService;
    }

    @DeleteMapping("/{bookId}")
    public ResponseEntity<Void> deleteBook(
            @PathVariable Long bookId) {

        boolean deleted = bookService.deleteBook(bookId);

        if (!deleted) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.noContent().build();
    }
}
