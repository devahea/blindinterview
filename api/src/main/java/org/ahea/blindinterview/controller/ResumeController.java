package org.ahea.blindinterview.controller;

import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.ahea.blindinterview.model.resume.Resume;
import org.ahea.blindinterview.model.resume.ResumeFile;
import org.ahea.blindinterview.model.resume.ResumeFileRepository;
import org.ahea.blindinterview.model.resume.ResumeRepository;
import org.ahea.blindinterview.util.FileWriter;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/resume")
public class ResumeController {

    private static final Logger logger = Logger.getLogger(ResumeController.class);

    @Autowired
    ResumeRepository resumeRepository;

    @Autowired
    ResumeFileRepository resumeFileRepository;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("list", resumeRepository.findAll());
        return "resume.list";
    }

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String createView() {
        return "resume.create";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String create(Resume resume, @RequestParam(value = "file") MultipartFile file, HttpServletRequest request) {

        logger.info("resume - " + resume);

        //resume save 
        resumeRepository.save(resume);

        logger.info("resume save - " + resume);

        //resumeFile param setting
        String fileName = FileWriter.newInstance().writeFile(file, request.getServletContext().getRealPath("/"),
                UUID.randomUUID().toString() + "."
                        + file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf(".") + 1));

        ResumeFile resumeFile = new ResumeFile();

        resumeFile.setResumeNo(resume.getId());

        resumeFile.setFilePath(fileName);

        //resumeFile save		
        resumeFileRepository.save(resumeFile);

        logger.info("resumeFile save - " + resumeFile);

        return "redirect:resume.list";
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public String delete(String resumeId, Model model) {
        resumeRepository.delete(resumeId);
        return "redirect:resume.list";
    }

    @RequestMapping(value = "/view", method = RequestMethod.GET)
    public String view(String resumeId, Model model) {
        logger.info("view called..");
        Resume resume = resumeRepository.findOne(resumeId);
        model.addAttribute("resume", resume);
        return "resume.view";
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String update(Resume resume, Model model) {
        Resume updateresume = resumeRepository.findOne(resume.getId());
        resumeRepository.save(updateresume);
        model.addAttribute("resume", resume);
        return "redirect:resume.view";
    }

}
