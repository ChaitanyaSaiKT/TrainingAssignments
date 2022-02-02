package com.thoughtfocus.mvc.dao;

import com.thoughtfocus.mvc.dto.UserDTO;

public interface UserDAO {

	public boolean saveUser(UserDTO user);
	
	public boolean authenticate(String username, String password);
	
	public boolean update(String username, double age);
	
	public boolean delete(String username, String password, Long mobileno);
}
