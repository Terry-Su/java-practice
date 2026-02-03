package syntax.spring.bean.basicBeanByAnnotation2;


import org.springframework.stereotype.Component;

@Component  // 标识这是一个Spring组件（Bean）
public class HelloWorld {
    private String message;

    // 无参构造器
    public HelloWorld() {
    }

    // setter方法
    public void setMessage(String message) {
        this.message = message;
    }

    // 业务方法
    public void sayHello() {
        System.out.println("Hello: " + message);
    }

    public String getMessage() {
        return message;
    }
}
