package top.fblue.banana.infrastructure.po;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import top.fblue.framework.common.po.BaseAuditPo;

import java.io.Serializable;

/**
 * 文件元信息表
 *
 * @author banana
 */
@Data
@SuperBuilder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@TableName("file_metadata")
public class FileMetadataPO extends BaseAuditPo implements Serializable {

    /**
     * 文件ID
     */
    private Long fileId;

    /**
     * 文件扩展名;小写
     */
    private String fileExt;

    /**
     * 文件大小
     */
    private Integer fileSize;

    /**
     * 图片高度（px）
     */
    private Integer imgHeight;

    /**
     * 图片宽度（px）
     */
    private Integer imgWidth;

    /**
     * 分辨率
     */
    private Integer imgResolution;
}
