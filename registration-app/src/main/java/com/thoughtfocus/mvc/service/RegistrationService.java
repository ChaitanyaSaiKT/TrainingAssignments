package com.thoughtfocus.mvc.service;

import com.thoughtfocus.mvc.dto.UserDTO;

public interface RegistrationService {
	
	public boolean validateAndSaveUser(UserDTO dto);

}
