package org.ait.project.onboardingtask.modules.transaction.model.entity;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "transaction", schema="db_onlineshop")
public class Transaction {
	
	@Id
	@Column(name = "id")
	private BigDecimal id;
	
	@Column(name = "transaction_id")
	private String transactionId;
	
	@Column(name = "created_by")
	private String createdBy;
	
	@Column(name = "created_date")
	private ZonedDateTime createdDate;

	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Transaction(BigDecimal id, String transactionId, String createdBy, ZonedDateTime createdDate) {
		super();
		this.id = id;
		this.transactionId = transactionId;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
	}

	public BigDecimal getId() {
		return id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public ZonedDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(ZonedDateTime createdDate) {
		this.createdDate = createdDate;
	}
}
