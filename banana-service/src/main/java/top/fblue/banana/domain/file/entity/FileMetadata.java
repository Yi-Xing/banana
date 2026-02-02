package top.fblue.banana.domain.file.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import top.fblue.framework.enums.DeletedEnum;

import java.time.LocalDateTime;

/**
 * 文件元信息
 *
 * @author banana
 */
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class FileMetadata {

    private Long id;
    private Long fileId;
    private String fileExt;
    private Integer fileSize;
    private Integer imgHeight;
    private Integer imgWidth;
    private Integer imgResolution;
    private Long createdBy;
    private LocalDateTime createdTime;
    private Long updatedBy;
    private LocalDateTime updatedTime;
    private DeletedEnum isDeleted;
}
