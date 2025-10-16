package syntax.spring.mvc.ControllerSyntax;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@SpringBootApplication
public class ControllerSyntax {

    @Controller
    private static class HomeController {
        @GetMapping("/")
        @ResponseBody
        public String home() {
            return "home"; // 返回的是视图名称，会转到对应视图模板文件，比如home.jsp、home.html
        }
    }

    public static void main(String[] args) {
        SpringApplication.run(ControllerSyntax.class, args); // 运行
    }
}
