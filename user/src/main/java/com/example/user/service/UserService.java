package com.example.user.service;

import com.example.user.entity.UserDTO;
import com.example.user.vo.ResponceVo;

public interface UserService {

	UserDTO save(UserDTO dto);

	UserDTO getUserDTO(int id);

	ResponceVo getUserDTODepartment(int id);

}
