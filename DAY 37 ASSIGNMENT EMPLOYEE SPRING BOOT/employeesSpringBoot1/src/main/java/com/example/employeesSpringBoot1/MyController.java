package com.example.employeesSpringBoot1;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@Autowired
	private EmployeeRepository emp;
	
	@GetMapping("/employee")
	public List<Employee> getAllStudents() {
		return emp.findAll();
	}

	@PostMapping("/save")
	public Employee createStudent(@RequestBody Employee ep) {
		return emp.save(ep);
	}
	
	@PutMapping("/updateEmployee/{Empid}")
	public boolean updateEmployee(@PathVariable(value = "Empid") Integer empid,
			@RequestBody Employee EmpDetails) throws Exception {
		boolean f=true;
		try {
			Optional<Employee> op = emp.findById(empid);
			Employee ep = op.get();
			ep.setName(EmpDetails.getName());
			final Employee updatedEmployee = emp.save(ep);
		} catch(Exception e) {
			f=false;
		}
		return f;
	}
	
	@DeleteMapping("/deleteemp/{id}")
	public boolean deleteEmployee(@PathVariable(value = "id") Integer empid,
			@RequestBody Employee empDetails) throws Exception {
		Optional<Employee> op = emp.findById(empid);
		Employee st = op.get();
		 
		emp.delete(st);
		return true;
	}
}
