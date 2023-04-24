package com.ust.webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/test")
public class FirstbootappApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstbootappApplication.class, args);
	}
	@GetMapping("/first")
	//@RequestMapping
	public String respond() {
		return "my first rest controller";
	}
	@GetMapping("/second")
	//@RequestMapping
	public String message() {
		return "today we want break";
	}
	@GetMapping("/third/{custname}")
	public String greetings(@PathVariable  String custname) {
		return "hello dear "+custname;
	}
	@GetMapping("/fourth/{custname}/{gen}")
	public String greetings(@PathVariable String custname ,@PathVariable String gen) {
		if(gen.equals("male")) {
			return "Helo Mr. "+custname;
		}
		else if(gen.equals("female")) {
			return "Hello Ms. "+custname;
			
		}
		else
			return "hello";
	}
	

}
