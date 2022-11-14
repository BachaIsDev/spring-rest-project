package com.bachadev.springrest.service;

import com.bachadev.springrest.entity.Book;
import java.util.List;

public interface BookService {

    public List<Book> getAllBooks();

    public Book getBookById(int id);

    public void saveBook(Book book);

    public void deleteBook(int id);
}
