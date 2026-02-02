package top.fblue.banana.application.converter;

import org.springframework.stereotype.Component;
import top.fblue.banana.application.dto.OssAddDTO;
import top.fblue.banana.application.vo.OssVO;
import top.fblue.banana.domain.oss.entity.Oss;

/**
 * OSS 应用层转换器：Domain 与 DTO/VO 互转
 *
 * @author banana
 */
@Component
public class OssConverter {

    /**
     * Domain 转 VO（出参）
     */
    public OssVO toVO(Oss domain) {
        if (domain == null) {
            return null;
        }
        return OssVO.builder()
                .id(domain.getId())
                .name(domain.getName())
                .type(domain.getType())
                .code(domain.getCode())
                .state(domain.getState())
                .domainName(domain.getDomainName())
                .accessKey(domain.getAccessKey())
                .secretKey(domain.getSecretKey())
                .remark(domain.getRemark())
                .createdTime(domain.getCreatedTime())
                .updatedTime(domain.getUpdatedTime())
                .build();
    }

    /**
     * 新增 DTO 转 Domain（入参转领域实体，用于创建）
     */
    public Oss toDomain(OssAddDTO dto) {
        if (dto == null) {
            return null;
        }
        return Oss.builder()
                .name(dto.getName())
                .type(dto.getType())
                .code(dto.getCode())
                .state(dto.getState())
                .domainName(dto.getDomainName())
                .accessKey(dto.getAccessKey())
                .secretKey(dto.getSecretKey())
                .remark(dto.getRemark())
                .build();
    }
}
