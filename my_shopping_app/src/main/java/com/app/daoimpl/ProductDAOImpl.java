package com.app.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.app.dao.ProductDAO;
import com.app.dao.dbutil.MySqlDbConnection;
import com.app.exception.BusinessException;

import com.app.model.Product;
//import com.app.model.ProductType;

public class ProductDAOImpl implements ProductDAO {
    public static final Logger log = Logger.getLogger(ProductDAOImpl.class);

	@Override
	public int createProduct(Product product) throws BusinessException {
		int createProduct=0;
		try(Connection connection =MySqlDbConnection.getConnection())
		{
			String sql="insert into product (pr_name,pr_price,pr_type_id) values(?,?,?)";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, product.getPr_name());
			preparedStatement.setDouble(2, product.getPr_price());
			preparedStatement.setInt(3, product.getPr_type_id());
			
			createProduct=preparedStatement.executeUpdate();
			if(createProduct!=1)
			{
				throw new BusinessException("Product added Failed....Please try Again");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			log.error(e);
			throw new BusinessException("Internal Error Occured Contact SysAdmin");
		}
		return createProduct;
		
	}

	@Override
	public int deleteProduct(int Pr_id) throws BusinessException {
		
		
		int deleteProduct=0;
		try(Connection connection =MySqlDbConnection.getConnection())
		{
			String sql="DELETE FROM product WHERE (pr_id = ?)";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, Pr_id);
			
			
			deleteProduct=preparedStatement.executeUpdate();
			if(deleteProduct!=1)
			{
				throw new BusinessException("Product deleted Failed....Please try Again");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			log.error(e);
			throw new BusinessException("Internal Error Occured Contact SysAdmin");
		}
		
		
		return deleteProduct;
	}

	@Override
	public List<Product> getAllProducts() throws BusinessException {
        List<Product> productList =new ArrayList<>();
        Product product=new Product();
        try(Connection connection =MySqlDbConnection.getConnection()){
			//String sql="select p.pr_id,pr_name,pr_price,pt.pr_type_name from product p join product_type pt on p.pr_type_id=pt.pr_type_id where pr_id>0";
			String sql="select pr_id,pr_name,pr_price from product";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next())
			{
				
				product.setPr_id(resultSet.getInt("ProductId"));
				product.setPr_name(resultSet.getString("ProductName"));
				product.setPr_price(resultSet.getDouble("ProductPrice"));
				
				//ProductType productType=new ProductType();
				//productType.setPr_type_name(resultSet.getString("productType"));
				//product.setProductType(productType);

				
				productList.add(product);
			}
			//System.out.println(productList);
				if(productList.size()==0)
				{
					throw new BusinessException("No item is there");
				}
			
			
			//System.out.println(PlayerList);
			
			
		} catch (ClassNotFoundException | SQLException e) {
			//System.out.println();
		    throw new BusinessException("Internal Error Occured,Please contact sysadmin");
		}
		
		return productList;
		
	
	}
   /*  try(Connection connection =MySqlDbConnection.getConnection()){
    	String sql="select pr_id,pr_name,pr_price from product"; 
    	PreparedStatement preparedStatement=
    	 
     } catch (ClassNotFoundException | SQLException e) {
		
	}*/
     
    	 
     
	
	
	
	}
	
