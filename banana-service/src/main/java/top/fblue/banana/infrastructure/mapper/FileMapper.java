package top.fblue.banana.infrastructure.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import top.fblue.banana.infrastructure.po.FilePO;

/**
 * 文件Mapper接口
 */
@Mapper
public interface FileMapper extends BaseMapper<FilePO> {
}
