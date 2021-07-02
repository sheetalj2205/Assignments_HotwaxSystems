package com.employees;

public class Employee {

	private String name;
	private String emailId;
	private int age;
	private String dob;

	public Employee() {
		super();
	}

	public Employee(String name, String emailId, int age, String dob) {
		super();
		this.name = name;
		this.emailId = emailId;
		this.age = age;
		this.dob = dob;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

}
