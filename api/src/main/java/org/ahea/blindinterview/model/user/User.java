package org.ahea.blindinterview.model.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.ahea.blindinterview.config.ColumnSize;
import org.ahea.blindinterview.model.offer.Offer;
import org.ahea.blindinterview.model.resume.Resume;
import org.ahea.blindinterview.model.vo.GenericUser;
import org.ahea.blindinterview.security.LoginType;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.usertype.UserType;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@NoArgsConstructor
public class User extends GenericUser {
 
  @Id
  @GeneratedValue(generator = "system-uuid")
  @GenericGenerator(name = "system-uuid", strategy = "uuid")
  @Column(name = "user_no", length = ColumnSize.ID)
  private String userNo;

  @Column(name = "email", length = ColumnSize.EMAIL)
  private String email;

  @Column(name = "password", length = ColumnSize.KEYWORD)
  private String password;

  @Column(name = "name", length = ColumnSize.NAME)
  private String name;

  @Column(name = "profile_path", length = ColumnSize.PROFILE_PATH)
  private String profileImage;

  @Column(name = "write_date")
  @Temporal(TemporalType.TIMESTAMP)
  private Date writeDate;

  @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
  private List<Resume> resume = new ArrayList<>();
  
  @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
  private List<Offer> offer = new ArrayList<>();
  
  public User(String email, String password, String name) {
    super();
    this.email = email;
    this.password = password;
    this.name = name;
    super.setLoginType(LoginType.USER);
  }
}
