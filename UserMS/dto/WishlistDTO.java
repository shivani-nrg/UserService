package com.management.UserMS.dto;

import com.management.UserMS.entity.Buyer;
import com.management.UserMS.entity.Wishlist;

public class WishlistDTO {

	Integer buyerid;
	Integer prodid;
	
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
	
	//Converts Entity into DTO
    public static WishlistDTO valueOf(Wishlist wishlist) {
        WishlistDTO wishlistDTO=new WishlistDTO();
        wishlistDTO.setBuyerid(wishlist.getBuyerId());
        wishlistDTO.setProdid(wishlist.getProdId());
        return wishlistDTO;
}
    //Converts DTO into Entity
        public  Wishlist  createEntity() {
            Wishlist wishlist=new Wishlist();
            wishlist.setBuyerId(this.getBuyerid());
            wishlist.setProdId(this.getProdid());
            return wishlist;
    }
	
	@Override
	public String toString() {
		return "WishlistDTO [BuyerId="+ buyerid + "ProdId=" +prodid+"]";
	}
	
}