package com.management.UserMS.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;
@Embeddable
public class CartId implements Serializable {
	private Integer buyerId;
	private Integer prodId;
	

	
	
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
	
	
	
	public CartId() {
		// TODO Auto-generated constructor stub
	}
	
	

	public CartId(int buyerId, int prodId) {
		// TODO Auto-generated constructor stub
		this.buyerId=buyerId;
		this.prodId=prodId;
	}
	

	
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CartId that = (CartId) o;
        return buyerId.equals(that.buyerId) && prodId.equals(that.prodId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(buyerId, prodId);
    }

}



