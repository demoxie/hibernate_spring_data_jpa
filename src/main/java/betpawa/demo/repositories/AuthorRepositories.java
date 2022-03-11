package betpawa.demo.repositories;

import betpawa.demo.domain.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepositories extends JpaRepository<Author, Long> {
}
