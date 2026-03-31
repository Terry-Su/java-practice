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

	public static void main(String[] args) throws InterruptedException {
		// 基本使用
		Jedis jedis = new Jedis("192.168.130.5", 6379);
		jedis.auth("redistest");
		System.out.println("value:  " + jedis.get("key"));
		jedis.setex("key", 5,"value2");
		System.out.println("value:  " + jedis.get("key"));
		Thread.sleep(1000*3);
		jedis.setex("key", 5,"value3");
		Thread.sleep(1000*4);
		System.out.println("value:  " + jedis.get("key"));
		jedis.close();
	}
}
