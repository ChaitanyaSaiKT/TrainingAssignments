package com.thoughtfocus.mvc.dao;

import com.thoughtfocus.mvc.dto.UserDTO;

public interface UserDAO {

	public boolean saveUser(UserDTO user);
	
	public boolean authenticate(String username, String password);
}
