package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//
@SpringBootApplication
@RestController
public class FirstPjtApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstPjtApplication.class, args);
	}
	@RequestMapping("/cicd")
	public String test() {
		return "2nd test";
	}

}
