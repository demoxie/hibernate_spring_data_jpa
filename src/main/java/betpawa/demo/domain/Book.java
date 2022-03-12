package betpawa.demo.domain;

import lombok.*;

import javax.persistence.*;
import java.util.Objects;



@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@NamedQuery(name = "Book.jpaNamed", query = "FROM Book b where b.title = :title")
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String isbn;
    private String publisher;
    private Long authorId;

    public Book(String title, String isbn, String publisher, Long authorId) {
        this.title = title;
        this.isbn = isbn;
        this.publisher = publisher;
        this.authorId = authorId;
    }
}