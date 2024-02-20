package com.example.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.user.entity.UserDTO;
import com.example.user.service.UserService;
import com.example.user.vo.ResponceVo;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	private UserService service;
	
	@PostMapping("/save")
	public UserDTO save(@RequestBody UserDTO dto) {
		return service.save(dto);
	}
	@RequestMapping("/get/{id}")
	public UserDTO get(@PathVariable("id") int id) {
		return service.getUserDTO(id);
	}
	@RequestMapping("/getUserDepartment/{id}")
	public ResponceVo getUserDepartment(@PathVariable("id") int id) {
		return service.getUserDTODepartment(id);
	}
	
}
