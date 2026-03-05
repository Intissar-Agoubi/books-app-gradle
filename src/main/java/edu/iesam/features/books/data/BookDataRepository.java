package edu.iesam.features.books.data;

import edu.iesam.features.books.domain.Book;
import edu.iesam.features.books.domain.BookRepository;
import java.util.ArrayList;

public class BookDataRepository implements BookRepository {
    private BookMemLocalDataSource dataSource;

    public BookDataRepository(BookMemLocalDataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public ArrayList<Book> getBooks() {
        return dataSource.getBooks();
    }
}