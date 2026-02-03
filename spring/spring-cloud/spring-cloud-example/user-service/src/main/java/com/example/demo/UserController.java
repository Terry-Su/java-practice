package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id) {
        // 模拟用户数据
        return new User(id, "用户" + id, "user" + id + "@example.com");
    }

    @GetMapping
    public List<User> getUsers() {
        return Arrays.asList(
                new User(1L, "张三", "zhangsan@example.com"),
                new User(2L, "李四", "lisi@example.com")
        );
    }
}

// 用户实体类
class User {
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