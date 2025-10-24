package circularDependency;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class Person {
    private String name  = "person1";

    Animal animal;

    Person (Animal animal) {
        this.animal = animal;
    }
}
