package org.ahea.blindinterview.controller;


import org.ahea.blindinterview.model.corpteam.CorpTeam;
import org.ahea.blindinterview.model.corpteam.CorpTeamRepository;
import org.ahea.blindinterview.model.vo.ResponseVO;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.apachecommons.CommonsLog;

@Controller
@RequestMapping("/corpTeam")
@CommonsLog
public class CorpTeamController {
	
	private static final Logger logger = Logger
			.getLogger(CorpTeamController.class);

	@Autowired
	CorpTeamRepository corpTeamRepository;

	@RequestMapping(value = "/view", method = RequestMethod.GET)
	public String view(String corpteamId, Model model) {
		logger.info("view called..");
		CorpTeam corpteam = corpTeamRepository.findOne(corpteamId);
		model.addAttribute("corpteam", corpteam);
		return "corpteam/view";
	}

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public String create(CorpTeam corpteam, Model model) {
		corpTeamRepository.save(corpteam);
		model.addAttribute("corpteam", corpteam);
		return "redirect:corpteam/view?corpteamId=" + corpteam.getId();
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(CorpTeam corpteam, Model model) {
		CorpTeam updatecorpteam = corpTeamRepository.findOne(corpteam.getId()); 
		corpTeamRepository.save(updatecorpteam);		
		model.addAttribute("corpteam", corpteam);
		return "redirect:corpteam/view?corpteamId=" + corpteam.getId();
	}

	@RequestMapping(value = "/delete", method = RequestMethod.DELETE)
	@ResponseBody
	public ResponseVO delete(String corpteamId, Model model) {
		corpTeamRepository.delete(corpteamId);
		return ResponseVO.ok();
	}
	
	
}
