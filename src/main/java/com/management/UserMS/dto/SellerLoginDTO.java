package com.management.UserMS.dto;

public class SellerLoginDTO {
	Integer sellerId;
	String email;
	String password;

	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Integer getSellerId() {
		return sellerId;
	}
	public void setSellerId(Integer sellerId) {
		this.sellerId = sellerId;
	}
	public SellerLoginDTO() {
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
		return "LoginDTO [SellerId=" + sellerId + ", password=" + password + "]";
	}
	
	
	

}
