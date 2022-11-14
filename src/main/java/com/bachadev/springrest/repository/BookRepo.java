package com.bachadev.springrest.repository;

import com.bachadev.springrest.entity.Book;

import java.util.List;

public interface BookRepo {
    public List<Book> getAllBooks();

    public Book getBookById(int id);

    public void saveBook(Book book);

    public void deleteBook(int id);
}
