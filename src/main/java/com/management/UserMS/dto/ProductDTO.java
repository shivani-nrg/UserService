package com.management.UserMS.dto;

//import com.team4.ordermanagement.product.entity.Product;


public class ProductDTO {
	int prodId;
	String brand;
	String category;
	String description;
	String image;
	double price;
	String productName;
	int Rating;
	int sellerId;
	int stock;
	String subCategory;
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getBrand() {
		return brand;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getRating() {
		return Rating;
	}
	public void setRating(int rating) {
		this.Rating = Rating;
	}
	public int getSellerId() {
		return sellerId;
	}
	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getSubCategory() {
		return subCategory;
	}
	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}
	
//	public Product createEntity() {
//		// TODO Auto-generated method stub
//		Product product = new Product();
//		product.setBrand(this.getBrand());
//		product.setCategory(this.getCategory());
//		product.setDescription(this.getDescription());
//		product.setImage(this.getImage());
//		product.setPrice(this.getPrice());
//		product.setProdId(this.getProdId());
//		product.setProductName(this.getProductName());
//		product.setRating(this.getRating());
//		product.setSellerId(this.getSellerId());
//		product.setStock(this.getStock());
//		product.setSubCategory(this.getSubCategory());
//		
//		
//		
//		return product;
//		
//	}
//	
//	// Converts Entity into DTO
//	public static ProductDTO valueOf(Product product) {
//		// TODO Auto-generated method stub
//		ProductDTO productDTO=new ProductDTO();
//		productDTO.setBrand(product.getBrand());
//		productDTO.setCategory(product.getCategory());
//		productDTO.setDescription(product.getDescription());
//		productDTO.setImage(product.getImage());
//		productDTO.setPrice(product.getPrice());
//		productDTO.setProdId(product.getProdId());
//		productDTO.setProductName(product.getProductName());
//		productDTO.setRating(product.getRating());
//		productDTO.setSellerId(product.getSellerId());
//		productDTO.setStock(product.getStock());
//		productDTO.setSubCategory(product.getSubCategory());
//		
//		return productDTO;
//	}
//	
//	
//	
//
}
