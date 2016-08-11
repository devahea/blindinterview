package org.ahea.blindinterview.controller;

import org.ahea.blindinterview.model.advertise.AdvertiseFile;
import org.ahea.blindinterview.model.advertise.AdvertiseFileRepository;
import org.ahea.blindinterview.model.vo.ResponseVO;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/advertiseFile")
public class AdvertiseFileController {

	private static final Logger logger = Logger.getLogger(AdvertiseFileController.class);

	@Autowired
	  AdvertiseFileRepository advertiseFileRepository;

	@RequestMapping(value = "/{advertiseFileId}",method = RequestMethod.GET)
	public String view(@PathVariable String advertiseFileId, Model model) {
		AdvertiseFile advertiseFile = advertiseFileRepository.findOne(advertiseFileId);	
		model.addAttribute("AdvertiseFile",advertiseFile);
		return "advertiseFile/view";
	}


	  @RequestMapping(method = RequestMethod.PUT)
	  @ResponseBody
	  public ResponseVO delete(String advertiseFileId, Model model) {
	    advertiseFileRepository.delete(advertiseFileId);
	    return ResponseVO.ok();
	  }
}
