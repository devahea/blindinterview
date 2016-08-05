package org.ahea.blindinterview.model.resume;

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
  @Column(name = "resume_no")
  private String id;

  @Column(name = "user_no")
  private String userNo;
  
  @Column(name = "title")
  private String title;
  
  @Column(name = "content")
  private String content;
  
  @Column(name = "write_data")
  private Date writeData;
  
  @ManyToOne
  @JoinColumn(name = "user_no", insertable = false, updatable = false)
  private User user;
  
  @OneToMany(mappedBy = "resume", fetch = FetchType.LAZY)
  private List<ResumeFile> resumeFile = new ArrayList<>();
  
}
