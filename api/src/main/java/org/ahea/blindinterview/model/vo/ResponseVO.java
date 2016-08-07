package org.ahea.blindinterview.model.vo;

import org.ahea.blindinterview.config.ReturnCodes;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseVO{
  private String retCode;
  
  public ResponseVO(String retCode) {
    this.retCode = retCode;
  }
  
  public static ResponseVO ok() {
    return new ResponseVO(ReturnCodes.OK);
  }
}
