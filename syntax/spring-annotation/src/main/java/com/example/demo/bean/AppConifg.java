package com.example.demo.bean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConifg {
    // 定义一个名为 "person" 的 Bean
    @Bean
    public Person user() {
        return new Person("foo");
    }
}

@Getter
@Setter
@AllArgsConstructor
class Person {
    private String name;
}