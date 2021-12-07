package com.Revan.Pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")

public class Employee {
	
@Id
@GeneratedValue
@Column(name = "id")  			
private int id;
			
			
@Column(name="username")
private String username;
			
@Column(name="password")
private String password;
			
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Column(name="city")
private String city;

@Column(name="name")
private String name;

@Column(name="salary")
private int salary;
		
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}

public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}

}
