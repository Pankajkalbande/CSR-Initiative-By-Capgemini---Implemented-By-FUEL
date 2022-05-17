package com.example.webAppDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping("/") 
	public String sayHello() {
		return "Hello From Spring Boot ";
	}
	
	@GetMapping("/hello")
	public String getMessage() {
		return "Hello World";
	}

}



