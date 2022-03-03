package betpawa.demo.boostrap;

import betpawa.demo.domain.Book;
import betpawa.demo.repositories.BookRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Data
public class DataInitializer implements CommandLineRunner {
    private final BookRepository bookRepository;
    @Override
    public void run(String... args) throws Exception {
        bookRepository.deleteAll();
        Book book1 = new Book("Maths","GTHG3L","ETRA");
        System.out.println(book1.getId());
        Book savedBook = bookRepository.save(book1);
        System.out.println(savedBook.getId());
        Book book2 = new Book("English","GTHG3L","ETRA");
        bookRepository.save(book2);

        bookRepository.findAll().forEach(System.out::println);

    }
}
