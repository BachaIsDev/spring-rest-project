package com.bachadev.springrest.entity;

import javax.persistence.*;

@Entity
@Table(name = "books")
public class Book{

    enum BookStatus{
        READ,
        WILL_READ,
        WILL_NOT_READ,
        IS_READING,
        FAVORITE
    }

    public Book() {
    }


    public Book(String name, String author, String genre, BookStatus status) {
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.status = status;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "author")
    private String author;

    @Column(name = "genre")
    private String genre;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private BookStatus status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public BookStatus getStatus() {
        return status;
    }

    public void setStatus(BookStatus status) {
        this.status = status;
    }
}
