package com.training.demorestservice.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.demorestservice.models.User;
import com.training.demorestservice.models.UserDTO;

@RestController
@RequestMapping("user")
public class UserController {

	@PostMapping("new")
	public UserDTO storeUser(@RequestBody User user) {
		UserDTO dto = new UserDTO();
		dto.setAge(user.getAge());
		dto.setFirstName(user.getFirstName());
		dto.setUsername(user.getUsername());
		return dto;
	}
}
