package top.fblue.banana.domain.file.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * 文件元信息实体
 *
 * @author banana
 */
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class FileMetadataEntity {

    private Integer id;
    private Integer fileId;
    private String fileExt;
    private Integer fileSize;
    private Integer imgHeight;
    private Integer imgWidth;
    private Integer imgResolution;
    private Integer createdBy;
    private LocalDateTime createdTime;
    private Integer updatedBy;
    private LocalDateTime updatedTime;
    private Integer isDeleted;
}
