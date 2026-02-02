package top.fblue.banana.domain.oss.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import top.fblue.framework.enums.DeletedEnum;
import top.fblue.framework.enums.StateEnum;

import java.time.LocalDateTime;

/**
 * 对象存储
 *
 * @author banana
 */
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class Oss {

    private Long id;
    private String name;
    private Integer type;
    private String code;
    private StateEnum state;
    private String domainName;
    private String accessKey;
    private String secretKey;
    private String remark;
    private Long createdBy;
    private LocalDateTime createdTime;
    private Long updatedBy;
    private LocalDateTime updatedTime;
    private DeletedEnum isDeleted;
}
