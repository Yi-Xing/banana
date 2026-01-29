package top.fblue.banana.domain.category.repository;

import top.fblue.banana.domain.category.entity.CategoryEntity;

/**
 * 分类仓储接口
 *
 * @author banana
 */
public interface CategoryRepository {

    /**
     * 根据ID查询
     *
     * @param id ID
     * @return 分类实体
     */
    CategoryEntity findById(Integer id);

    /**
     * 保存
     *
     * @param entity 分类实体
     * @return 保存后的实体
     */
    CategoryEntity save(CategoryEntity entity);

    /**
     * 更新
     *
     * @param entity 分类实体
     * @return 更新后的实体
     */
    CategoryEntity update(CategoryEntity entity);

    /**
     * 删除
     *
     * @param id ID
     */
    void delete(Integer id);
}
