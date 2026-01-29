package top.fblue.banana.domain.category.service;

import top.fblue.banana.domain.category.entity.CategoryEntity;

/**
 * 分类服务接口
 *
 * @author banana
 */
public interface CategoryService {

    /**
     * 根据ID查询
     *
     * @param id ID
     * @return 分类实体
     */
    CategoryEntity getById(Integer id);

    /**
     * 创建分类
     *
     * @param entity 分类实体
     * @return 创建后的实体
     */
    CategoryEntity create(CategoryEntity entity);

    /**
     * 更新分类
     *
     * @param entity 分类实体
     * @return 更新后的实体
     */
    CategoryEntity update(CategoryEntity entity);

    /**
     * 删除分类
     *
     * @param id ID
     */
    void delete(Integer id);
}
