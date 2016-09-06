package org.ahea.blindinterview.controller;

import javax.servlet.http.HttpSession;

import org.ahea.blindinterview.model.corpteam.CorpTeamRepository;
import org.ahea.blindinterview.model.corpuser.CorpUser;
import org.ahea.blindinterview.model.corpuser.CorpUserRepository;
import org.ahea.blindinterview.model.vo.ResponseVO;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/corpUser")
public class CorpUserController {

    private static final Logger logger = Logger
            .getLogger(CorpUserController.class);

    @Autowired
    CorpUserRepository corpUserRepository;

    @Autowired
    CorpTeamRepository corpTeamRepository;
    
    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String createView() {
        return "corpUser.create";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String create(CorpUser corpUser, Model model) {
        corpUser.setCorpTeam(corpTeamRepository.findOne(corpUser.getCorpTeam().getId()));
        corpUserRepository.save(corpUser);
        return "redirect:list";
    }
    
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public String list(Model model) {
        return "advertise.list";
    }

    @RequestMapping(method = RequestMethod.GET, value = "join.do")
    public ModelAndView userJoinView() {
        return new ModelAndView("corp/join");
    }

    @RequestMapping(method = RequestMethod.POST, value = "join")
    public ModelAndView join(CorpUser user, HttpSession session) {

        logger.info("param user - " + user);

        session.setAttribute("user", user);

        return new ModelAndView("redirect:/home.do");

    }

    @RequestMapping(value = "/view", method = RequestMethod.GET)
    public String view(String corpUserId, Model model) {
        logger.info("view called..");
        CorpUser corpUser = corpUserRepository.findOne(corpUserId);
        model.addAttribute("corpUser", corpUser);
        return "corpUser.view";
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String update(CorpUser corpUser, Model model) {
        CorpUser updatecorpUser = corpUserRepository.findOne(corpUser.getId());
        corpUserRepository.save(updatecorpUser);
        model.addAttribute("corpUser", corpUser);
        return "redirect:view?corpUserId=" + corpUser.getId();
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    @ResponseBody
    public ResponseVO delete(String corpUserId, Model model) {
        corpUserRepository.delete(corpUserId);
        return ResponseVO.ok();
    }
}
