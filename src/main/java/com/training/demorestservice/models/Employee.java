package com.training.demorestservice.models;

import java.util.List;

public class Employee {
	
	private String name;
	private String employeeId;
	private String workingCity;
	private int age;
	private double monthlyPay;
	private List<String> assignmentIds;
	
	public Employee() {}
	
	public Employee(String name, String employeeId, String workingCity, int age, double monthlyPay, List<String> assignmentIds) {
		this.name = name;
		this.employeeId = employeeId;
		this.workingCity = workingCity;
		this.age = age;
		this.monthlyPay = monthlyPay;
		this.assignmentIds = assignmentIds;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getWorkingCity() {
		return workingCity;
	}
	public void setWorkingCity(String workingCity) {
		this.workingCity = workingCity;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getMonthlyPay() {
		return monthlyPay;
	}
	public void setMonthlyPay(double monthlyPay) {
		this.monthlyPay = monthlyPay;
	}

	public List<String> getAssignmentIds() {
		return assignmentIds;
	}

	public void setAssignmentIds(List<String> assignmentIds) {
		this.assignmentIds = assignmentIds;
	}

}
