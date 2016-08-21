package org.ahea.blindinterview.model.advertise;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class AdvertiseVO{ 
  private String advertiseId;
	
  private String teamCode;
  
  private String title;
  
  private String content;

  private int member;
  
  private String dateType;
  
}
