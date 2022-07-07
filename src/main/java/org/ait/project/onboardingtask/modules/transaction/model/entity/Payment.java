package org.ait.project.onboardingtask.modules.transaction.model.entity;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "payment", schema="db_onlineshop")
public class Payment {
	
	@Id
	@Column(name = "id")
	private BigDecimal id;
	
	@Column(name = "payment_no")
	private String paymentNo;
	
	@Column(name = "transaction_no")
	private String transactionNo;
	
	@Column(name = "bank_name")
	private String bankName;
	
	@Column(name = "bank_ccount")
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

	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Payment(BigDecimal id, String paymentNo, String transactionNo, String bankName, String bankAccount,
			String paymentMethod, String paymentStatus, ZonedDateTime createdDate, String createdBy,
			ZonedDateTime updateDate, String updateBy) {
		super();
		this.id = id;
		this.paymentNo = paymentNo;
		this.transactionNo = transactionNo;
		this.bankName = bankName;
		this.bankAccount = bankAccount;
		this.paymentMethod = paymentMethod;
		this.paymentStatus = paymentStatus;
		this.createdDate = createdDate;
		this.createdBy = createdBy;
		this.updateDate = updateDate;
		this.updateBy = updateBy;
	}

	public BigDecimal getId() {
		return id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public String getPaymentNo() {
		return paymentNo;
	}

	public void setPaymentNo(String paymentNo) {
		this.paymentNo = paymentNo;
	}

	public String getTransactionNo() {
		return transactionNo;
	}

	public void setTransactionNo(String transactionNo) {
		this.transactionNo = transactionNo;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public ZonedDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(ZonedDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public ZonedDateTime getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(ZonedDateTime updateDate) {
		this.updateDate = updateDate;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}
}
