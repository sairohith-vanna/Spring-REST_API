package com.training.demorestservice.models;

public class UserDTO {

	private String firstName;
	private String username;
	private int age;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String fullName) {
		this.firstName = fullName;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
