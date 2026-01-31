package top.fblue.banana.infrastructure.converter;

import org.springframework.stereotype.Component;
import top.fblue.banana.domain.file.entity.FileCategory;
import top.fblue.banana.infrastructure.po.FileCategoryPO;

/**
 * 文件分类关系PO与Domain实体转换器
 *
 * @author banana
 */
@Component
public class FileCategoryPOConverter {

    /**
     * PO转换为Domain实体
     */
    public FileCategory toDomain(FileCategoryPO po) {
        if (po == null) {
            return null;
        }
        return FileCategory.builder()
                .id(po.getId())
                .fileId(po.getFileId())
                .categoryId(po.getCategoryId())
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
    public FileCategoryPO toPO(FileCategory domain) {
        if (domain == null) {
            return null;
        }
        // 不设置 createdBy/createdTime/updatedBy/updatedTime，由 MyBatis-Plus 自动填充
        return FileCategoryPO.builder()
                .id(domain.getId())
                .fileId(domain.getFileId())
                .categoryId(domain.getCategoryId())
                .isDeleted(domain.getIsDeleted())
                .build();
    }
}
