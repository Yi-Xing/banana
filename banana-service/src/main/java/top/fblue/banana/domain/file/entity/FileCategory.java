package top.fblue.banana.domain.file.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import top.fblue.framework.common.enums.DeletedEnum;

import java.time.LocalDateTime;

/**
 * 文件分类关系
 *
 * @author banana
 */
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class FileCategory {

    private Long id;
    private Long fileId;
    private Long categoryId;
    private Long createdBy;
    private LocalDateTime createdTime;
    private Long updatedBy;
    private LocalDateTime updatedTime;
    private DeletedEnum isDeleted;
}
