package top.fblue.banana.domain.category.repository;

import top.fblue.banana.domain.category.entity.Category;

/**
 * 分类仓储接口
 *
 * @author banana
 */
public interface CategoryRepository {

    /** 根据ID查询 */
    Category findById(Long id);

    /** 保存 */
    Category save(Category entity);

    /** 更新 */
    Category update(Category entity);

    /** 删除 */
    void delete(Long id);
}
