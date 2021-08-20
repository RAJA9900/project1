package com.app.model;

public class Product {
     private int pr_id;
     private String pr_name;
     private double pr_price;
     private int pr_type_id;
     private ProductType  productType;
     
     public Product()
     {
    	 
     }


	public ProductType getProductType() {
		return productType;
	}


	public void setProductType(ProductType productType) {
		this.productType = productType;
	}


	public int getPr_id() {
		return pr_id;
	}


	public void setPr_id(int pr_id) {
		this.pr_id = pr_id;
	}


	public String getPr_name() {
		return pr_name;
	}


	public void setPr_name(String pr_name) {
		this.pr_name = pr_name;
	}


	public double getPr_price() {
		return pr_price;
	}


	public void setPr_price(double pr_price) {
		this.pr_price = pr_price;
	}


	public int getPr_type_id() {
		return pr_type_id;
	}


	public void setPr_type_id(int pr_type_id) {
		this.pr_type_id = pr_type_id;
	}


	public Product(int pr_id, String pr_name, double pr_price, int pr_type_id, ProductType productType) {
		super();
		this.pr_id = pr_id;
		this.pr_name = pr_name;
		this.pr_price = pr_price;
		this.pr_type_id = pr_type_id;
		this.productType = productType;
	}


	@Override
	public String toString() {
		return "Product [pr_id=" + pr_id + ", pr_name=" + pr_name + ", pr_price=" + pr_price + ", pr_type_id="
				+ pr_type_id + ", productType=" + productType + "]";
	}


	
     
     
}
