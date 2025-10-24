package bean1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Person person1 = context.getBean(Person.class);
        Animal animal1  = context.getBean(Animal.class);
        person1.setAnimal(animal1);
        animal1.setPerson(person1);
        System.out.println(person1.getName());
//        System.out.println(person1.animal.getName());
//        System.out.println(animal1.getName());
    }
}
