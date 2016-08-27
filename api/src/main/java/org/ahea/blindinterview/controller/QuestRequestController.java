package org.ahea.blindinterview.controller;


import org.ahea.blindinterview.model.questrequest.QuestRequest;
import org.ahea.blindinterview.model.questrequest.QuestRequestRepository;
import org.ahea.blindinterview.model.vo.ResponseVO;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.apachecommons.CommonsLog;

@Controller
@RequestMapping("/questRequest")
@CommonsLog
public class QuestRequestController {
	
	private static final Logger logger = Logger
			.getLogger(QuestRequestController.class);

	@Autowired
	QuestRequestRepository questRequestRepository;

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public String create(QuestRequest questRequest, Model model) {
		questRequestRepository.save(questRequest);
		model.addAttribute("questRequest", questRequest);
		return "redirect:questRequest/view?questRequestId=" + questRequest.getId();
	}
	
	@RequestMapping(value = "/view", method = RequestMethod.GET)
	public String view(String questRequestId, Model model) {
		logger.info("view called..");
		QuestRequest questRequest = questRequestRepository.findOne(questRequestId);
		model.addAttribute("questRequest", questRequest);
		return "questRequest/view";
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(QuestRequest questRequest, Model model) {
		QuestRequest updatequestRequest = questRequestRepository.findOne(questRequest.getId()); 
		questRequestRepository.save(updatequestRequest);		
		model.addAttribute("questRequest", questRequest);
		return "redirect:questRequest/view?questRequestId=" + questRequest.getId();
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.DELETE)
	@ResponseBody
	public ResponseVO delete(String questRequestId, Model model) {
		questRequestRepository.delete(questRequestId);
		return ResponseVO.ok();
	}

}
