package org.ahea.blindinterview.controller;

import org.ahea.blindinterview.model.advertise.Advertise;
import org.ahea.blindinterview.model.advertise.AdvertiseRepository;
import org.ahea.blindinterview.model.resume.ResumeFile;
import org.ahea.blindinterview.model.resume.ResumeFileRepository;
import org.ahea.blindinterview.model.user.User;
import org.ahea.blindinterview.model.user.UserRepository;
import org.ahea.blindinterview.model.vo.ResponseVO;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
 
 
@RestController
@RequestMapping("/advertise")
public class AdvertiseController {

	private static final Logger logger = Logger.getLogger(AdvertiseController.class);

	@Autowired
	  AdvertiseRepository advertiseRepository;

	@RequestMapping(value = "/{advertiseId}",method = RequestMethod.GET)
	public String view(@PathVariable String advertiseId, Model model) {
		Advertise advertise = advertiseRepository.findOne(advertiseId);	
		model.addAttribute("Advertise",advertise);
		return "advertise/view";
	}


	  @RequestMapping(method = RequestMethod.PUT)
	  @ResponseBody
	  public ResponseVO delete(String advertiseId, Model model) {
	    advertiseRepository.delete(advertiseId);
	    return ResponseVO.ok();
	  }
}