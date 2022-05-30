package com.example.Default_Spring_Security_Application;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultSecurityMyController {

	@GetMapping("/")
	public String home() {
		return "<h1> Welcome to Capgemini Company </h1> "
				+ "<br> This is Default Spring Security Application ";
	}
}
