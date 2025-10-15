package syntax.spring.bean.basicBeanByAnnotation2;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component  // 标识这是一个Spring组件（Bean）
public class HelloWorld2 {
    HelloWorld helloWorld;

//    @Autowired
    public HelloWorld2(HelloWorld helloWorld) {
        this.helloWorld = helloWorld;
    }

    public void sayHello() {
        helloWorld.setMessage("World");
        helloWorld.sayHello();
    }
}
