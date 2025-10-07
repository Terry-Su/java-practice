package com.example.demo.bean;

import com.example.demo.component.ComponentAnnotation;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;



@SpringBootApplication
public class BeanAnnotation {
    public static void main(String[] args) {
        ApplicationContext context = new SpringApplicationBuilder(BeanAnnotation.class)
                .web(WebApplicationType.NONE) // 禁用 Web 服务器
                .run(args);
        System.out.println("Hello World");

        Person person = context.getBean(Person.class);
        person.setName("foo");
        System.out.println("person name:" + person.getName());
    }
}

