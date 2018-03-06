package com.plutusds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class PlutusdsApplication {

	@RequestMapping("/")
	String home() {
		System.out.println("hello");
		return "Hello World";
	}

	public static void main(String[] args) {

		SpringApplication.run(PlutusdsApplication.class, args);
	}
}
