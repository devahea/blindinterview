package org.ahea.blindinterview.controller;

import org.ahea.blindinterview.model.advertise.Advertise;
import org.ahea.blindinterview.model.advertise.AdvertiseRepository;
import org.ahea.blindinterview.model.offer.Offer;
import org.ahea.blindinterview.model.offer.OfferRepository;
import org.ahea.blindinterview.model.user.UserRepository;
import org.ahea.blindinterview.model.vo.ResponseVO;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/offer")

public class OfferController {

    private static final Logger logger = Logger.getLogger(OfferController.class);

    @Autowired
    OfferRepository offerRepository;

    @Autowired
    AdvertiseRepository advertiseRepository;

    @Autowired
    UserRepository userRepository;

    @RequestMapping(value="/create", method=RequestMethod.GET)
    public String createView(String advertiseId, Model model) {
        Advertise advertise= advertiseRepository.findOne(advertiseId);
        model.addAttribute("advertise", advertise);
        return "advertise.create";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String create(Offer offer, Model model) {
        // TODO uesr id 받아서 채용공고에서 내려줘야함. 일단 하드코딩
        //     현재 접속한 userId를 받아올수 있는것이 필요함. 
        String userId = "a2c99f82156fdd76a0156fdd8300b0000";
        offer.setUser(userRepository.findOne(userId));
        offer.setAdvertise(advertiseRepository.findOne(offer.getAdvertise().getId()));
        offerRepository.save(offer);
        model.addAttribute("offer", offer);
        return "view";
    }

    @RequestMapping(value = "/view", method = RequestMethod.GET)
    public String view(String offerId, Model model) {
        logger.info("view called..");
        Offer offer = offerRepository.findOne(offerId);
        model.addAttribute("offer", offer);
        return "offer/view";
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String update(Offer offer, Model model) {
        Offer updateoffer = offerRepository.findOne(offer.getId());
        offerRepository.save(updateoffer);
        model.addAttribute("offer", offer);
        return "redirect:offer/view?offerId=" + offer.getId();
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    @ResponseBody
    public ResponseVO delete(String offerId, Model model) {
        offerRepository.delete(offerId);
        return ResponseVO.ok();
    }

}
