package top.fblue.banana.infrastructure.converter;

import org.springframework.stereotype.Component;
import top.fblue.banana.domain.category.entity.Category;
import top.fblue.banana.infrastructure.po.CategoryPO;

/**
 * 分类PO与Domain实体转换器
 *
 * @author banana
 */
@Component
public class CategoryPOConverter {

    /**
     * PO转换为Domain实体
     */
    public Category toDomain(CategoryPO po) {
        if (po == null) {
            return null;
        }
        return Category.builder()
                .id(po.getId())
                .name(po.getName())
                .code(po.getCode())
                .orderNum(po.getOrderNum())
                .state(po.getState())
                .remark(po.getRemark())
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
    public CategoryPO toPO(Category domain) {
        if (domain == null) {
            return null;
        }
        // 不设置 createdBy/createdTime/updatedBy/updatedTime，由 MyBatis-Plus 自动填充
        return CategoryPO.builder()
                .id(domain.getId())
                .name(domain.getName())
                .code(domain.getCode())
                .orderNum(domain.getOrderNum())
                .state(domain.getState())
                .remark(domain.getRemark())
                .isDeleted(domain.getIsDeleted())
                .build();
    }
}
