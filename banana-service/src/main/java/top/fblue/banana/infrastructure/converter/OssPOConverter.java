package top.fblue.banana.infrastructure.converter;

import org.springframework.stereotype.Component;
import top.fblue.banana.domain.oss.entity.Oss;
import top.fblue.banana.infrastructure.po.OssPO;

/**
 * 对象存储PO与Domain实体转换器
 *
 * @author banana
 */
@Component
public class OssPOConverter {

    /**
     * PO转换为Domain实体
     */
    public Oss toDomain(OssPO po) {
        if (po == null) {
            return null;
        }
        return Oss.builder()
                .id(po.getId())
                .name(po.getName())
                .type(po.getType())
                .code(po.getCode())
                .state(po.getState())
                .domainName(po.getDomainName())
                .accessKey(po.getAccessKey())
                .secretKey(po.getSecretKey())
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
    public OssPO toPO(Oss domain) {
        if (domain == null) {
            return null;
        }
        // 不设置 createdBy/createdTime/updatedBy/updatedTime，由 MyBatis-Plus 自动填充
        return OssPO.builder()
                .id(domain.getId())
                .name(domain.getName())
                .type(domain.getType())
                .code(domain.getCode())
                .state(domain.getState())
                .domainName(domain.getDomainName())
                .accessKey(domain.getAccessKey())
                .secretKey(domain.getSecretKey())
                .remark(domain.getRemark())
                .isDeleted(domain.getIsDeleted())
                .build();
    }
}
