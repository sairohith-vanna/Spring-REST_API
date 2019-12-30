package com.training.demorestservice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.training.demorestservice.models.User;
import com.training.demorestservice.models.UserDTO;
import com.training.demorestservice.services.UserService;

@RestController
@RequestMapping("user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping("new")
	public UserDTO storeUser(@RequestBody User user) {
		userService.saveUser(user);
		UserDTO dto = new UserDTO();
		dto.setAge(user.getAge());
		dto.setFirstName(user.getFirstName());
		dto.setUsername(user.getUsername());
		return dto;
	}
	
	@GetMapping("users")
	public List<User> getUsers() {
		return userService.getAllUsers();
	}
	
	@GetMapping("suser")
	public User getSingleUser(@RequestParam(name = "firstName") String firstName) {
		return userService.getUserByFirstName(firstName);
	}
}
