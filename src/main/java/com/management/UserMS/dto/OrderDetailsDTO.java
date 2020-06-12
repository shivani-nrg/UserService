package com.management.UserMS.dto;

import java.util.Date;

//import javax.persistence.Column;
//import javax.persistence.Id;

//import com.team4.ordermanagement.order.entity.OrderDetails;

public class OrderDetailsDTO {
	
	Integer orderid;
	Integer buyerid;
	Float amount;
	Date date;
	String address;
	String status;
	
	
	public OrderDetailsDTO() {
		super();
		
	}
	
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Float getAmount() {
		return amount;
	}
	public void setAmount(Float amount) {
		this.amount = amount;
	}
	public Integer getBuyerid() {
		return buyerid;
	}
	public void setBuyerid(Integer buyerid) {
		this.buyerid = buyerid;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Integer getOrderid() {
		return orderid;
	}
	public void setOrderid(Integer orderid) {
		this.orderid = orderid;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
//	// Converts Entity into DTO
//	public static OrderDetailsDTO valueOf(OrderDetails orderdetails) {
//		OrderDetailsDTO orderdetailsDTO=new OrderDetailsDTO();
//		orderdetailsDTO.setAddress(orderdetails.getAddress());
//		orderdetailsDTO.setAmount(orderdetails.getAmount());
//		orderdetailsDTO.setBuyerid(orderdetails.getBuyerid());
//		orderdetailsDTO.setDate(orderdetails.getDate());
//		orderdetailsDTO.setOrderid(orderdetails.getOrderid());
//		orderdetailsDTO.setStatus(orderdetails.getStatus());
//		return orderdetailsDTO;
//	}
	
	
//	@Override
//	public String toString() {
//		return "OrderDetailsDTO [BuyerId=" + buyerid + ", OrderId=" + orderid + ", Amount=" + amount
//				+ ", Date=" + date + ", Address=" + address + ", Status =" + status +"]";
//	}
	
	
	

//	public OrderDetails createEntity() {
//		OrderDetails order = new OrderDetails();
//		order.setAddress(this.getAddress());
//		order.setAmount(this.getAmount());
//		order.setBuyerid(this.getBuyerid());
//		order.setDate(this.getDate());
//		order.setOrderid(this.getOrderid());
//		order.setStatus(this.getStatus());
//		
//		return order;
//	}


	@Override
	public String toString() {
		return "OrderDetailsDTO [orderid=" + orderid + ", buyerid=" + buyerid + ", amount=" + amount + ", date=" + date
				+ ", address=" + address + ", status=" + status + "]";
	}
	
}