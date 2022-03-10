package betpawa.demo.repositories;

import betpawa.demo.domain.BookUuid;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BookUuidRepository extends JpaRepository<BookUuid, UUID> {
    BookUuid findBookUuidByTitle(String title);
}