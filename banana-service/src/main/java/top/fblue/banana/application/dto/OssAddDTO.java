package top.fblue.banana.application.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import top.fblue.framework.enums.StateEnum;

/**
 * 新增 OSS 请求入参
 *
 * @author banana
 */
@Data
public class OssAddDTO {

    /** 名称；2~10个字符 */
    @NotBlank(message = "名称不能为空")
    @Size(min = 2, max = 10, message = "名称长度为2~10个字符")
    private String name;

    /** OSS类型；1 阿里云，2 千牛云 */
    @NotNull(message = "OSS类型不能为空")
    @Min(value = 1, message = "OSS类型为1或2")
    @Max(value = 2, message = "OSS类型为1或2")
    private Integer type;

    /** 唯一标识；1~100字符 */
    @NotBlank(message = "code不能为空")
    @Size(min = 1, max = 100, message = "code长度为1~100个字符")
    private String code;

    /** 状态 */
    @NotNull(message = "状态不能为空")
    private StateEnum state;

    /** 域名；0~100字符 */
    @NotBlank(message = "域名不能为空")
    @Size(max = 100, message = "域名长度不超过100个字符")
    private String domainName;

    /** 公钥；0~100字符 */
    @NotBlank(message = "公钥不能为空")
    @Size(max = 100, message = "公钥长度不超过100个字符")
    private String accessKey;

    /** 秘钥；0~100字符 */
    @NotBlank(message = "秘钥不能为空")
    @Size(max = 100, message = "秘钥长度不超过100个字符")
    private String secretKey;

    /** 备注；0~500字符，非必填 */
    @Size(max = 500, message = "备注长度不超过500个字符")
    private String remark;
}
