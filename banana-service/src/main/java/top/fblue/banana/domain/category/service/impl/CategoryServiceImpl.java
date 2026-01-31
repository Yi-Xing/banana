package top.fblue.banana.domain.category.service.impl;

import org.springframework.stereotype.Service;
import top.fblue.banana.domain.category.entity.Category;
import top.fblue.banana.domain.category.repository.CategoryRepository;
import top.fblue.banana.domain.category.service.CategoryService;

/**
 * 分类服务实现
 *
 * @author banana
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Category getById(Long id) {
        return categoryRepository.findById(id);
    }

    @Override
    public Category create(Category entity) {
        return categoryRepository.save(entity);
    }

    @Override
    public Category update(Category entity) {
        return categoryRepository.update(entity);
    }

    @Override
    public void delete(Long id) {
        categoryRepository.delete(id);
    }
}
