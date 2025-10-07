package com.example.demo.实现方式3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*
* 使用spring注解
* */
@Component
public class Person {
    // 字段上标记注解，由框架自动注入
    @Autowired
    private com.example.demo.实现方式3.Tool tool;

    public void Run() {
        tool.Work();
    }
}
