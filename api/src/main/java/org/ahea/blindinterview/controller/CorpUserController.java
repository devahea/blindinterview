package org.ahea.blindinterview.controller;

import javax.servlet.http.HttpSession;

import org.ahea.blindinterview.model.corpuser.CorpUser;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/corp")
public class CorpUserController {

	  private static final Logger logger = Logger.getLogger(CorpUserController.class);

	  @RequestMapping(method = RequestMethod.GET, value="join.do")
	  public ModelAndView userJoinView() {
		  return new ModelAndView("corp/join");
	  }

	  
	  @RequestMapping(method = RequestMethod.POST, value = "join")
	  public ModelAndView join(CorpUser user, HttpSession session) {

	    logger.info("param user - " + user);
	    
	    session.setAttribute("user", user);
	    
	    return new ModelAndView("redirect:/home.do");

	  }
	
}
