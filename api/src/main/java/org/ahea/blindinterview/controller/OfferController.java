package org.ahea.blindinterview.controller;

import org.ahea.blindinterview.model.offer.Offer;
import org.ahea.blindinterview.model.offer.OfferRepository;
import org.ahea.blindinterview.model.offer.OfferVO;
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
@RequestMapping("/offer")
@CommonsLog
public class OfferController {

	@Autowired
	OfferRepository offerRepository;

	@RequestMapping(value = "/{offerId}", method = RequestMethod.GET)
	public String view(@PathVariable String offerId, Model model) {
		Offer offer = offerRepository.findOne(offerId);
		model.addAttribute("Offer", offer);
		return "offer/view";
	}

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public ResponseVO create(Offer offer, Model model) {
		offerRepository.save(offer);
		return ResponseVO.ok();
	}

//	@RequestMapping(value = "/update", method = RequestMethod.POST)
//	public ResponseVO update(OfferVO offerVO, Model model) {
//		Offer offer = offerRepository.findOne(offerVO.getOfferId()); //1
//		offer.setOfferStatus(offerVO.getOfferStatus());				 //2
//		offerRepository.save(offer);								 //3
//		return ResponseVO.ok();
//	}

	@RequestMapping(value = "/{offerId}", method = RequestMethod.DELETE)
	@ResponseBody
	public ResponseVO delete(String offerId, Model model) {
		offerRepository.delete(offerId);
		return ResponseVO.ok();
	}

}
