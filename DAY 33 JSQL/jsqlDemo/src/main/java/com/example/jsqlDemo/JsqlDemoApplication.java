package com.example.jsqlDemo;




import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class JsqlDemoApplication {

	public static void main(String[] args) {
		
		
		ApplicationContext context;
		context=SpringApplication.run(JsqlDemoApplication.class, args);
 
		MyRepository stud;
		stud=context.getBean(MyRepository.class);
		stud.getData();
		
		Student student = new Student(100, "aaa");
		
		
		

	}

}
