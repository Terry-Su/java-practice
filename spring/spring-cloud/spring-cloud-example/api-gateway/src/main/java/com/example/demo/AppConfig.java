package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

// 配置 RestTemplate
@Configuration
public class AppConfig {

//    @LoadBalanced  // 开启负载均衡
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
