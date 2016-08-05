package org.ahea.blindinterview.model.advertise;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.ahea.blindinterview.model.user.User;
import org.hibernate.annotations.GenericGenerator;

import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table
@Data
@NoArgsConstructor
public class AdvertiseFile {
  @Id
  @GeneratedValue(generator = "system-uuid")
  @GenericGenerator(name = "system-uuid", strategy = "uuid")
  @Column(name = "advertise_file_no")
  private String id;

  @Column(name = "user_no")
  private String userNo;

  @Column(name = "summery_no")
  private String summeryNo;
  
  @Column(name = "answer")
  private String answer;

  @ManyToOne
  @JoinColumn(name = "user_no", insertable = false, updatable = false)
  private User user;
}
