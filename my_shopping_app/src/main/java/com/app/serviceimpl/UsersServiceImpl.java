package com.app.serviceimpl;

import com.app.dao.UsersDAO;
import com.app.daoimpl.UsersDAOImpl;
import com.app.exception.BusinessException;
import com.app.model.User;
import com.app.service.UsersService;

public class UsersServiceImpl implements UsersService {
	UsersDAO usersDAO = new UsersDAOImpl();

	@Override
	public int createUser(User user) throws BusinessException {
		int createUser = 0;
		createUser = usersDAO.createUser(user);

		return createUser;
	}



	@Override
	public boolean checkUser(String Email, String Password,int type_id) throws BusinessException {
		
		//User user=null;

		boolean user=usersDAO.checkUser( Email, Password,type_id);
		
		return user;
	}

	
}
