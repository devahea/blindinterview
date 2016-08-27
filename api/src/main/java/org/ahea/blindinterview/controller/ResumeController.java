package org.ahea.blindinterview.controller;


import org.ahea.blindinterview.model.resume.Resume;
import org.ahea.blindinterview.model.resume.ResumeRepository;
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
@RequestMapping("/resume")
public class ResumeController {

	private static final Logger logger = Logger.getLogger(ResumeController.class);
 
	@Autowired ResumeRepository resumeRepository;

	

	@RequestMapping(value = "/list",method = RequestMethod.GET)
	public String list() {
		return "resume/list";
	}
	@RequestMapping(value = "/create",method = RequestMethod.GET)
	public String createView() {
		return "resume/create";
	}



	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public String create(Resume resume, Model model) {
		resumeRepository.save(resume);
		model.addAttribute("resume", resume);
		return "redirect:resume/view?resumeId=" + resume.getId();
	}
	
	@RequestMapping(value = "/view", method = RequestMethod.GET)
	public String view(String resumeId, Model model) {
		logger.info("view called..");
		Resume resume = resumeRepository.findOne(resumeId);
		model.addAttribute("resume", resume);
		return "resume/view";
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(Resume resume, Model model) {
		Resume updateresume = resumeRepository.findOne(resume.getId()); 
		resumeRepository.save(updateresume);		
		model.addAttribute("resume", resume);
		return "redirect:resume/view?resumeId=" + resume.getId();
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.DELETE)
	@ResponseBody
	public ResponseVO delete(String resumeId, Model model) {
		resumeRepository.delete(resumeId);
		return ResponseVO.ok();
	}
}
