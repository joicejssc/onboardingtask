package org.ait.project.onboardingtask.modules.admin.model.entity;

import java.math.BigDecimal;

import javax.persistence.*;

import lombok.*;

@Getter
@Setter
@Entity
@Table(name = "user", schema="db_onlineshop")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
}
