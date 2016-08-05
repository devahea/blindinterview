package org.ahea.blindinterview.model.user;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;
import lombok.NoArgsConstructor;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table
@Data
public class User {

	public User(){}
	
	
	
	public User(String email, String password, String name) {
		super();
		this.email = email;
		this.password = password;
		this.name = name;
	}



	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid")
	@Column(name = "user_no")
	private String userNo;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "profile_path")
	private String profileImage;
	
	@Column(name = "write_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date writeDate;

}
