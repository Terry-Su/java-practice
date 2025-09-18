package com.example.syntax.annotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;



public class AnnotationPractice {
    // 元注解：定义注解的行为
    @Retention(RetentionPolicy.RUNTIME) // 运行时保留
    @Target(ElementType.METHOD) // 只能用于方法
    static public @interface MyCustomAnnotation {
        // 注解元素 - 类似于接口方法
        String value() default "default value";
        String description() default "";
        int priority() default 0;
        String[] tags() default {};
    }

    static public class TestClass {
        @MyCustomAnnotation(
                value = "important",
                description = "这是一个重要的方法",
                priority = 1,
                tags = {"urgent", "critical"}
        )
        public void importantMethod() {
            System.out.println("执行重要方法");
        }

        @MyCustomAnnotation // 使用默认值
        public void normalMethod() {
            System.out.println("执行普通方法");
        }
    }

    public static void main(String[] args) {
        TestClass testClass = new TestClass();
        testClass.normalMethod();
        testClass.importantMethod();
    }
}
