package com.example.demo.实现方式3;

import com.example.demo.DemoApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Test {
    @Autowired
    private Person person;

    public static void main(String[] args) {
//        SpringApplication.run(Test.class, args);
        ApplicationContext context = SpringApplication.run(Test.class, args);

        // 从Spring容器中获取Person Bean
        Person person = context.getBean(Person.class);
        person.Run();
    }
}
