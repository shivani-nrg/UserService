package com.management.UserMS.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name="Wishlist")
public class Wishlist{

	@EmbeddedId
	private CartId cartId;

	public CartId getCartId() {
		return cartId;
	}

	public void setCartId(CartId cartId) {
		this.cartId = cartId;
	}
	
}