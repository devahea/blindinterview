package org.ahea.blindinterview.controller;

import org.ahea.blindinterview.model.corpteam.CorpTeam;
import org.ahea.blindinterview.model.corpteam.CorpTeamRepository;
import org.ahea.blindinterview.model.vo.ResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.apachecommons.CommonsLog;

@Controller
@RequestMapping("/corpTeam")
@CommonsLog
public class CorpTeamController {

	@Autowired
	CorpTeamRepository corpTeamRepository;

	@RequestMapping(value = "/{CorpTeamId}", method = RequestMethod.GET)
	public String view(@PathVariable String CorpTeamId, Model model) {
		CorpTeam corpTeam = corpTeamRepository.findOne(CorpTeamId);
		
		model.addAttribute("CorpTeam", corpTeam);
		return "corpTeam/view";
	}

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public ResponseVO create(CorpTeam corpTeam, Model model) {
		corpTeamRepository.save(corpTeam);
		return ResponseVO.ok();
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public ResponseVO update(CorpTeam corpTeam, Model model) {
		CorpTeam updateCorpTeam = corpTeamRepository.findOne(corpTeam.getId()); 
		corpTeamRepository.save(updateCorpTeam);								
		return ResponseVO.ok();
	}

	@RequestMapping(value = "/{CorpTeamId}", method = RequestMethod.DELETE)
	@ResponseBody
	public ResponseVO delete(String corpTeamId, Model model) {
		corpTeamRepository.delete(corpTeamId);
		return ResponseVO.ok();
	}

}
