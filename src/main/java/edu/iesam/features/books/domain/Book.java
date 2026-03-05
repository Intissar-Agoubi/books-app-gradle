package edu.iesam.features.books.domain;

public class Book {
    public String id;
    public String name;
    public String author;

    public Book(String id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{id=" + id + ", name=" + name + ", author=" + author + "}";
    }
}