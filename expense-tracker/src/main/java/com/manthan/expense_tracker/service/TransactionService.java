package com.manthan.expense_tracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manthan.expense_tracker.model.Transaction;
import com.manthan.expense_tracker.repository.TransactionRepo;

@Service
public class TransactionService {
	@Autowired
	private TransactionRepo transactionRepo;
	
	public List<Transaction> getAllTransactions(){
		return transactionRepo.findAll();
	}
	
	public Transaction saveTransaction(Transaction transaction) {
		return transactionRepo.save(transaction);
	}
}
