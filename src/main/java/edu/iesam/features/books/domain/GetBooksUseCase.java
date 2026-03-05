package edu.iesam.features.books.domain;

import java.util.ArrayList;

public class GetBooksUseCase {
    private BookRepository repository;

    public GetBooksUseCase(BookRepository repository) {
        this.repository = repository;
    }

    public ArrayList<Book> execute() {
        return repository.getBooks();
    }
}