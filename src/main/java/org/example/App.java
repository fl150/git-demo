package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class App {

	@GetMapping("/")
	public String hello() {
		return "hello git - v0.1 - branch master - merged - v0.10 - rebased - 6";
	}

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
