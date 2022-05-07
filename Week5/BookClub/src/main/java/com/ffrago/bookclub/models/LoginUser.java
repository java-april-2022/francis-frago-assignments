package com.ffrago.bookclub.models;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class LoginUser {

	@NotBlank
    @Email(message="Please enter a valid email!")
    private String userEmail;
    
	@NotBlank
    @Size(min=8, max=200, message="Incorrect password!")
    private String userPassword;
    
    public LoginUser() {
    	
    }

// Getters and Setters
    
	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
    
}