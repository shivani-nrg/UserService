package com.management.UserMS.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Wishlist")
public class Wishlist {

	 @EmbeddedId
		@Column(name = "BUYERID", nullable = false)
		Integer buyerId;
	 @EmbeddedId
		@Column(name = "PRODID", nullable = false)
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
	 
}