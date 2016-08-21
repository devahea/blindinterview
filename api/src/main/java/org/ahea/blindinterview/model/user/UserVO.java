package org.ahea.blindinterview.model.user;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserVO {
 
  private String userId;

  private String password;

  private String name;

  private String profileImage;

}
