package betpawa.demo;

import betpawa.demo.domain.Book;
import betpawa.demo.repositories.BookRepository;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.annotation.Commit;
import org.springframework.test.annotation.Rollback;

import static org.assertj.core.api.Assertions.assertThat;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@DataJpaTest
@ComponentScan(basePackages = {"betpawa.demo.boostrap"})
public class TestUsingDataJpaSplice {
    @Autowired
    private BookRepository bookRepository;

    @Commit
    @Order(1)
    @Test
    void testUsingSplice1(){
        long countBefore = bookRepository.count();
        assertThat(countBefore).isEqualTo(2);
        bookRepository.save(new Book("Chemistry","BGSKD233","dESMOND"));
        long countAfter = bookRepository.count();
        assertThat(countAfter).isGreaterThan(countBefore);
    }

    @Order(2)
    @Test
    void testUsingSplice2(){
        long countBefore = bookRepository.count();
        assertThat(countBefore).isEqualTo(3);
        bookRepository.save(new Book("Chemistry","BGSKD233","dESMOND"));
        long countAfter = bookRepository.count();
        assertThat(countAfter).isGreaterThan(countBefore);
    }
}
