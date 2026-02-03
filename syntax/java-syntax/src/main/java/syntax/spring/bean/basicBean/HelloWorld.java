package syntax.spring.bean.basicBean;

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
