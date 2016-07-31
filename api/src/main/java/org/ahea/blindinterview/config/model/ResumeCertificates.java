package org.ahea.blindinterview.config.model;

import java.util.Date;

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
public class ResumeCertificates {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "certificate_id")
  private String id;

  @Column(name = "resumeId")
  private String resume_id;
  
  @Column(name = "certificates_title")
  private String certificates_title;
  
  @Column(name = "certificates_date")
  private Date certificates_date;
  
}
