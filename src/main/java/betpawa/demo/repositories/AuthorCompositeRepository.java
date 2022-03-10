package betpawa.demo.repositories;

import betpawa.demo.repositories.composite.AuthorComposite;
import betpawa.demo.repositories.composite.NameId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorCompositeRepository extends JpaRepository<AuthorComposite, NameId> {
}