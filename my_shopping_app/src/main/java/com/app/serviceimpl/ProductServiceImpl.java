package com.app.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import com.app.dao.ProductDAO;
import com.app.daoimpl.ProductDAOImpl;
import com.app.exception.BusinessException;
import com.app.model.Product;
import com.app.service.ProductService;

public class ProductServiceImpl implements ProductService{
	ProductDAO productDAO = new ProductDAOImpl();
	@Override
	public int createProduct(Product product) throws BusinessException {
		int createProduct = 0;
		createProduct = productDAO.createProduct(product);

		return createProduct;
	}

	@Override
	public int deleteProduct(int Pr_id) throws BusinessException {
		int deleteProduct=0;
		deleteProduct=productDAO.deleteProduct(Pr_id);
		
		return deleteProduct;
	}

	@Override
	public List<Product> getAllProducts() throws BusinessException {
		List<Product> productList=new ArrayList<>();
		productList=productDAO.getAllProducts();
		return productList;
	}

	
	 	/*@Override
	public List<Product> getAllProducts() throws BusinessException {
		List<Product> productList =new ArrayList<>();
		productList=productDAO.getAllProducts();
		System.out.println(productList);
		return productList;
	*/
	
	
	
	

}
