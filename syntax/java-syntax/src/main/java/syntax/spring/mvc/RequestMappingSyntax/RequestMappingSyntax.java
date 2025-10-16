package syntax.spring.mvc.RequestMappingSyntax;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;


@SpringBootApplication
public class RequestMappingSyntax {

    @RestController
    private static class HomeController {
        @RequestMapping("/")
        public String home() {
            return "home";
        }

        @RequestMapping(value="/greet",method= RequestMethod.GET)
        public String greetGet() {
            return "GET: Hello!";
        }

        // curl -X GET http://localhost:8081/greet
        @RequestMapping(value="/greet",method= RequestMethod.POST)
        public String greetPost() {
            return "POST: Hello!";
        }

        @RequestMapping(value="/user/{id}",method= RequestMethod.GET)
        public String getUserById(@PathVariable("id") String id) {
            return "User id = " + id;
        }

        @RequestMapping(value="/search",method= RequestMethod.GET)
        public String getQuery(@RequestParam("q") String query) {
            return "Search query = " + query;
        }




    }

    public static void main(String[] args) {
        SpringApplication.run(RequestMappingSyntax.class, args); // 运行
    }
}
