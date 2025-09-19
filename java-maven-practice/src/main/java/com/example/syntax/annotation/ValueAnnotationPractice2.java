package com.example.syntax.annotation;

import com.example.syntax.start.StartPractice;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ValueAnnotationPractice2 {

    // 用 @Value 直接读取配置文件中的值
    @Value("${myapp.name}")
    private String appName;

    @PostConstruct
    public void init() {
        System.out.println("App Name2 = " + appName);
    }

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(ValueAnnotationPractice2.class);
        // 强制设置为非Web应用（即使classpath下有web依赖）
        app.setWebApplicationType(WebApplicationType.NONE);
        app.run();
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
