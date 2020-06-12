package com.management.UserMS.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity

@Table(name="Cart")
public class Cart{
	    @EmbeddedId
		private CartId cartId;
	    
	    @Column(name = "QUANTITY", nullable = false)
		Integer quantity;
		
		public CartId getCartId() {
			return cartId;
		}
		public void setCartId(CartId cartId) {
			this.cartId = cartId;
		}
		public Integer getQuantity() {
			return quantity;
		}
		public void setQuantity(Integer quantity) {
			this.quantity = quantity;
		}
}