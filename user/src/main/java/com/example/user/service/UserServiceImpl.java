package com.example.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.user.entity.UserDTO;
import com.example.user.repository.UserRepository;
import com.example.user.vo.Department;
import com.example.user.vo.ResponceVo;
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository uRepo;
	
	@Autowired
	private RestTemplate restTemplate;

	@Override
	public UserDTO save(UserDTO dto) {
		return uRepo.save(dto);
	}

	@Override
	public UserDTO getUserDTO(int id) {
		return uRepo.findById(id).orElse(null);
	}

	@Override
	public ResponceVo getUserDTODepartment(int id) {
		ResponceVo vo = new ResponceVo();
		UserDTO userDTO = uRepo.findById(id).orElse(null);
		Department department = restTemplate.getForObject("http://localhost:8084/departments/get/"+userDTO.getDepartmentId(), Department.class);
		vo.setUser(userDTO);
		vo.setDepartment(department);
		return vo;
		
	}

}
