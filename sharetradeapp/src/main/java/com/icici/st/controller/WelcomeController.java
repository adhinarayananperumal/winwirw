package com.icici.st.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WelcomeController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	 public String showHome(Model model) {
	  model.addAttribute("message", "This is my first MVC page");
	  return "welcome";
	 }

}
