package org.ahea.blindinterview.model.offer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

import org.ahea.blindinterview.config.ColumnSize;
import org.ahea.blindinterview.model.advertise.Advertise;
import org.ahea.blindinterview.model.user.User;
import org.ahea.blindinterview.model.vo.GenericUser;
import org.ahea.blindinterview.security.LoginType;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table
@Data
public class Offer  {
	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid")
	@Column(name = "offer_no", length = ColumnSize.ID)
	private String id;

	@Column(name = "offer_status")
	private String offerStatus;

	@ManyToOne(optional = false)
	@JoinColumn(name = "advertise_no")
	private Advertise advertise;

	@ManyToOne(optional = false)
	@JoinColumn(name = "user_no")
	private User user;

}
