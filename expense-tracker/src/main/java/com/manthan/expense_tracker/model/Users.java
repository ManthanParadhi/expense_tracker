package com.manthan.expense_tracker.model;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import lombok.Data;

@Entity
@Data
public class Users {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String fname;
	private String lname;
	@Column(unique = true)
	private String email;
	@Column(unique = true)
	private Long mobile;
	private String password;
	@Column(name = "last_updated_at")
	private Timestamp lastUpdatedAt;
	@Column(name = "created_at", updatable = false)
	private Timestamp createdAt;
	private Long rowstate;

	@PrePersist
	protected void onCreate() {
		setCreatedAt();
		setRowstate(0L);
	}

	@PreUpdate
	protected void onUpdate() {
		setLastUpdatedDate();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Timestamp getLastUpdatedDate() {
		return lastUpdatedAt;
	}

	public void setLastUpdatedDate() {
		this.lastUpdatedAt =  new Timestamp(System.currentTimeMillis());
	}

	public Timestamp getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt() {
		this.createdAt =  new Timestamp(System.currentTimeMillis());
	}

	public Long getRowstate() {
		return rowstate;
	}

	public void setRowstate(Long rowstate) {
		this.rowstate = rowstate;
	}

}
