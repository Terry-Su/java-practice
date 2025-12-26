package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import redis.clients.jedis.Jedis;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {

		// 基本使用
		Jedis jedis = new Jedis("192.168.130.5", 6379);
		jedis.auth("redistest");
		jedis.set("key","value1");
		jedis.setex("key", 10,"value1");
		String value = jedis.get("key");
		System.out.println("value:  " + value);
		jedis.close();
	}


}
