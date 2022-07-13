package org.ait.project.onboardingtask.modules.user.model.entity;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.*;

@Getter
@Setter
@Entity
@Table(name = "payment", schema="db_onlineshop")
public class Payment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private BigDecimal id;
	
	@Column(name = "payment_no")
	private String paymentNo;
	
	@Column(name = "order_no")
	private String orderNo;
	
	@Column(name = "bank_name")
	private String bankName;
	
	@Column(name = "bank_account")
	private String bankAccount;
	
	@Column(name = "payment_method")
	private String paymentMethod;
	
	@Column(name = "payment_status")
	private String paymentStatus;
	
	@Column(name = "created_date")
	private ZonedDateTime createdDate;
	
	@Column(name = "created_by")
	private String createdBy;
	
	@Column(name = "update_date")
	private ZonedDateTime updateDate;
	
	@Column(name = "update_by")
	private String updateBy;
}
