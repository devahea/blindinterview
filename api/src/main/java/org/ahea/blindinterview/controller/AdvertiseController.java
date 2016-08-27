package org.ahea.blindinterview.controller;

import org.ahea.blindinterview.model.advertise.Advertise;
import org.ahea.blindinterview.model.advertise.AdvertiseRepository;
import org.ahea.blindinterview.model.vo.ResponseVO;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
 
 
@Controller
@RequestMapping("/advertise")
public class AdvertiseController {

	private static final Logger logger = Logger.getLogger(AdvertiseController.class);

	@Autowired
	  AdvertiseRepository advertiseRepository;

	@RequestMapping(value = "/{advertiseId}",method = RequestMethod.GET)
	public String view(@PathVariable String advertiseId, Model model) {
		
		logger.info("view called..");
		
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