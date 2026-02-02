package top.fblue.banana.domain.category.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import top.fblue.framework.common.enums.DeletedEnum;
import top.fblue.framework.common.enums.StateEnum;

import java.time.LocalDateTime;

/**
 * 分类
 *
 * @author banana
 */
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class Category {

    private Long id;
    private String name;
    private String code;
    private Integer orderNum;
    private StateEnum state;
    private String remark;
    private Long createdBy;
    private LocalDateTime createdTime;
    private Long updatedBy;
    private LocalDateTime updatedTime;
    private DeletedEnum isDeleted;
}
