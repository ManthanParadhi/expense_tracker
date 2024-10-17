package com.manthan.expense_tracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manthan.expense_tracker.model.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

}