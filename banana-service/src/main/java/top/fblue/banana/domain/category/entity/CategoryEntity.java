package top.fblue.banana.domain.category.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * 分类实体
 *
 * @author banana
 */
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class CategoryEntity {

    private Integer id;
    private String name;
    private String code;
    private Integer orderNum;
    private Integer state;
    private String remark;
    private Integer createdBy;
    private LocalDateTime createdTime;
    private Integer updatedBy;
    private LocalDateTime updatedTime;
    private Integer isDeleted;
}
