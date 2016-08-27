package org.ahea.blindinterview.controller;

import org.ahea.blindinterview.model.questrequest.QuestRequest;
import org.ahea.blindinterview.model.questrequest.QuestRequestRepository;
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
@RequestMapping("/questRequest")
@CommonsLog
public class QuestRequestController {

	@Autowired
	QuestRequestRepository questRequestRepository;

	@RequestMapping(value = "/{questRequestId}", method = RequestMethod.GET)
	public String view(@PathVariable String questRequestId, Model model) {
		QuestRequest questRequest = questRequestRepository.findOne(questRequestId);
		model.addAttribute("questRequest", questRequest);
		return "questRequest/view";
	}

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public ResponseVO create(QuestRequest questRequest, Model model) {
		questRequestRepository.save(questRequest);
		return ResponseVO.ok();
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public ResponseVO update(QuestRequest questRequest, Model model) {
		QuestRequest updatequestRequest = questRequestRepository.findOne(questRequest.getId()); 
		questRequestRepository.save(updatequestRequest);								
		return ResponseVO.ok();
	}

	@RequestMapping(value = "/{questRequestId}", method = RequestMethod.DELETE)
	@ResponseBody
	public ResponseVO delete(String questRequestId, Model model) {
		questRequestRepository.delete(questRequestId);
		return ResponseVO.ok();
	}

}
