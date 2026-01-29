package top.fblue.banana.infrastructure.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import top.fblue.banana.infrastructure.po.OssPO;

/**
 * 对象存储Mapper接口
 */
@Mapper
public interface OssMapper extends BaseMapper<OssPO> {
}
