package org.ahea.blindinterview.config.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.ahea.blindinterview.config.ColumnSize;
import org.hibernate.annotations.GenericGenerator;

import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table
@Data
@NoArgsConstructor
public class CategorySharp {
  @Id
  @GeneratedValue(generator = "system-uuid")
  @GenericGenerator(name = "system-uuid", strategy = "uuid")
  @Column(name = "sharp_id", length = ColumnSize.ID)
  private String id;

  @Column(name = "user_category_id", length = ColumnSize.ID)
  private String userCategoryId;

  @Column(name = "keyword", length = ColumnSize.KEYWORD)
  private String keyword;

//  @ManyToOne
//  @JoinColumn(name = "category_group_id", insertable = false, updatable = false)
//  private CategoryGroup categoryGroup;
}
