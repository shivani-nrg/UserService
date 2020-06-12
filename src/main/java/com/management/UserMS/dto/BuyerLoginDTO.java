package com.management.UserMS.dto;

public class BuyerLoginDTO {
	Integer buyerId;
	String email;
	String password;

	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getBuyerId() {
		return buyerId;
	}
	public void setBuyerId(Integer buyerId) {
		this.buyerId = buyerId;
	}	
	public BuyerLoginDTO() {
		super();
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
