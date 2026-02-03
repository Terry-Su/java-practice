package circularDependency;

import lombok.Data;
import org.springframework.stereotype.Component;


@Component
@Data
public class Animal {
    private String name = "animal1";
    Person person;
    Animal(Person person) {
        this.person = person;
    }
}
