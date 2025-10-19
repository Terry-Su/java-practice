package com.example.syntax.annotation;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ValueAnnotationPractice  {

    // 用 @Value 直接读取配置文件中的值
    @Value("${myapp.name}")
    private String appName;

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(ValueAnnotationPractice.class, args);
        ValueAnnotationPractice app = context.getBean(ValueAnnotationPractice.class);
        System.out.println("App Name = " + app.appName);
    }

}

//@SpringBootApplication
//public class ValueAnnotationPractice {
//    // 用 @Value 直接读取配置文件中的值
//    @Value("${myapp.name}")
//    private String appName;
//
//    public static void main(String[] args) {
//        SpringApplication.run(ValueAnnotationPractice.class, args);
//        System.out.println("App Name = " + appName);
//    }
//}
