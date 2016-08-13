package org.ahea.blindinterview.controller;


import org.ahea.blindinterview.model.resume.ResumeFile;
import org.ahea.blindinterview.model.resume.ResumeFileRepository;
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
@RequestMapping("/resumeFile")
public class ResumeFileController {
 
	private static final Logger logger = Logger.getLogger(ResumeFileController.class);

	@Autowired
	  ResumeFileRepository resumeFileRepository;

	@RequestMapping(value = "/{resumeFileId}",method = RequestMethod.GET)
	public String view(@PathVariable String resumeFileId, Model model) {
		ResumeFile resumeFile = resumeFileRepository.findOne(resumeFileId);	
		model.addAttribute("ResumeFile",resumeFile);
		return "resumeFile/view";
	}


	  @RequestMapping(method = RequestMethod.PUT)
	  @ResponseBody
	  public ResponseVO delete(String resumeFileId, Model model) {
	    resumeFileRepository.delete(resumeFileId);
	    return ResponseVO.ok();
	  }
}