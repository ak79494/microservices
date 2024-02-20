package com.example.department.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.department.entity.Department;
import com.example.department.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService {
	@Autowired
	private DepartmentRepository repository;

	@Override
	public Department save(Department department) {
		return repository.save(department);
	}

	@Override
	public Department getDepartment(int id) {
		
		return repository.findById(id).orElse(null);
	}

}
