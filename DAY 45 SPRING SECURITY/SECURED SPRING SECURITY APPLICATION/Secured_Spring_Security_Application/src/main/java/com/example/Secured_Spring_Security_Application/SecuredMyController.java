package com.example.Secured_Spring_Security_Application;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecuredMyController {

	@GetMapping("/")
	public String home() {
		return "<h1> Welcome to Secured Spring Web Application </h1>"
				+ "<a href=/logout> Logout </a> ";
	}
}
