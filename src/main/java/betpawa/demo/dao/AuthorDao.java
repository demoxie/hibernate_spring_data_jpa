package betpawa.demo.dao;

import betpawa.demo.domain.Author;

public interface AuthorDao {
    Author getById(Long id);
    Author findAuthorByName(String firstName, String lastName);
    Author saveNewAuthor(Author author);
    void deleteAuthorById(Long id);
    Author updateAuthor(Author author);
}