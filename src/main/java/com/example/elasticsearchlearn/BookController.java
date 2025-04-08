package com.example.elasticsearchlearn;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    private final BookRepository bookRepository;
    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    @PostMapping
    public Book createBook(@RequestBody Book book) {
        return bookRepository.save(book);
    }
    @GetMapping("/author/{name}")
    public List<Book> findByAuthor(@PathVariable String name) {
        return bookRepository.findByAuthor(name);
    }
}
