package org.ahea.blindinterview.model.corpuser;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.ahea.blindinterview.config.ColumnSize;
import org.ahea.blindinterview.model.corpteam.CorpTeam;
import org.hibernate.annotations.GenericGenerator;

import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table
@Data
@NoArgsConstructor
public class CorpUser {
  @Id
  @GeneratedValue(generator = "system-uuid")
  @GenericGenerator(name = "system-uuid", strategy = "uuid")
  @Column(name = "corp_user_id", length = ColumnSize.ID)
  private String id;

  @Column(name = "email", length = ColumnSize.NAME)
  private String email;
  
  @Column(name = "password", length = ColumnSize.NAME)
  private String password;
  
  @Column(name = "name", length = ColumnSize.NAME)
  private String name;
  
  @Column(name = "write_data")
  private Date writeData;
  
  @ManyToOne
  @JoinColumn(name = "corp_team_id")
  private CorpTeam corpTeam;

}
