package syntax.spring.bean.basicBeanByAnnotation;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // 标识这是配置类
@ComponentScan(basePackages = "syntax.spring.bean.basicBeanByAnnotation")  // 扫描指定包下的组件
public class AppConfig {
    // 空配置类，使用注解扫描
}
