package org.ahea.blindinterview.model.advertise;

import java.util.ArrayList;
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
  @Column(name = "advertise_no")
  private String id;
  
  @Column(name = "title")
  private String title;
  
  @Column(name = "content")
  private String content;

  @OneToMany(mappedBy = "advertise", fetch = FetchType.LAZY)
  private List<Offer> offer = new ArrayList<>();
  
  @ManyToOne
  @JoinColumn(name = "team_id", insertable = false, updatable = false)
  private CorpTeam CorpTeam;
}
