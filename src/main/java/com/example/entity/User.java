package com.example.entity;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class User {

	@NotEmpty(message="Name is madatory")
	@Size(min =2, max=8,message="mon 2 and max 8 chars are allowed")
	private String name;
	@Email(message="Enter valid email")
	private String email;
	@NotNull(message="Moblile number is mandatory")
	private Long mobile;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", mobile=" + mobile + "]";
	}
	
	
	
}
