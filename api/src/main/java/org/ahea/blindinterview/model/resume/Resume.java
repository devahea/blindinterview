package org.ahea.blindinterview.model.resume;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.ahea.blindinterview.config.ColumnSize;
import org.ahea.blindinterview.model.corpteam.CorpTeam;
import org.ahea.blindinterview.model.user.User;
import org.hibernate.annotations.GenericGenerator;

import lombok.Data;
import lombok.NoArgsConstructor;

 
@Entity
@Table
@Data
@NoArgsConstructor
public class Resume {
  @Id
  @GeneratedValue(generator = "system-uuid")
  @GenericGenerator(name = "system-uuid", strategy = "uuid")
  @Column(name = "resume_id", length = ColumnSize.ID) //??
  private String id;

  @Column(name = "user_no", length = ColumnSize.ID)
  private String userNo;
  
  @Column(name = "title", length = ColumnSize.TITLE)
  private String title;
  
  @Column(name = "content", length = ColumnSize.CONTENT)
  private String content;
  
  @Column(name = "write_data")
  @Temporal(TemporalType.TIMESTAMP)
  private Date writeData;
  
  @ManyToOne
  @JoinColumn(name = "user_no", insertable = false, updatable = false)
  private User user;
  
  @ManyToOne
  @JoinColumn(name = "team_id", insertable = false, updatable = false)
  private CorpTeam corpTeam;
}
