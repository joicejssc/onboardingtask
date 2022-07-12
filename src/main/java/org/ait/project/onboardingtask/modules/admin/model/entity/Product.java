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
@Table(name = "product", schema="db_onlineshop")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private BigDecimal id;
	
	@Column(name = "product_no")
	private String productNo;
	
	@Column(name = "product_name")
	private String productName;
	
	@Column(name = "qty")
	private Integer qty;
	
	@Column(name = "update_date")
	private ZonedDateTime updateDate;
}
