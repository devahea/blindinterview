package org.ahea.blindinterview.controller;

import org.ahea.blindinterview.security.LoginType;
import org.ahea.blindinterview.security.UseType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(method=RequestMethod.GET, value="login.do")
	public String loginView(){
		return "login";
	}
	
	@UseType({LoginType.USER, LoginType.COMPANY})
	@RequestMapping(method=RequestMethod.GET, value="home.do")
	public ModelAndView home() {
		return new ModelAndView("home/home");
	}
	
}
