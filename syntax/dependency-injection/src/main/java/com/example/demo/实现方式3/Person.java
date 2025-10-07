package com.example.demo.实现方式3;

/*
* 使用spring注解
* */
public class Person {
    private com.example.demo.实现方式3spring框架.Tool tool;

    // Setter 方法用于注入依赖
    public void SetTool(com.example.demo.实现方式3.Tool tool) {
        this.tool = tool;
    }
}
