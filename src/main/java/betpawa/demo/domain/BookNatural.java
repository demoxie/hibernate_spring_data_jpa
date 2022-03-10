package betpawa.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
@Data
@Entity
public class BookNatural {
    @Id
    private String title;
    private String isbn;
    private String publisher;
}
