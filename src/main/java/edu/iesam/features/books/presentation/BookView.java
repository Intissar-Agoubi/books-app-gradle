package edu.iesam.features.books.presentation;

import edu.iesam.features.books.data.BookDataRepository;
import edu.iesam.features.books.data.BookMemLocalDataSource;
import edu.iesam.features.books.domain.GetBooksUseCase;
import edu.iesam.features.books.domain.Book;
import java.util.ArrayList;

public class BookView {
    public static void printBooks() {
        GetBooksUseCase getBooksUseCase = new GetBooksUseCase(
                new BookDataRepository(new BookMemLocalDataSource())
        );

        ArrayList<Book> books = getBooksUseCase.execute();
        System.out.println(books);
    }
}