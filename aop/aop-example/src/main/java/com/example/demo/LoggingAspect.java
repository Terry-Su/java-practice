package com.example.demo;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    // 在方法执行前执行
    @Before("execution(* com.example.demo.CalculatorService.*(..))")
    public void logBefore(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println("【前置通知】准备执行方法: " + methodName + ", 参数: " + java.util.Arrays.toString(args));
    }

    // 在方法执行后执行（无论是否抛出异常）
    @After("execution(* com.example.demo.CalculatorService.*(..))")
    public void logAfter(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("【后置通知】方法执行完成: " + methodName);
    }

    // 在方法成功返回后执行
    @AfterReturning(pointcut = "execution(* com.example.demo.CalculatorService.*(..))", returning = "result")
    public void logAfterReturning(JoinPoint joinPoint, Object result) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("【返回通知】方法 " + methodName + " 执行成功，返回值: " + result);
    }

    // 在方法抛出异常后执行
    @AfterThrowing(pointcut = "execution(* com.example.demo.CalculatorService.*(..))", throwing = "exception")
    public void logAfterThrowing(JoinPoint joinPoint, Exception exception) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("【异常通知】方法 " + methodName + " 抛出异常: " + exception.getMessage());
    }
}
