package org.ahea.blindinterview.model.advertise;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.ahea.blindinterview.config.ColumnSize;
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
  @Column(name = "advertise_file_no", length = ColumnSize.ID)
  private String id;

  @Column(name = "advertise_no", length = ColumnSize.ID)
  private String advertiseNo;

  @Column(name = "file_type", length = ColumnSize.ADV_FILE_TYPE)
  private String fileType;
  
  @Column(name = "file_size", length = ColumnSize.ADV_FILE_SIZE)
  private String fileSize;
  
  @Column(name = "file_path", length = ColumnSize.ADV_FILE_PATH)
  private String filePath;
  
  @Column(name = "write_data")
  @Temporal(TemporalType.TIMESTAMP)
  private Date writeData;
 
  
  
  @ManyToOne
  @JoinColumn(name = "user_no", insertable = false, updatable = false)
  private User user;
}
