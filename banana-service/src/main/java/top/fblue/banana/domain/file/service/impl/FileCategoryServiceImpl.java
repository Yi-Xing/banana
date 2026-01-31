package top.fblue.banana.domain.file.service.impl;

import org.springframework.stereotype.Service;
import top.fblue.banana.domain.file.entity.FileCategory;
import top.fblue.banana.domain.file.repository.FileCategoryRepository;
import top.fblue.banana.domain.file.service.FileCategoryService;

import java.util.List;

/**
 * 文件分类关系服务实现
 *
 * @author banana
 */
@Service
public class FileCategoryServiceImpl implements FileCategoryService {

    private final FileCategoryRepository fileCategoryRepository;

    public FileCategoryServiceImpl(FileCategoryRepository fileCategoryRepository) {
        this.fileCategoryRepository = fileCategoryRepository;
    }

    @Override
    public FileCategory getById(Long id) {
        return fileCategoryRepository.findById(id);
    }

    @Override
    public List<FileCategory> getByFileId(Long fileId) {
        return fileCategoryRepository.findByFileId(fileId);
    }

    @Override
    public List<FileCategory> getByCategoryId(Long categoryId) {
        return fileCategoryRepository.findByCategoryId(categoryId);
    }

    @Override
    public FileCategory create(FileCategory entity) {
        return fileCategoryRepository.save(entity);
    }

    @Override
    public void createBatch(List<FileCategory> entities) {
        fileCategoryRepository.saveBatch(entities);
    }

    @Override
    public FileCategory update(FileCategory entity) {
        return fileCategoryRepository.update(entity);
    }

    @Override
    public void delete(Long id) {
        fileCategoryRepository.delete(id);
    }

    @Override
    public void deleteByFileId(Long fileId) {
        fileCategoryRepository.deleteByFileId(fileId);
    }

    @Override
    public void deleteByCategoryId(Long categoryId) {
        fileCategoryRepository.deleteByCategoryId(categoryId);
    }
}
