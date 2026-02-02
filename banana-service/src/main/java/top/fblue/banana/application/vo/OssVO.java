package top.fblue.banana.application.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import top.fblue.framework.enums.StateEnum;

import java.time.LocalDateTime;

/**
 * OSS 基本信息出参
 *
 * @author banana
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OssVO {

    private Long id;
    private String name;
    private Integer type;
    private String code;
    private StateEnum state;
    private String domainName;
    private String accessKey;
    private String secretKey;
    private String remark;
    private LocalDateTime createdTime;
    private LocalDateTime updatedTime;
}
