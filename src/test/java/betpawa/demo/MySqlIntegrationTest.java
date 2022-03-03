package betpawa.demo;

import betpawa.demo.domain.Book;
import betpawa.demo.repositories.BookRepository;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.ComponentScan;

import static org.assertj.core.api.Assertions.assertThat;


@DataJpaTest
@ComponentScan(basePackages = {"betpawa.demo.boostrap"})
public class MySqlIntegrationTest {
    private BookRepository bookRepository;
    @Test
    void testMySql(){
        long countBefore = bookRepository.count();
        assertThat(countBefore).isEqualTo(2);
        bookRepository.save(new Book("Chemistry","BGSKD233","dESMOND"));
        long countAfter = bookRepository.count();
        assertThat(countAfter).isGreaterThan(countBefore);
    }
}
