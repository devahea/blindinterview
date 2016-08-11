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
import org.springframework.web.bind.annotation.RestController;


@Controller
@RequestMapping("/offer")
public class OfferController {

  private static final Logger logger = Logger.getLogger(OfferController.class);

  @Autowired
  OfferRepository offerRepository;

  @RequestMapping(value = "/{offerId}",method = RequestMethod.GET)//1.매핑될 URL규칙을 적어주고 또는  @PathVariable어노테이션과 매핑될거를 작성해준다(예:{offerId}), 리퀘스트 형식을 적어준다 RequestMethod.GET, RequestMethod.POST 등이 있다.
  public String view(@PathVariable String offerId, Model model) {//2. 메서드 반환타입은 String, 메서드이름은 처리결과에 맞게 작성하고 메서드 파라미터에는 @PathVariable 반환타입 파라미터명형식으로 작성하고 리퀘스트로 받을 파라미터를 적어준다. Model model은 jsp에 데이터를 실어 보낼때 사용하게됨.
    Offer offer = offerRepository.findOne(offerId); //3. offerRepository는 실제 마리아DB Offer 테이블과 매핑되어 있음 여기선 offerID를 가지고 offer를 가져옴
    model.addAttribute("Offer", offer); // 4. jsp 에 해당 데이터를 Offer라는 이름으로 내보낸다.
    return "offer/view"; // 5. src/main/webapp/WEB-INF/jsp/ 이하 디렉토리와 jsp파일명(확장자x)을 적어주면 그부분으로 해당 데이터를 jsp에 싫어서 내보낸다.
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
