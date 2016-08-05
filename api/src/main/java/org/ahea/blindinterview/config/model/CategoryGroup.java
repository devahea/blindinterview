package org.ahea.blindinterview.config.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

import org.ahea.blindinterview.config.ColumnSize;


//@Entity
//@Table
@Data
@NoArgsConstructor
public class CategoryGroup {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "category_group_id", length = ColumnSize.ID)
  private String id;

  @Column(name = "category_name", length = ColumnSize.NAME)
  private String categoryName;

  // TODO
// 정확한 와이어 프레임 필요.
//  @OneToMany(mappedBy = "categoryGroup", fetch = FetchType.LAZY)
//  private List<CategorySharp> categorySharp = new ArrayList<>();
}
