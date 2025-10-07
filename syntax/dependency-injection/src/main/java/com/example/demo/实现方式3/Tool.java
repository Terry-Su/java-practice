package com.example.demo.实现方式3;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Tool {
    public void Work() {
        System.out.println("working");
    }
}
