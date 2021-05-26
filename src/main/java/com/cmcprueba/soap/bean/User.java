package com.cmcprueba.soap.bean;

import com.cmcprueba.users.Authentication;

public class User {
	private int id;
	private String name;
	private String email;
	private String phone;
	private Authentication authentication;
	
	public User(int id, String name, String email, String phone,  Authentication authentication) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.authentication = authentication;
	}
	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Authentication getAuthentication() {
		return authentication;
	}

	public void setAuthenticationDao(Authentication authentication) {
		this.authentication = authentication;
	}
	
	
	
}
