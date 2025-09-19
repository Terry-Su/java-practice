package com.example.syntax.annotation.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Service;

@SpringBootApplication
public class ServicePractice {



    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(ServicePractice.class);
        ConfigurableApplicationContext context = app.run();

        MyService myService = context.getBean(MyService.class);
        System.out.println("App Name = " + myService.getAppName());
    }
}
