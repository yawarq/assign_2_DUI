package com.example.demo.entity;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name="apiTable")
public class DataEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable=false)
	private String modeOfTransport;
	
	@Column(nullable=false)
	private String src;
	
	@Column(nullable=false)
	private String destination;
	
	@Column(nullable=false)
	private int price;
	
	@Column(nullable=false)
	private int timeReq;

}
