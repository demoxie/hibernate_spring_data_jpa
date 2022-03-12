package betpawa.demo.repositories;

import betpawa.demo.domain.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface AuthorRepositories extends JpaRepository<Author, Long> {
    Author findAuthorById(Long id);
    Optional<Author> findAuthorByFirstNameAndLastName(String firstName, String lastName);
}
