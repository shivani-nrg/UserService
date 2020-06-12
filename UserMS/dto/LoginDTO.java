package com.management.UserMS.dto;

public class LoginDTO {
	Integer buyerId;
	String password;
	
	public LoginDTO() {
		super();
	}
	public Integer getBuyerId() {
		return buyerId;
	}
	public void setBuyerId(Integer buyerId) {
		this.buyerId = buyerId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "LoginDTO [BuyerId=" + buyerId + ", password=" + password + "]";
	}
	
	

}
