package com.manthan.expense_tracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.manthan.expense_tracker.model.Users;
import com.manthan.expense_tracker.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;

	@PostMapping("/signup")
	public Users singUp(@RequestBody Users user) {
		return userService.signUp(user);
	}
	@PostMapping("/login")
	public String login(@RequestBody Users user) {
		return userService.verify(user);
	}
}
