package org.ahea.blindinterview.model.advertise;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.ahea.blindinterview.config.ColumnSize;
import org.ahea.blindinterview.model.corpteam.CorpTeam;
import org.ahea.blindinterview.model.offer.Offer;
import org.hibernate.annotations.GenericGenerator;

import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table
@Data
@NoArgsConstructor
public class Advertise{ 
  @Id
  @GeneratedValue(generator = "system-uuid")
  @GenericGenerator(name = "system-uuid", strategy = "uuid")
  @Column(name = "advertise_no", length = ColumnSize.ID)
  private String id;
  
  @Column(name = "team_code", length = ColumnSize.ID)
  private String teamCode;
  
  @Column(name = "title", length = ColumnSize.TITLE)
  private String title;
  
  @Column(name = "content", length = ColumnSize.CONTENT)
  private String content;

  @Column(name = "member")
  private int member;
  
  
  @Column(name = "date_type", length = ColumnSize.DATE_TYPE)
  private String dateType;
  
  @Column(name = "start_date")
  @Temporal(TemporalType.TIMESTAMP)
  private Date startDate;
  
  @Column(name = "end_date")
  @Temporal(TemporalType.TIMESTAMP)
  private Date endDate;
  
  @Column(name = "write_date")
  @Temporal(TemporalType.TIMESTAMP)
  private Date writeDate;
    
  //advertise클래스 ERD에는 writedate 속성이 2개이다. why??
  
  @OneToMany(mappedBy = "advertise", fetch = FetchType.LAZY)
  private List<Offer> offer = new ArrayList<>();
  
  @ManyToOne
  @JoinColumn(name = "team_id", insertable = false, updatable = false)
  private CorpTeam CorpTeam;
}
