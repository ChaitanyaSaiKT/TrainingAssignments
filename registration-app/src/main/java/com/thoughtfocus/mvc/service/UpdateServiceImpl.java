package com.thoughtfocus.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thoughtfocus.mvc.dao.UserDAO;

@Service
public class UpdateServiceImpl implements UpdateService {
	
	@Autowired
	private UserDAO dao;

	@Override
	public boolean authenticateUpdate(String username, double age) {
		try {
			if(username != null ) {
				return dao.update(username, age);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	

}

	