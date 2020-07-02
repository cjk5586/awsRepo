package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
//
@SpringBootApplication
public class FirstPjtApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstPjtApplication.class, args);
	}
	@RequestMapping(path="")
	public String test() {
		return "2nd test";
	}

}
