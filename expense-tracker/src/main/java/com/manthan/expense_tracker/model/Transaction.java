package com.manthan.expense_tracker.model;

import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Transaction {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	private Boolean type;
	private Double amount;
	private Long user_fk;
	private Long category_fk;
	private Timestamp last_updated_date;
	private Timestamp created_at;
	private Long rowstate;
}
