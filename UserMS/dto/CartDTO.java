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
    public static CartDTO valueOf(Cart cart) {
        CartDTO cartDTO=new CartDTO();
        cartDTO.setBuyerid(cart.getBuyerId());
        cartDTO.setProdid(cart.getProdId());
        cartDTO.setQuantity(cart.getQuantity());
        return cartDTO;
}
    //Converts DTO into Entity
        public  Cart  createEntity() {
            Cart cart=new Cart();
            cart.setBuyerId(this.getBuyerid());
            cart.setProdId(this.getProdid());
            cart.setQuantity(this.getQuantity());
            return cart;
    }
	
	@Override
	public String toString() {
		return "CartDTO [BuyerId="+ buyerid + "ProdId=" + prodid+ "Quantity="+ quantity +"]";
	}
   
    
}