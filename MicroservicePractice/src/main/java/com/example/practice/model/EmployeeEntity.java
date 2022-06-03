package com.example.practice.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "disney")
public class EmployeeEntity {
  private int id;
  private String name;
  private String Address;
  private String phoneNumber;
  
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
public String getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}
public EmployeeEntity() {
	super();

}
public EmployeeEntity(int id, String name, String address, String phoneNumber) {
	super();
	this.id = id;
	this.name = name;
	Address = address;
	this.phoneNumber = phoneNumber;
}



}
