package com.manthan.expense_tracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manthan.expense_tracker.model.Transaction;
import com.manthan.expense_tracker.service.TransactionService;

@RestController
@RequestMapping("/api/transactions")
public class TransactionController {
	
	@Autowired
	private TransactionService transactionService;
	
	@GetMapping
	public List<Transaction> getAllTransactions(){
		List<Transaction> transactions = transactionService.getAllTransactions();
		return transactions;
	}

}
