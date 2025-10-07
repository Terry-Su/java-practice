package com.example.demo.component;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ComponentAnnotation {
    public static void main(String[] args) {
//        ApplicationContext context = SpringApplication.run(ComponentAnnotation.class, args);
        ApplicationContext context = new SpringApplicationBuilder(ComponentAnnotation.class)
                .web(WebApplicationType.NONE) // 禁用 Web 服务器
                .run(args);
        System.out.println("Hello World");
        // 从Spring容器中获取Person Bean
        Person person = context.getBean(Person.class);
        person.Speck();
        person.UseTool();
    }
}
