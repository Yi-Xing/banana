package top.fblue.banana.infrastructure.converter;

import org.springframework.stereotype.Component;
import top.fblue.banana.domain.file.entity.FileMetadata;
import top.fblue.banana.infrastructure.po.FileMetadataPO;

/**
 * 文件元信息PO与Domain实体转换器
 *
 * @author banana
 */
@Component
public class FileMetadataPOConverter {

    /**
     * PO转换为Domain实体
     */
    public FileMetadata toDomain(FileMetadataPO po) {
        if (po == null) {
            return null;
        }
        return FileMetadata.builder()
                .id(po.getId())
                .fileId(po.getFileId())
                .fileExt(po.getFileExt())
                .fileSize(po.getFileSize())
                .imgHeight(po.getImgHeight())
                .imgWidth(po.getImgWidth())
                .imgResolution(po.getImgResolution())
                .createdBy(po.getCreatedBy())
                .createdTime(po.getCreatedTime())
                .updatedBy(po.getUpdatedBy())
                .updatedTime(po.getUpdatedTime())
                .isDeleted(po.getIsDeleted())
                .build();
    }

    /**
     * Domain实体转换为PO
     */
    public FileMetadataPO toPO(FileMetadata domain) {
        if (domain == null) {
            return null;
        }
        // 不设置 createdBy/createdTime/updatedBy/updatedTime，由 MyBatis-Plus 自动填充
        return FileMetadataPO.builder()
                .id(domain.getId())
                .fileId(domain.getFileId())
                .fileExt(domain.getFileExt())
                .fileSize(domain.getFileSize())
                .imgHeight(domain.getImgHeight())
                .imgWidth(domain.getImgWidth())
                .imgResolution(domain.getImgResolution())
                .isDeleted(domain.getIsDeleted())
                .build();
    }
}
