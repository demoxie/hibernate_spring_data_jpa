package betpawa.demo.repositories.composite;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class NameId implements Serializable {
    private String firstName;
    private String lastName;
}
