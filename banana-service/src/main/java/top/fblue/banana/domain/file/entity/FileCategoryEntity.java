package top.fblue.banana.domain.file.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * 文件分类关系实体
 *
 * @author banana
 */
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class FileCategoryEntity {

    private Integer id;
    private Integer fileId;
    private Integer categoryId;
    private Integer createdBy;
    private LocalDateTime createdTime;
    private Integer updatedBy;
    private LocalDateTime updatedTime;
    private Integer isDeleted;
}
