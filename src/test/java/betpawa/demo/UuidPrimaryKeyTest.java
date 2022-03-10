package betpawa.demo;

import betpawa.demo.domain.BookUuid;
import betpawa.demo.repositories.BookUuidRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class UuidPrimaryKeyTest {
    @Autowired
    private BookUuidRepository bookUuidRepository;
    BookUuid bookUuid;
    @BeforeEach
    void setUp() {
        bookUuid = new BookUuid("Maths","135876FRE","adamsy");
        bookUuidRepository.save(bookUuid);

    }

    @Test
    void testAuthorUuidPrimaryKey() {
        assertThat(bookUuid.getId()).isEqualTo(bookUuidRepository.findBookUuidByTitle(bookUuid.getTitle()).getId());
    }
    @Test
    void testBookUuidPrimaryKey() {
    }

}
