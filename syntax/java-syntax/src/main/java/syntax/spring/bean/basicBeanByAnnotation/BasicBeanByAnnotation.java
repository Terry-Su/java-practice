package syntax.spring.bean.basicBeanByAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BasicBeanByAnnotation {
    public static void main(String[] args) {
        // 加载Spring配置文件
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // 获取bean实例
        HelloWorld helloWorld  = context.getBean(HelloWorld.class);
        helloWorld.setMessage("World");

        // 使用bean
        helloWorld.sayHello();
    }
}
