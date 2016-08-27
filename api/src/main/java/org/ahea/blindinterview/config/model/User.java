package org.ahea.blindinterview.config.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Deprecated
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "user_no")
  private String id;

  @Column(name = "user_name")
  private String userName;

  @Column(name = "user_token")
  private String userToken;

  @Column(name = "write_data")
  private Date writeData;

  @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
  private List<UserCategory> userCategory = new ArrayList<>();
}
