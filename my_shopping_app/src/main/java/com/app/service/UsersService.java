package com.app.service;

//import java.util.List;

import com.app.exception.BusinessException;
import com.app.model.User;

public interface UsersService {
	
  public 	int createUser(User user) throws BusinessException;
    public User checkUser(String Email,String Password ,int type_id) throws BusinessException;
	
	
	

}