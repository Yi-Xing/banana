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
 * 分类表
 *
 * @author banana
 */
@Data
@SuperBuilder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@TableName("category")
public class CategoryPO extends BaseAuditPo implements Serializable {

    /**
     * 名称
     */
    private String name;

    /**
     * code
     */
    private String code;

    /**
     * 显示顺序
     */
    private Integer orderNum;

    /**
     * 状态;1 启用 2 禁用
     */
    private StateEnum state;

    /**
     * 备注
     */
    private String remark;
}
