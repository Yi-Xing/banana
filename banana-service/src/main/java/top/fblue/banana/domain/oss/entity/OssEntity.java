package top.fblue.banana.domain.oss.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * 对象存储实体
 *
 * @author banana
 */
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class OssEntity {

    private Integer id;
    private String name;
    private Integer type;
    private String code;
    private Integer state;
    private String domainName;
    private String accessKey;
    private String secretKey;
    private String remark;
    private Integer createdBy;
    private LocalDateTime createdTime;
    private Integer updatedBy;
    private LocalDateTime updatedTime;
    private Integer isDeleted;
}
