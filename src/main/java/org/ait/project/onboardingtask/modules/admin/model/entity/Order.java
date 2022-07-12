package org.ait.project.onboardingtask.modules.admin.model.entity;

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
@Table(name = "order", schema="db_onlineshop")
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private BigDecimal id;
	
	@Column(name = "order_id")
	private String orderId;

	@Column(name = "product_no")
	private String productNo;

	@Column(name = "product_name")
	private String productName;

	@Column(name = "qty")
	private Integer qty;

	@Column(name = "status_order")
	private String statusOrder;
	
	@Column(name = "created_by")
	private String createdBy;
	
	@Column(name = "created_date")
	private ZonedDateTime createdDate;
}
