package com.management.UserMS.dto;

import com.management.UserMS.entity.Buyer;

public class BuyerDTO {
	Integer buyerId;
	String name;
	String email;
	String phoneNumber;
	String password;
	Boolean isPrivileged;
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

	Integer rewardPoints;
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

	public Integer getRewardPoints() {
		return rewardPoints;
	}
	public void setRewardPoints(Integer rewardPoints) {
		this.rewardPoints = rewardPoints;
	}

	public BuyerDTO() {
		super();
	}
	// Converts Entity into DTO
	public static BuyerDTO valueOf(Buyer buyer) {
		BuyerDTO buyerDTO= new BuyerDTO();
		buyerDTO.setBuyerId(buyer.getBuyerId());
		buyerDTO.setName(buyer.getName());
		buyerDTO.setEmail(buyer.getEmail());
		buyerDTO.setPhoneNumber(buyer.getPhoneNumber());
		buyerDTO.setPassword(buyer.getPassword());
		buyerDTO.setIsPrivileged(buyer.getIsPrivileged());
		buyerDTO.setRewardPoints(buyer.getRewardPoints());
		buyerDTO.setIsActive(buyer.getIsActive());
		return buyerDTO;
	}
	public Buyer createEntity() {
		Buyer be=new Buyer();
		be.setBuyerId(this.getBuyerId());
		be.setEmail(this.getEmail());
		be.setName(this.getName());
		be.setPassword(this.getPassword());
		be.setPhoneNumber(this.getPhoneNumber());
		be.setIsPrivileged(this.getIsPrivileged());
		be.setIsActive(this.getIsActive());
		be.setRewardPoints(this.getRewardPoints());
		return be;
	}
		
	@Override
	public String toString() {
		return "BuyerDTO [BuyerId="+ buyerId + "Name=" +name+"Email="+ email +"Phonenumber="+ phoneNumber +"Isprivileged"+ isPrivileged +
				"Rewardpoints="+ rewardPoints + "isactive="+ isActive+"]";
	}
	
}
