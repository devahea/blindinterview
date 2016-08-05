package org.ahea.blindinterview.model.offer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.ahea.blindinterview.config.ColumnSize;
import org.ahea.blindinterview.model.advertise.Advertise;
import org.ahea.blindinterview.model.user.User;
import org.hibernate.annotations.GenericGenerator;

import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table
@Data
@NoArgsConstructor
public class Offer {
  @Id
  @GeneratedValue(generator = "system-uuid")
  @GenericGenerator(name = "system-uuid", strategy = "uuid")
  @Column(name = "offer_no", length = ColumnSize.ID)
  private String id;

  @Column(name = "offer_status")
  private String offerStatus;
  
  @ManyToOne
  @JoinColumn(name = "advertise_no", insertable = false, updatable = false)
  private Advertise advertise;

  @ManyToOne
  @JoinColumn(name = "user_no", insertable = false, updatable = false)
  private User user;

}
