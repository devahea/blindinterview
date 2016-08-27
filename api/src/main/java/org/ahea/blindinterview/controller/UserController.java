package org.ahea.blindinterview.controller;

import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import io.swagger.annotations.ApiParam;

import org.ahea.blindinterview.model.user.User;
import org.ahea.blindinterview.model.user.UserRepository;
import org.ahea.blindinterview.util.FileWriter;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;


@RestController
@RequestMapping("/user")
public class UserController {
 
  private static final Logger logger = Logger.getLogger(UserController.class);

  @Autowired
  UserRepository userRepository;



  @RequestMapping(method = RequestMethod.POST, value = "login")
  public User login(@ApiParam(value = "email", required = true) String email,
      @ApiParam(value = "password", required = true) String password) throws Exception {

    return userRepository.findByEmailAndPassword(email, password);

  }


  @RequestMapping(method = RequestMethod.POST, value = "join")
  public ModelAndView join( User user, @RequestParam(value = "file") MultipartFile file, HttpServletRequest request, HttpSession session) {

    logger.info("param user - " + user);
    logger.info("param user - " + file);
    
    String fileName = FileWriter.newInstance().writeFile(file, request.getServletContext().getRealPath("/"), UUID.randomUUID().toString()+"."+
    		file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf(".") + 1) );

    user.setProfileImage(fileName);
    
    logger.info("file upload -" + fileName);
    logger.info("file upload path -" + request.getServletContext().getRealPath("/") + fileName);
    
    userRepository.save(user);
    
    session.setAttribute("user", user);
    
    return new ModelAndView("redirect:/home.do");

  }
  
  @RequestMapping(method = RequestMethod.GET, value="join.do")
  public ModelAndView userJoinView() {
	  return new ModelAndView("user/join");
  }


}
