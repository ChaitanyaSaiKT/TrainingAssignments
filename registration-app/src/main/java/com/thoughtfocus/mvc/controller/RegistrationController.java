package com.thoughtfocus.mvc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.thoughtfocus.mvc.dto.UserDTO;
import com.thoughtfocus.mvc.service.RegistrationService;

@Controller
public class RegistrationController {
	
	
	Logger logger = LoggerFactory.getLogger(RegistrationController.class);
	
	@Autowired
	private RegistrationService registrationService;

	public RegistrationController() {
		logger.info(this.getClass().getSimpleName()+" obj created");
	}
	
	@PostMapping("/reg.do")
	public ModelAndView registerUser(UserDTO user) {
		ModelAndView view = new ModelAndView();
		try {
		boolean saveStatus = registrationService.validateAndSaveUser(user);
		if(saveStatus) {
			view.setViewName("/success.jsp");
			view.addObject("status", "Registration Successfull");
		} else {
			view.setViewName("/error.jsp");
			view.addObject("status", "Registration Failed as password and confirm password doesnt match");
		}
		}
		catch (Exception e) {
		}
		return view;
	}
}

