package com.example.user.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class UserDTO {
	@Id
	private int userId;
	private String userName;
	private int departmentId;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	
	
	
}
