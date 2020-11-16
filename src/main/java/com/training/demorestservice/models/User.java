package com.training.demorestservice.models;

public class User {
	
	private String firstName;
	private String username;
	private String password;
	private long secretKey;
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getSecretKey() {
		return secretKey;
	}
	public void setSecretKey(long secretKey) {
		this.secretKey = secretKey;
	}
	private int age;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
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
