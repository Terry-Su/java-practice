package syntax.spring.mvc.RestControllerSyntax;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
public class RestControllerSyntax {

    @RestController
    private static class HomeController {
        @GetMapping("/")
        public String home() {
            return "home";
        }
    }

    public static void main(String[] args) {
        SpringApplication.run(RestControllerSyntax.class, args); // 运行
    }
}
