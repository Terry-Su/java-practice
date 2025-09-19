package com.example.demo.applicationProperties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class ApplicationPropertiesTest {
    @Value("${spring.application.name}") // 从配置文件中读取 database.url 的值
    private static String testStr;

    public static void main(String[] args) {
        System.out.println(testStr);
    }
}
