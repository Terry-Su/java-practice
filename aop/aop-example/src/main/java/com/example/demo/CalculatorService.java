package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public int add(int a, int b) {
        System.out.println("执行加法运算: " + a + " + " + b);
        return a + b;
    }

    public int subtract(int a, int b) {
        System.out.println("执行减法运算: " + a + " - " + b);
        return a - b;
    }

    public int multiply(int a, int b) {
        System.out.println("执行乘法运算: " + a + " * " + b);
        return a * b;
    }

    public int divide(int a, int b) {
        System.out.println("执行除法运算: " + a + " / " + b);
        if (b == 0) {
            throw new IllegalArgumentException("除数不能为零");
        }
        return a / b;
    }
}