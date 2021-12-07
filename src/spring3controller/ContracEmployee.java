package spring3controller;

import java.sql.DriverManager;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class ContracEmployee {
private Integer id;
private String username;
private Integer password;
private	String name;
private int salary;
private String city;
	public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public Integer getPassword() {
	return password;
}
public void setPassword(Integer password) {
	this.password = password;
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
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}


	public void empinfo(){
		System.out.println("i am in impinfo method...");
		try{
		System.out.println(" i am in empinfo  method  ...");
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/shubhangi","root","root");
	    Statement stmt=(Statement) con.createStatement();
	    String sql="update  shubhangi.employee set id=3,username='revan',password=1212,city='goa',name='shubha',salary=70000,city='Nagpur' where id=1";
		int result =stmt.executeUpdate(sql);
		System.out.println(result+"record affected");
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
		}
}