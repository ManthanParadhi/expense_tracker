package com.manthan.expense_tracker.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.manthan.expense_tracker.model.UserPrincipal;
import com.manthan.expense_tracker.model.Users;
import com.manthan.expense_tracker.repository.UserRepo;

@Service
public class UserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService {
	
	@Autowired
	private UserRepo userRepo;
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		Users user = userRepo.getByEmail(email);
		if(user == null) {
			System.out.println("User Not Found");
            throw new UsernameNotFoundException("user not found");
		}
		return new UserPrincipal(user);
	}
	

	
}
