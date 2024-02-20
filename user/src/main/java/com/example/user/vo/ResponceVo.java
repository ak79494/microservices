package com.example.user.vo;

import com.example.user.entity.UserDTO;

public class ResponceVo {
	private UserDTO user;
	private Department department;
	public UserDTO getUser() {
		return user;
	}
	public void setUser(UserDTO user) {
		this.user = user;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	
}
