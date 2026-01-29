package top.fblue.banana.infrastructure.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import top.fblue.banana.infrastructure.po.CategoryPO;

/**
 * 分类Mapper接口
 */
@Mapper
public interface CategoryMapper extends BaseMapper<CategoryPO> {
}
