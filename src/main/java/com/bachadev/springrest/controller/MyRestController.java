package com.bachadev.springrest.controller;

import com.bachadev.springrest.entity.Book;
import com.bachadev.springrest.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRestController {

    @Autowired
    private BookService bookService;

    @GetMapping("/books")
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }

    @GetMapping("/books/{id}")
    public Book getBookById(@PathVariable(name = "id") int id){
        return bookService.getBookById(id);
    }

    @PostMapping("/books")
    public void addBookToLibrary(@RequestBody Book book){
        bookService.saveBook(book);
    }

    @PutMapping("/books")
    public void updateBookInLibrary(@RequestBody Book book){
        bookService.saveBook(book);
    }

    @DeleteMapping("/books/{id}")
    public void deleteBookById(@PathVariable(name = "id") int id){
        bookService.deleteBook(id);
    }
}
