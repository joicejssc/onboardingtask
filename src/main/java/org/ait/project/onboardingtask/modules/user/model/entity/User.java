package org.ait.project.onboardingtask.modules.user.model.entity;

import java.math.BigDecimal;

import javax.persistence.*;

@Entity
@Table(name = "user", schema="db_onlineshop")
public class User {
	
	@Id
	@Column(name = "id")
	private BigDecimal id;
	
	@Column(name = "user_no")
	private String userNo;
	
	@Column(name = "username")
	private String username;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "role")
	private String role;
	
	@Column(name = "status")
	private String status;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User(BigDecimal id, String userNo, String username, String password, String role, String status) {
		super();
		this.id = id;
		this.userNo = userNo;
		this.username = username;
		this.password = password;
		this.role = role;
		this.status = status;
	}

	public BigDecimal getId() {
		return id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public String getUserNo() {
		return userNo;
	}

	public void setUserNo(String userNo) {
		this.userNo = userNo;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
