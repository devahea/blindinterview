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
public class SummeryAnswer {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "summery_answer_no")
  private String id;

  @Column(name = "user_no")
  private String userNo;

  @Column(name = "summery_no")
  private String summeryNo;
  
  @Column(name = "answer")
  private String answer;

}
