package com.example.demo.实现方式2;

/*
* 使用set方法
* */
public class Person {
    private Tool tool;

    // Setter 方法用于注入依赖
    public void SetTool(Tool tool) {
        this.tool = tool;
    }
}
