package com.example.demoUsingJPAandWEEB;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MyController {

//	Student getStudent() {
//		
//	}
	@Autowired
	private StudentRepository stud;
	
	@GetMapping("/student")
	public List<Student> getAllStudents(){
//		List<Student> studlist;
//		studlist = stud.findAll();
//		return studlist;
//		return studlist;
		
		return stud.findAll();
		
		
//		@GetMapping("/student/{id}")
//		public Student getEmployeeById(@PathVariable())
//		Optional<Student> employee = stud.findById(null)
//		Student st = employee.get();
//		return st;
	}
	
	
}
