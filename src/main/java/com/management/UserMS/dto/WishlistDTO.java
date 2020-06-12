package com.management.UserMS.dto;

import com.management.UserMS.entity.Buyer;
import com.management.UserMS.entity.Wishlist;

public class WishlistDTO {

	Integer buyerId;
	Integer prodId;
	
	public Integer getBuyerId() {
		return buyerId;
	}
	public void setBuyerId(Integer buyerId) {
		this.buyerId = buyerId;
	}
	public Integer getProdId() {
		return prodId;
	}
	public void setProdId(Integer prodId) {
		this.prodId = prodId;
	}
	
	//Converts Entity into DTO
    public static WishlistDTO valueOf(Wishlist wishlist) {
        WishlistDTO wishlistDTO=new WishlistDTO();
        wishlistDTO.setBuyerId(wishlist.getCartId().getBuyerId());
        wishlistDTO.setProdId(wishlist.getCartId().getProdId());
        return wishlistDTO;
}
    //Converts DTO into Entity
        public  Wishlist  createEntity() {
            Wishlist wishlist=new Wishlist();
            wishlist.getCartId().setBuyerId(this.getBuyerId());
            wishlist.getCartId().setProdId(this.getProdId());
            return wishlist;
    }
	
	@Override
	public String toString() {
		return "WishlistDTO [BuyerId="+ buyerId + "ProdId=" +prodId+"]";
	}
	
}