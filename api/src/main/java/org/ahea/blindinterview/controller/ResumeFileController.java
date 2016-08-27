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

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public String create(ResumeFile resumeFile, Model model) {
		resumeFileRepository.save(resumeFile);
		model.addAttribute("resumeFile", resumeFile);
		return "redirect:resumeFile/view?resumeFileId=" + resumeFile.getId();
	}
	
	@RequestMapping(value = "/view", method = RequestMethod.GET)
	public String view(String resumeFileId, Model model) {
		logger.info("view called..");
		ResumeFile resumeFile = resumeFileRepository.findOne(resumeFileId);
		model.addAttribute("resumeFile", resumeFile);
		return "resumeFile/view";
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(ResumeFile resumeFile, Model model) {
		ResumeFile updateresumeFile = resumeFileRepository.findOne(resumeFile.getId()); 
		resumeFileRepository.save(updateresumeFile);		
		model.addAttribute("resumeFile", resumeFile);
		return "redirect:resumeFile/view?resumeFileId=" + resumeFile.getId();
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.DELETE)
	@ResponseBody
	public ResponseVO delete(String resumeFileId, Model model) {
		resumeFileRepository.delete(resumeFileId);
		return ResponseVO.ok();
	}
}