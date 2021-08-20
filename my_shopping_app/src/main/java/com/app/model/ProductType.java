package com.app.model;

public class ProductType {
	private int  pr_type_id;
	private String pr_type_name;
    
	public ProductType() {
		
	}

	public int getPr_type_id() {
		return pr_type_id;
	}

	public void setPr_type_id(int pr_type_id) {
		this.pr_type_id = pr_type_id;
	}

	public String getPr_type_name() {
		return pr_type_name;
	}

	public void setPr_type_name(String pr_type_name) {
		this.pr_type_name = pr_type_name;
	}

	public ProductType(int pr_type_id, String pr_type_name) {
		super();
		this.pr_type_id = pr_type_id;
		this.pr_type_name = pr_type_name;
	}

	@Override
	public String toString() {
		return "ProductType [pr_type_id=" + pr_type_id + ", pr_type_name=" + pr_type_name + "]";
	}
	
	

}
