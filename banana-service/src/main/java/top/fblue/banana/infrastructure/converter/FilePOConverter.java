package top.fblue.banana.infrastructure.converter;

import org.springframework.stereotype.Component;
import top.fblue.banana.common.enums.FileTypeEnum;
import top.fblue.banana.domain.file.entity.File;
import top.fblue.banana.infrastructure.po.FilePO;

/**
 * 文件PO与Domain实体转换器
 *
 * @author banana
 */
@Component
public class FilePOConverter {

    /**
     * PO转换为Domain实体
     */
    public File toDomain(FilePO po) {
        if (po == null) {
            return null;
        }
        return File.builder()
                .id(po.getId())
                .name(po.getName())
                .type(po.getType())
                .storageId(po.getStorageId())
                .size(po.getSize())
                .md5(po.getMd5())
                .ossId(po.getOssId())
                .remark(po.getRemark())
                .state(po.getState())
                .deletedTime(po.getDeletedTime())
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
    public FilePO toPO(File domain) {
        if (domain == null) {
            return null;
        }
        // 不设置 createdBy/createdTime/updatedBy/updatedTime，由 MyBatis-Plus 自动填充
        return FilePO.builder()
                .id(domain.getId())
                .name(domain.getName())
                .type(domain.getType() != null ? domain.getType() : FileTypeEnum.OTHER)
                .storageId(domain.getStorageId())
                .size(domain.getSize())
                .md5(domain.getMd5())
                .ossId(domain.getOssId())
                .remark(domain.getRemark())
                .state(domain.getState())
                .deletedTime(domain.getDeletedTime())
                .isDeleted(domain.getIsDeleted())
                .build();
    }
}
