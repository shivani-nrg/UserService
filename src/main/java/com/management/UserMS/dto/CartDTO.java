package com.management.UserMS.dto;


import com.management.UserMS.entity.*;


public class CartDTO {
	Integer buyerid;
	Integer prodid;
	Integer quantity;
	public Integer getBuyerid() {
		return buyerid;
	}
	public void setBuyerid(Integer buyerid) {
		this.buyerid = buyerid;
	}
	public Integer getProdid() {
		return prodid;
	}
	public void setProdid(Integer prodid) {
		this.prodid = prodid;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	//Converts Entity into DTO
	public Cart createEntity(){
		// TODO Auto-generated method stub
		Cart cart = new Cart();
		cart.getCartId().setBuyerId(this.getBuyerid());
		cart.getCartId().setProdId(this.getProdid());
		cart.setQuantity(this.getQuantity());
		
		
		return cart;
	}
	
//converts entity to DTO
	public static CartDTO valueOf(Cart cart) {
		// TODO Auto-generated method stub
		CartDTO cartDTO=new CartDTO();
		cartDTO.setBuyerid(cart.getCartId().getBuyerId());
		cartDTO.setProdid(cart.getCartId().getProdId());
		cartDTO.setQuantity(cart.getQuantity());
		return cartDTO;
	}
	
	@Override
	public String toString() {
		return "CartDTO [BuyerId="+ buyerid + "ProdId=" + prodid+ "Quantity="+ quantity +"]";
	}
   
    
}