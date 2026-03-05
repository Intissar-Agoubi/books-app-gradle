package edu.iesam.features.books.data;

import edu.iesam.features.books.domain.Book;
import java.util.ArrayList;

public class BookMemLocalDataSource {
    public ArrayList<Book> getBooks() {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("1", "Don Quijote", "Cervantes"));
        books.add(new Book("2", "Harry Potter", "J.K. Rowling"));
        books.add(new Book("3", "El Principito", "Saint-Exupéry"));
        return books;
    }
}