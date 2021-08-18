package com.app.dao;

import com.app.exception.BusinessException;
import com.app.model.User;

public interface UsersDAO {
	int createUser(User user) throws BusinessException;
	public User checkUser(String Email,String Password,int Type_id ) throws BusinessException;
		

}
