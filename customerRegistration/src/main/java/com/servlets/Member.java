package com.servlets;

public class Member {
private String firstname;
private String lastname;
private String address;
private String country;
private String state;
private String city;
private String zip;
private String phone;
private String username;
private String password;
public Member() {
	super();
}
public Member(String firstname, String lastname, String address, String country, String state, String city, String zip,
		String phone, String username, String password) {
	super();
	this.firstname = firstname;
	this.lastname = lastname;
	this.address = address;
	this.country = country;
	this.state = state;
	this.city = city;
	this.zip = zip;
	this.phone = phone;
	this.username = username;
	this.password = password;
}
public Member(String firstname, String lastname, String address,String zip,String state,String country,
		String phone) {
	super();
	this.firstname = firstname;
	this.lastname = lastname;
	this.address = address;
	this.country = country;
	this.state = state;
	this.zip = zip;
	this.phone = phone;
}
public Member(String username, String password) {
	super();
	this.username = username;
	this.password = password;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getZip() {
	return zip;
}
public void setZip(String zip) {
	this.zip = zip;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}



}
