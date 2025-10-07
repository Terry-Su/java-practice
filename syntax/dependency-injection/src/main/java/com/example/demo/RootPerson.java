package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Person {
    private Tool tool;
    public void UseTool() {
        tool.Work();
    }
}
