package com.thoughtfocus.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.thoughtfocus.mvc.service.DeleteService;

@Controller
public class DeleteController {
	
	@Autowired
	private DeleteService deleteService;

	@PostMapping("/delete.do")
	public ModelAndView updateage(@RequestParam String username, @RequestParam String password, @RequestParam Long mobileno) {
		ModelAndView view = new ModelAndView();
		try {
			boolean saveStatus = deleteService.authenticateDelete(username, password, mobileno); 
			if(saveStatus) {
				view.setViewName("/home.jsp");
				view.addObject("status", "Deleted");
			} else {
				view.setViewName("/errorlog.jsp");
				view.addObject("status", "Not Deleted");
			}
			}catch (Exception e) {
			}
		return view;
	}

}

