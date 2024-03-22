package com.insuranceapp.model;

import java.util.List;

public class AppUser {

//	name,id,pasword,email.role
	
	private String username;
	private Integer userId;
	private String password;
	private String emialId;
	private List<String> role;
	public AppUser() {
		super();
	}
	public AppUser(String username, Integer userId, String password, String emialId, List<String> role) {
		super();
		this.username = username;
		this.userId = userId;
		this.password = password;
		this.emialId = emialId;
		this.role = role;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmialId() {
		return emialId;
	}
	public void setEmialId(String emialId) {
		this.emialId = emialId;
	}
	public List<String> getRole() {
		return role;
	}
	public void setRole(List<String> role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "AppUser [username=" + username + ", userId=" + userId + ", password=" + password + ", emialId="
				+ emialId + ", role=" + role + "]";
	}
	
	
	
}
