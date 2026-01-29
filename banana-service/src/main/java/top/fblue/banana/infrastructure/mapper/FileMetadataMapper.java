package top.fblue.banana.infrastructure.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import top.fblue.banana.infrastructure.po.FileMetadataPO;

/**
 * 文件元信息Mapper接口
 */
@Mapper
public interface FileMetadataMapper extends BaseMapper<FileMetadataPO> {
}
