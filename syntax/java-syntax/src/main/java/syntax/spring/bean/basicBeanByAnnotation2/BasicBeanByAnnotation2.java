package syntax.spring.bean.basicBeanByAnnotation2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BasicBeanByAnnotation2 {
    public static void main(String[] args) {
        // 加载Spring配置文件
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // 获取bean实例
        HelloWorld2 helloWorld2  = context.getBean(HelloWorld2.class);

        // 使用bean
        helloWorld2.sayHello();
    }
}
