package org.ahea.blindinterview.config.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Deprecated
public class UserInfo {
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "user_no")
  private String id;

  @Column(name = "user_desc")
  private String userDesc;

  @Column(name = "profile_src")
  private String profileSrc;

}
