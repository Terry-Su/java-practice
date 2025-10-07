package com.example.demo.实现方式1;

/*
* 使用初始化函数
* */
public class Person {
    private Tool tool;

    // 构造器接收依赖（由外部传入）
    public Person(Tool tool) {
        this.tool = tool;
    }
}
