package com.thoughtfocus.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.thoughtfocus.mvc.service.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	private LoginService loginService;

	@PostMapping("/login.do")
	public ModelAndView loginUser(@RequestParam String username, @RequestParam String password) {
		ModelAndView view = new ModelAndView();
		try {
		boolean saveStatus = loginService.authenticateUser(username, password);
		if(saveStatus) {
			view.setViewName("/home.jsp");
			view.addObject("status", "Welcome to home page");
		} else {
			view.setViewName("/errorlog.jsp");
			view.addObject("status", "couldnt find user please register");
		}
		}catch (Exception e) {
		}
		return view;
	}
}
