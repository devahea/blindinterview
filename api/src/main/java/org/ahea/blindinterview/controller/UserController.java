package org.ahea.blindinterview.controller;

import org.ahea.blindinterview.model.user.User;
import org.ahea.blindinterview.model.user.UserRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;


@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "*")
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
  public void join(@ApiParam(value = "email") String email, @ApiParam(value = "이름") String name,
      @ApiParam(value = "패스워드") String password) {

    logger.info("email " + email);

    userRepository.save(new User(email, name, password));

  }


}
