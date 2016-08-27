package org.ahea.blindinterview.controller;

import org.ahea.blindinterview.model.advertise.AdvertiseFile;
import org.ahea.blindinterview.model.advertise.AdvertiseFileRepository;
import org.ahea.blindinterview.model.vo.ResponseVO;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/advertiseFile")

public class AdvertiseFileController {
	
	

	private static final Logger logger = Logger.getLogger(AdvertiseFileController.class);

	@Autowired
	  AdvertiseFileRepository advertiseFileRepository;
	

	@RequestMapping(value = "/view", method = RequestMethod.GET)
	public String view(String advertiseFileId, Model model) {
		logger.info("view called..");
		AdvertiseFile advertiseFile = advertiseFileRepository.findOne(advertiseFileId);
		model.addAttribute("advertiseFile", advertiseFile);
		return "advertiseFile/view";
	}


	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public String create(AdvertiseFile advertiseFile, Model model) {
		advertiseFileRepository.save(advertiseFile);
		model.addAttribute("advertiseFile", advertiseFile);
		return "redirect:advertiseFile/view?advertiseFileId=" + advertiseFile.getId();
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(AdvertiseFile advertiseFile, Model model) {
		AdvertiseFile updateadvertiseFile = advertiseFileRepository.findOne(advertiseFile.getId()); 
		advertiseFileRepository.save(updateadvertiseFile);		
		model.addAttribute("advertiseFile", advertiseFile);
		return "redirect:advertiseFile/view?advertiseFileId=" + advertiseFile.getId();
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.DELETE)
	@ResponseBody
	public ResponseVO delete(String advertiseFileId, Model model) {
		advertiseFileRepository.delete(advertiseFileId);
		return ResponseVO.ok();
	}
}
