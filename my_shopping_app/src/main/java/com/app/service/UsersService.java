package com.app.service;

//import java.util.List;

import com.app.exception.BusinessException;
import com.app.model.User;

public interface UsersService {
	
      public int createUser(User user) throws BusinessException;
      public boolean checkUser(String Email,String Password ,int type_id) throws BusinessException;
	
	
	

}
