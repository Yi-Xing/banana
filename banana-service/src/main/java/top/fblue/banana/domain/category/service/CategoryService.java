package top.fblue.banana.domain.category.service;

import top.fblue.banana.domain.category.entity.Category;

/**
 * 分类服务接口
 *
 * @author banana
 */
public interface CategoryService {

    /** 根据ID查询 */
    Category getById(Long id);

    /** 创建分类 */
    Category create(Category entity);

    /** 更新分类 */
    Category update(Category entity);

    /** 删除分类 */
    void delete(Long id);
}
