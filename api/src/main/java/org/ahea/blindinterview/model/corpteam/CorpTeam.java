package org.ahea.blindinterview.model.corpteam;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.ahea.blindinterview.config.ColumnSize;
import org.ahea.blindinterview.model.resume.Resume;

import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table
@Data
@NoArgsConstructor
public class CorpTeam {
  @Id
  @Column(name = "team_id", length = ColumnSize.ID)
  private String id;

  @Column(name = "password")
  private String password;
  
  @Column(name = "team_name", length = ColumnSize.NAME)
  private String teamName;

  @Column(name = "team_serial_no", length = ColumnSize.NAME)
  private String teamSerialNo;

  @Column(name = "team_desc", length = ColumnSize.NAME)
  private String teamDesc;

  @OneToMany(mappedBy = "corpTeam", fetch = FetchType.LAZY)
  private List<Resume> resume = new ArrayList<>();

}
