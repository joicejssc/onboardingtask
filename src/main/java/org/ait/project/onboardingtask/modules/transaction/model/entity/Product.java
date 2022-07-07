package org.ait.project.onboardingtask.modules.transaction.model.entity;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product", schema="db_onlineshop")
public class Product {
	
	@Id
	@Column(name = "id")
	private BigDecimal id;
	
	@Column(name = "product_no")
	private String productNo;
	
	@Column(name = "product_name")
	private String productName;
	
	@Column(name = "qty")
	private String qty;
	
	@Column(name = "update_date")
	private ZonedDateTime updateDate;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(BigDecimal id, String productNo, String productName, String qty, ZonedDateTime updateDate) {
		super();
		this.id = id;
		this.productNo = productNo;
		this.productName = productName;
		this.qty = qty;
		this.updateDate = updateDate;
	}

	public BigDecimal getId() {
		return id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public String getProductNo() {
		return productNo;
	}

	public void setProductNo(String productNo) {
		this.productNo = productNo;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getQty() {
		return qty;
	}

	public void setQty(String qty) {
		this.qty = qty;
	}

	public ZonedDateTime getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(ZonedDateTime updateDate) {
		this.updateDate = updateDate;
	}
}
