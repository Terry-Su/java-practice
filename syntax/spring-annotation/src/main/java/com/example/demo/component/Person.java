package com.example.demo.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // 这个注解将该类标记为Spring组件，会被自动扫描并创建Bean
public class Person {
    // 使用@Autowired自动注入MessageService Bean
    @Autowired
    private Tool tool;

    public void Speck() {
        System.out.println("Hello, I'm Person");
    }

    public void UseTool() {
        tool.Work();
    }
}
