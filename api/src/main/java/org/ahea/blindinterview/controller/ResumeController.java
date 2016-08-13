package org.ahea.blindinterview.controller;

import org.ahea.blindinterview.model.resume.Resume;
import org.ahea.blindinterview.model.resume.ResumeRepository;
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
@RequestMapping("/resume")
public class ResumeController {

	private static final Logger logger = Logger.getLogger(ResumeController.class);
 
	@Autowired
	  ResumeRepository resumeRepository;

	@RequestMapping(value = "/{resumeId}",method = RequestMethod.GET)
	public String view(@PathVariable String resumeId, Model model) {
		Resume resume = resumeRepository.findOne(resumeId);	
		model.addAttribute("Resume",resume);
		return "resume/view";
	}


	  @RequestMapping(method = RequestMethod.PUT)
	  @ResponseBody
	  public ResponseVO delete(String resumeId, Model model) {
	    resumeRepository.delete(resumeId);
	    return ResponseVO.ok();
	  }
}
