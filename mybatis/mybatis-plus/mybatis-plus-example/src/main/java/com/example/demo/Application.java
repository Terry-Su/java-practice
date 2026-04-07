package com.example.demo;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.util.JsonUtil;


@SpringBootApplication
@MapperScan("com.example.demo.mapper")
public class Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
        
        UserMapper userMapper = context.getBean(UserMapper.class);
        List<User> userList = userMapper.selectList(null);
        System.out.println("userList: " + JsonUtil.toJson(userList));
        
        context.close();
    }

}