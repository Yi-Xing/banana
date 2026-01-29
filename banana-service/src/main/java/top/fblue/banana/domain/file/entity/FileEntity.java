package top.fblue.banana.domain.file.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * 文件实体
 *
 * @author banana
 */
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class FileEntity {

    private Integer id;
    private String name;
    private String storageId;
    private Integer size;
    private String md5;
    private String ossId;
    private String remark;
    private Integer state;
    private LocalDateTime deletedTime;
    private Integer createdBy;
    private LocalDateTime createdTime;
    private Integer updatedBy;
    private LocalDateTime updatedTime;
    private Integer isDeleted;
}
