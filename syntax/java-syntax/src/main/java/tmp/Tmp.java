package tmp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class Tmp {
    @Value("${spring.application.name}")
    private String appName;


    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Tmp.class, args); // 运行
        Tmp app = context.getBean(Tmp.class);
        System.out.println("App Name = " + app.appName);
//        System.out.println("appName" + appName);
    }
}
