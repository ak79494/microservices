package com.example.department.service;

import com.example.department.entity.Department;

public interface DepartmentService {

	Department save(Department department);

	Department getDepartment(int id);
	

}
