package com.example.demoMVC4;

import java.util.List;

public class Student {

	private String firstName;
	private String lastName;
	private String email;
	private String password;
	
	private String gender;
	private String os;
	private String city;
	
	
	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	private List<String> plang;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<String> getPlang() {
		return plang;
	}

	public void setPlang(List<String> plang) {
		this.plang = plang;
	}
	
	
	

	
	
}
