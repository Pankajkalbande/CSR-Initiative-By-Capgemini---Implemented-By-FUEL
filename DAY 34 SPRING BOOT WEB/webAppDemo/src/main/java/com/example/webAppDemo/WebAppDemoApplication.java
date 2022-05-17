package com.example.webAppDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class WebAppDemoApplication {

	public static void main(String[] args) {
		
		ApplicationContext context;
		context = SpringApplication.run(WebAppDemoApplication.class, args);
		
		StudentDetails st;
		st=context.getBean(StudentDetails.class);
		st.setdata();
		st.shodata();

	}

	
	
}
