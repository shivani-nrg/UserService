package com.management.UserMS.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name="buyer")
public class Buyer{
	
	@Id
	@Column(name="BUYERID", nullable = false)
	@GeneratedValue(strategy=GenerationType.AUTO)
	Integer buyerId;
	@Column(name="NAME", nullable = false)
	String name;
	@Column(name="EMAIL", nullable = false)
	String email;
	@Column(name="PHONENUMBER", nullable = false)
	String phoneNumber;
	@Column(name="PASSWORD", nullable = false)
	String password;
	@Column(name="ISPRIVILEGED", nullable = true)
	Boolean isPrivileged;
	@Column(name="REWARDPOINTS", nullable = true)
	Integer rewardPoints;
	@Column(name="ISACTIVE",nullable=true)
	Boolean isActive;
	public Integer getBuyerId() {
		return buyerId;
	}
	public void setBuyerId(Integer buyerId) {
		this.buyerId = buyerId;
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

	public Boolean getIsPrivileged() {
		return isPrivileged;
	}
	public void setIsPrivileged(Boolean isPrivileged) {
		this.isPrivileged = isPrivileged;
	}
	public Boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	public Integer getRewardPoints() {
		return rewardPoints;
	}
	public void setRewardPoints(Integer rewardPoints) {
		this.rewardPoints = rewardPoints;
	}
	

	}
	
