package com.example.syntax.property;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
//@RestController
public class PropertyExample {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(com.example.syntax.property.PropertyExample.class, args);
        MyAppProperties properties = context.getBean(MyAppProperties.class);
        System.out.println("App Name: " + properties.getName());
        System.out.println("App Version: " + properties.getVersion());
        System.out.println("Enabled: " + properties.isEnabled());
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }
}
