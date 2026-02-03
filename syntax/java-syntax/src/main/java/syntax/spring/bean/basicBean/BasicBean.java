package syntax.spring.bean.basicBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BasicBean {
    public static void main(String[] args) {
// 加载Spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("basic-bean-beans.xml");

        // 获取bean实例
        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");

        // 使用bean
        helloWorld.sayHello();

        // 或者这样获取
        HelloWorld helloWorld2 = context.getBean("helloWorld", HelloWorld.class);
        System.out.println("Message: " + helloWorld2.getMessage());
    }
}
