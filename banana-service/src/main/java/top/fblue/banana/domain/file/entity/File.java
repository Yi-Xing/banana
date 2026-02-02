package top.fblue.banana.domain.file.entity;

import lombok.*;
import top.fblue.banana.common.enums.FileTypeEnum;
import top.fblue.framework.common.enums.DeletedEnum;
import top.fblue.framework.common.enums.StateEnum;

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
    private FileTypeEnum type;
    private String storageId;
    private Integer size;
    private String md5;
    private Long ossId;
    private String remark;
    private StateEnum state;
    private LocalDateTime deletedTime;
    private Long createdBy;
    private LocalDateTime createdTime;
    private Long updatedBy;
    private LocalDateTime updatedTime;
    private DeletedEnum isDeleted;
}
