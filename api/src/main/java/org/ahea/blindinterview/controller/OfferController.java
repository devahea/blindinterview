package org.ahea.blindinterview.controller;

import org.ahea.blindinterview.model.offer.Offer;
import org.ahea.blindinterview.model.offer.OfferRepository;
import org.ahea.blindinterview.model.vo.ResponseVO;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/offer")
public class OfferController {

  private static final Logger logger = Logger.getLogger(OfferController.class);

  @Autowired
  OfferRepository offerRepository;

  @RequestMapping(method = RequestMethod.GET)
  public String view(String offerId, Model model) {
    Offer offer = offerRepository.findOne(offerId);
    model.addAttribute("Offer", offer);
    return "";
  }
  
  @RequestMapping(method = RequestMethod.PUT)
  @ResponseBody
  public ResponseVO delete(String offerId, Model model) {
    offerRepository.delete(offerId);
    return ResponseVO.ok();
  }
  
  
//  @RequestMapping(method = RequestMethod.PUT)
//  public String update(Offer offer, Model model) {
//    Offer offer = offerRepository.findOne(offer.getid);
//    model.addAttribute("Offer", offer);
//    return "";
//  }
}
