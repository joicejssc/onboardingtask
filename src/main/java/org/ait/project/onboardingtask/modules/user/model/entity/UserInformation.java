package org.ait.project.onboardingtask.modules.user.model.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_information", schema="db_onlineshop")
public class UserInformation {
	
	@Id
	@Column(name = "id")
	private BigDecimal id;
	
	@Column(name = "user_no")
	private String userNo;
	
	@Column(name = "name")
	private String name;

	@Column(name = "phoneNo")
	private String phoneNo;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "address")
	private String address;

	public UserInformation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserInformation(BigDecimal id, String userNo, String name, String phoneNo, String email, String address) {
		super();
		this.id = id;
		this.userNo = userNo;
		this.name = name;
		this.phoneNo = phoneNo;
		this.email = email;
		this.address = address;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
