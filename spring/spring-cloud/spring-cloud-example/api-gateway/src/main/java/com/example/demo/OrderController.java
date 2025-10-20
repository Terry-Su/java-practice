package com.example.demo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    // 用户实体类
    @Data
    public class User {
        private Long id;
        private String name;
        private String email;

        // 构造方法、getter、setter
        public User(Long id, String name, String email) {
            this.id = id;
            this.name = name;
            this.email = email;
        }

        // getter 和 setter 方法...
    }


    @GetMapping("/user/{userId}")
    public String getUserOrders(@PathVariable Long userId) {
        // 使用服务名调用用户服务
        String userServiceUrl = "http://user-service/users/" + userId;
        User user = restTemplate.getForObject(userServiceUrl, User.class);

        return "用户 " + user.getName() + " 的订单列表";
    }
}

