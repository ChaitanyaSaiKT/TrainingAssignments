package com.thoughtfocus.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thoughtfocus.mvc.dao.UserDAO;
import com.thoughtfocus.mvc.dto.UserDTO;

@Service
public class RegistrationServiceImpl implements RegistrationService {

	@Autowired
	private UserDAO dao;
	
	@Override
	public boolean validateAndSaveUser(UserDTO dto) {
		try {
			if(dto.getPassword().equals(dto.getConfirmpassword())) {
				return dao.saveUser(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
			
		
		return false;
		
	}

}
