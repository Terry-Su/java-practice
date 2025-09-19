package com.example.syntax.annotation;

import com.example.syntax.start.StartPractice;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;


public class ServicePractice {
    @Service
    public class MyService {
        @Value("${app.security.jwt.secret-key}")
        private String secretKey;

        @Value("${app.security.jwt.expiration-ms}")
        private long expirationMs;
    }

    @SpringBootApplication
    public class Practice {
        public static void main(String[] args) {
            SpringApplication app = new SpringApplication(Practice.class);
            app.run();
        }
    }

    public static void main(String[] args) {
        Practice practice = new Practice();
    }
}
