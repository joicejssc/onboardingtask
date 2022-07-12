package org.ait.project.onboardingtask.modules.user.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.ZonedDateTime;

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
