package com.thoughtfocus.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thoughtfocus.mvc.dao.UserDAO;

@Service
public class DeleteServiceImpl implements DeleteService {

	@Autowired
	private UserDAO dao;
	
	@Override
	public boolean authenticateDelete(String username, String password, Long mobileno) {
		try {
			if(username != null && password != null && mobileno != null) {
				return dao.delete(username, password, mobileno);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}
