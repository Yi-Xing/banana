package top.fblue.banana.infrastructure.repository;

import org.springframework.stereotype.Repository;
import top.fblue.banana.domain.category.entity.Category;
import top.fblue.banana.domain.category.repository.CategoryRepository;
import top.fblue.banana.infrastructure.converter.CategoryPOConverter;
import top.fblue.banana.infrastructure.mapper.CategoryMapper;
import top.fblue.banana.infrastructure.po.CategoryPO;

/**
 * 分类仓储实现
 *
 * @author banana
 */
@Repository
public class CategoryRepositoryImpl implements CategoryRepository {

    private final CategoryMapper categoryMapper;
    private final CategoryPOConverter categoryPOConverter;

    public CategoryRepositoryImpl(CategoryMapper categoryMapper, CategoryPOConverter categoryPOConverter) {
        this.categoryMapper = categoryMapper;
        this.categoryPOConverter = categoryPOConverter;
    }

    @Override
    public Category findById(Long id) {
        if (id == null) {
            return null;
        }
        CategoryPO po = categoryMapper.selectById(id);
        return po == null ? null : categoryPOConverter.toDomain(po);
    }

    @Override
    public Category save(Category entity) {
        CategoryPO po = categoryPOConverter.toPO(entity);
        categoryMapper.insert(po);
        return categoryPOConverter.toDomain(po);
    }

    @Override
    public Category update(Category entity) {
        if (entity == null || entity.getId() == null) {
            return entity;
        }
        CategoryPO po = categoryPOConverter.toPO(entity);
        categoryMapper.updateById(po);
        return categoryPOConverter.toDomain(categoryMapper.selectById(entity.getId()));
    }

    @Override
    public void delete(Long id) {
        if (id != null) {
            categoryMapper.deleteById(id);
        }
    }
}
