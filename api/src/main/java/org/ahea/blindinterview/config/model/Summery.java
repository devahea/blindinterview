package org.ahea.blindinterview.config.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;


@Deprecated
public class Summery {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "user_no")
  private String id;

  @Column(name = "summery_no")
  private String summery_no;

  @Column(name = "title")
  private String title;

}
