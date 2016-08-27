package org.ahea.blindinterview.controller;


import org.ahea.blindinterview.model.offer.Offer;
import org.ahea.blindinterview.model.offer.OfferRepository;
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
@RequestMapping("/offer")

public class OfferController {
	
	private static final Logger logger = Logger
			.getLogger(OfferController.class);

	@Autowired
	OfferRepository offerRepository;

	

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public String create(Offer offer, Model model) {
		offerRepository.save(offer);
		model.addAttribute("offer", offer);
		return "redirect:offer/view?offerId=" + offer.getId();
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
