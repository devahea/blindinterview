package org.ahea.blindinterview.config.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table
@Data
@NoArgsConstructor
public class ResumeRelation {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "resume_relation_id")
  private String id;

}
