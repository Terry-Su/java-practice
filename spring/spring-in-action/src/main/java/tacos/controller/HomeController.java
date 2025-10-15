package tacos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "home"; // 返回的是视图名称，会转到对应视图模板文件，比如home.jsp、home.html
    }
}
