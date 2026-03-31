package com.example.demo.entity;


import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("person")
public class Person {
    private Integer id;
    private String name;
    private Double num;

    // 无参构造器、有参构造器、getter和setter方法省略...
    // 建议使用IDE生成或使用Lombok注解
}