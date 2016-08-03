package org.ahea.blindinterview.config.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
public class CategoryGroup {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Column(name = "category_group_id", length = ColumnSize.ID)
    private String id;

    @Column(name = "category_name", length = ColumnSize.NAME)
    private String categoryName;

    // TODO
    // 정확한 와이어 프레임 필요.
    //  @OneToMany(mappedBy = "categoryGroup", fetch = FetchType.LAZY)
    //  private List<CategorySharp> categorySharp = new ArrayList<>();
}
