package com.example.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.modal.UserModal;

@RestController("user")
public class UserController {
	
	@GetMapping
	public UserModal getAllUserDetails(String userEmail) {
		
		return new UserModal();
	}
	
	@PutMapping
	public UserModal updateUserDetails(UserModal usermodal) {
		
		return new UserModal();
	}
	
	@PostMapping
	public String addUserDetails(UserModal usermodal) {
		
		return "";
	}
	
	@DeleteMapping
	public String deleteUserDetails(String userEmail) {
		
		return "";
	}

}
