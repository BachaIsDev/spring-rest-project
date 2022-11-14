package com.bachadev.springrest.service;

import com.bachadev.springrest.entity.Book;
import javax.transaction.Transactional;

import com.bachadev.springrest.repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepo bookRepo;

    @Override
    @Transactional
    public List<Book> getAllBooks() {
        return bookRepo.getAllBooks();
    }

    @Override
    @Transactional
    public Book getBookById(int id) {
        return bookRepo.getBookById(id);
    }

    @Override
    @Transactional
    public void saveBook(Book book) {
        bookRepo.saveBook(book);
    }

    @Override
    @Transactional
    public void deleteBook(int id) {
        bookRepo.deleteBook(id);
    }
}
