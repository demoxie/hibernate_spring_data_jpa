package betpawa.demo;

import betpawa.demo.repositories.BookRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class DemoApplicationTests {
    @Autowired
    private BookRepository bookRepository;
    @Test
    void testBookRepository(){
        long bookCount = bookRepository.count();
        assertThat(bookCount).isGreaterThan(3);
    }

    @Test
    void contextLoads() {
    }



}
