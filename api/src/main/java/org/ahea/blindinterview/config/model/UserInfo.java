package org.ahea.blindinterview.config.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

public class UserInfo {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Column(name = "user_no")
    private String id;

    @Column(name = "user_desc")
    private String userDesc;

    @Column(name = "profile_src")
    private String profileSrc;

}
