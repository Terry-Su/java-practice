package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Custom {
    public static void main(String[] args) {
        // 创建Spring容器
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Custom.class);

        // 获取计算器服务bean
        CalculatorService calculator = context.getBean(CalculatorService.class);

        System.out.println("=== 测试正常运算 ===");
        // 测试正常运算
        int result1 = calculator.add(10, 5);
        System.out.println("结果: " + result1);

        System.out.println("\n=== 测试异常情况 ===");
        // 测试异常情况
        try {
            calculator.divide(10, 0);
        } catch (Exception e) {
            System.out.println("捕获到异常: " + e.getMessage());
        }

        // 关闭容器
        context.close();
    }
}
