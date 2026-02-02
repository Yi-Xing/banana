package top.fblue.banana.infrastructure.po;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import top.fblue.framework.enums.StateEnum;
import top.fblue.framework.po.BaseAuditPo;

import java.io.Serializable;

/**
 * 对象存储表
 *
 * @author banana
 */
@Data
@SuperBuilder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@TableName("oss")
public class OssPO extends BaseAuditPo implements Serializable {

    /**
     * 名称
     */
    private String name;

    /**
     * 类型;1 阿里云 2 千牛云
     */
    private Integer type;

    /**
     * code
     */
    private String code;

    /**
     * 状态;1 启用 2 禁用
     */
    private StateEnum state;

    /**
     * 域名
     */
    private String domainName;

    /**
     * 公钥
     */
    private String accessKey;

    /**
     * 秘钥
     */
    private String secretKey;

    /**
     * 备注
     */
    private String remark;
}
