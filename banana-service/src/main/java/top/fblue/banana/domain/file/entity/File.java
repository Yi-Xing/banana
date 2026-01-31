package top.fblue.banana.domain.file.entity;

import lombok.*;

import java.time.LocalDateTime;

/**
 * 文件
 *
 * @author banana
 */
@Data
@Builder(toBuilder = true)
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
public class File {

    private Long id;
    private String name;
    private String storageId;
    private Integer size;
    private String md5;
    private String ossId;
    private String remark;
    private Integer state;
    private LocalDateTime deletedTime;
    private Long createdBy;
    private LocalDateTime createdTime;
    private Long updatedBy;
    private LocalDateTime updatedTime;
    private Integer isDeleted;
}
