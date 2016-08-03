package org.ahea.blindinterview.config.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@NoArgsConstructor
public class SummeryAnswer {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Column(name = "summery_answer_no")
    private String id;

    @Column(name = "user_no")
    private String userNo;

    @Column(name = "summery_no")
    private String summeryNo;

    @Column(name = "answer")
    private String answer;

}
