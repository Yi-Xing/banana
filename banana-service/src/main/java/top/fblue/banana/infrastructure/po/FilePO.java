package top.fblue.banana.infrastructure.po;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;
import lombok.experimental.SuperBuilder;
import top.fblue.banana.common.enums.FileTypeEnum;
import top.fblue.framework.common.enums.StateEnum;
import top.fblue.framework.common.po.BaseAuditPo;

import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * 文件表
 *
 * @author banana
 */
@Data
@SuperBuilder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@TableName("file")
public class FilePO extends BaseAuditPo implements Serializable {

    /**
     * 名称;包含后缀
     */
    private String name;

    /**
     * 文件类型
     */
    private FileTypeEnum type;

    /**
     * 存储id;oss文件唯一标识
     */
    private String storageId;

    /**
     * 文件大小
     */
    private Integer size;

    /**
     * 字节编码;用于去重
     */
    private String md5;

    /**
     * oss表ID;关联oss.id
     */
    private Long ossId;

    /**
     * 备注
     */
    private String remark;

    /**
     * 状态;1 启用 2 禁用
     */
    private StateEnum state;

    /**
     * 删除时间;进入回收站的时间
     */
    private LocalDateTime deletedTime;
}
