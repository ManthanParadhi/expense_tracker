package com.manthan.expense_tracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manthan.expense_tracker.model.Users;

public interface UserRepo extends JpaRepository<Users, Long> {

	Users getByEmail(String email);

}
