package top.fblue.banana.infrastructure.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import top.fblue.banana.infrastructure.po.FileCategoryPO;

/**
 * 文件分类关系Mapper接口
 */
@Mapper
public interface FileCategoryMapper extends BaseMapper<FileCategoryPO> {
}
