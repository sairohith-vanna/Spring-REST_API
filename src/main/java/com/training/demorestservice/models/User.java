package com.training.demorestservice.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
	
	@Column
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	private String firstName;
	@Column
	private String hallTicketID;
	@Column
	private String username;
	@Column
	private String password;
	@Column
	private long secretKey;
	
	public String getHallTicketID() {
		return hallTicketID;
	}
	public void setHallTicketID(String hallTicketID) {
		this.hallTicketID = hallTicketID;
	}
	
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
