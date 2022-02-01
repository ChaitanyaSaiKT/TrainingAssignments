package com.thoughtfocus.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thoughtfocus.mvc.dao.UserDAO;

@Service
public class LoginServiceImpl implements LoginService{

	@Autowired
	private UserDAO dao;
	
	@Override
	public boolean authenticateUser(String username, String password) {
		try {
			if(username != null  && password!= null) {
				return dao.authenticate(username, password);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	

}
