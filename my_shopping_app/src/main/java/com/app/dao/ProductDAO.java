package com.app.dao;

import java.util.List;

import com.app.exception.BusinessException;
import com.app.model.Product;

public interface ProductDAO {
	public int createProduct(Product product) throws BusinessException;
	public int deleteProduct(int Pr_id) throws BusinessException;
	public List<Product> getAllProducts() throws BusinessException;
	

}
