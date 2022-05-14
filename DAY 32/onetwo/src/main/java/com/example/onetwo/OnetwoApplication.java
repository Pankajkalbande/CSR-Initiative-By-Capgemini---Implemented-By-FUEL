package com.example.onetwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class OnetwoApplication {

	public static void main(String[] args) {
		ApplicationContext context;
		context = SpringApplication.run(OnetwoApplication.class, args);
		
		RoleRepository role;
		role = context.getBean(RoleRepository.class);
		
		EmpRepository emp;
		emp = context.getBean(EmpRepository.class);
		
		Role r1 = new Role(1, "one");
		role.save(r1);
		
		Emp e1=new Emp(100,"bbb", r1);
		emp.save(e1);
		
	}

}
