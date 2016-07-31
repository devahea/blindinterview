package org.ahea.blindinterview.config.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.ahea.blindinterview.config.ColumnSize;

import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table
@Data
@NoArgsConstructor
public class CategorySharp {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "sharp_id", length = ColumnSize.ID)
  private String id;

  @Column(name = "user_category_id", length = ColumnSize.ID)
  private String userCategoryId;

  @Column(name = "keyword", length = ColumnSize.KEYWORD)
  private String keyword;

  @ManyToOne
  @JoinColumn(name = "category_group_id", insertable = false, updatable = false)
  private CategoryGroup categoryGroup;
}
