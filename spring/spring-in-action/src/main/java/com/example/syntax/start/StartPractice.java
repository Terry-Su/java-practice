package com.example.syntax.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StartPractice {
    public static void main(String[] args) {
        // 创建实例
        SpringApplication app = new SpringApplication(StartPractice.class);

        // app配置
        // 懒加载
        app.setLazyInitialization(true);

        // banner
        app.setBanner((environment, sourceClass, out) -> {
            out.println("==========================");
            out.println("   My Awesome Application");
            out.println("==========================");
        });

        // 运行
        app.run();
    }
}
