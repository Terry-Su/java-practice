package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import util.JsonUtil;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println(JsonUtil.toJson(123));
//		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {

		return String.format("Hello %s!", name);
	}
}
