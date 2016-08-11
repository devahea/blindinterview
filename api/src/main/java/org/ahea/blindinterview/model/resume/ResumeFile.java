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
import org.hibernate.annotations.GenericGenerator;

import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table
@Data
@NoArgsConstructor
public class ResumeFile {
  
  @Id
  @GeneratedValue(generator = "system-uuid")
  @GenericGenerator(name = "system-uuid", strategy = "uuid")
  @Column(name = "resume_file_id", length = ColumnSize.ID)
  private String id;
  
  @Column(name = "resume_id", length = ColumnSize.ID)
  private String resumeNo;
  
  @Column(name = "file_type", length = ColumnSize.FILE_TYPE)
  private String fileType;
  
  @Column(name = "file_size")
  private int fileSize;
  
  @Column(name = "file_path", length = ColumnSize.FILE_PATH)
  private String filePath;
 
  @Column(name = "write_data")
  @Temporal(TemporalType.TIMESTAMP)
  private Date writeData;
}
