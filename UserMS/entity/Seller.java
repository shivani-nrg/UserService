package com.management.UserMS.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="seller")
public class Seller {
	@Id
	@Column(name="SELLERID",nullable = false)
	Integer sellerId;
	@Column(name="NAME",nullable = false,length=45)
	String name;
	@Column(name="EMAIL",nullable = false,length=45)
	String email;
	@Column(name="PHONENUMBER",nullable = false,length=45)
	String phoneNumber;
	@Column(name="PASSWORD",nullable = false,length=45)
	String password;
	@Column(name="ISACTIVE", nullable = true)
	Boolean isActive;
	public Integer getSellerId() {
		return sellerId;
	}
	public void setSellerId(Integer sellerId) {
		this.sellerId = sellerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	
	
	
}
