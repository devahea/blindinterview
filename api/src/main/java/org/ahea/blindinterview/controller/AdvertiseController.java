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

	private static final Logger logger = Logger
			.getLogger(AdvertiseController.class);

	@Autowired
	AdvertiseRepository advertiseRepository;
	
	@RequestMapping(value="/create", method=RequestMethod.GET)
	public String createView() {
		return "advertise.create";
	}

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public String create(Advertise advertise, Model model) {
		advertiseRepository.save(advertise);
		model.addAttribute("Advertise", advertise);
		return "advertise.list";
	}
	
	@RequestMapping(value = "/list",method = RequestMethod.GET)
	public String list(Model model) {
		model.addAttribute("list", advertiseRepository.findAll());
		return "advertise.list";
	}
	
	@RequestMapping(value = "/view", method = RequestMethod.GET)
	public String view(String advertiseId, Model model) {
		logger.info("view called..");
		Advertise advertise = advertiseRepository.findOne(advertiseId);
		model.addAttribute("advertise", advertise);
		return "advertise.view";
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(Advertise advertise, Model model) {
		Advertise updateAdvertise = advertiseRepository.findOne(advertise.getId()); 
		advertiseRepository.save(updateAdvertise);		
		model.addAttribute("advertise", advertise);
		return "redirect:advertise.view?advertiseId=" + advertise.getId();
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.DELETE)
	@ResponseBody
	public ResponseVO delete(String advertiseId, Model model) {
		advertiseRepository.delete(advertiseId);
		return ResponseVO.ok();
	}
}