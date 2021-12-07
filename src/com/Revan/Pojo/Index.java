package com.Revan.Pojo;

import java.util.Date;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotEmpty;



public class Index {
	
	@NotEmpty(message="Your Username Should not be blank")
	private String username;
	
	@NotEmpty(message="Your Password Should not be blank")
	private String password;
	
	
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
