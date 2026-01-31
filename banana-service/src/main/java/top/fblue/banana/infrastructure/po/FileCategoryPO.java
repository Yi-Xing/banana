package top.fblue.banana.infrastructure.po;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import top.fblue.framework.po.BaseAuditPo;

import java.io.Serializable;

/**
 * 文件分类关系表
 *
 * @author banana
 */
@Data
@SuperBuilder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@TableName("file_category")
public class FileCategoryPO extends BaseAuditPo implements Serializable {

    /**
     * 文件ID
     */
    private Long fileId;

    /**
     * 分类ID
     */
    private Long categoryId;
}
