package betpawa.demo.dao;

import betpawa.demo.domain.Book;

import java.util.List;


public interface BookDao {
    Book getById(Long id);

    Book findBookByTitle(String title);

    Book saveNewBook(Book book);

    Book updateBook(Book book);

    void deleteBookById(Long id);
}
