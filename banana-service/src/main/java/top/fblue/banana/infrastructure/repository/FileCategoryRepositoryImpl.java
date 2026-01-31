package top.fblue.banana.infrastructure.repository;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import org.springframework.stereotype.Repository;
import top.fblue.banana.domain.file.entity.FileCategory;
import top.fblue.banana.domain.file.repository.FileCategoryRepository;
import top.fblue.banana.infrastructure.converter.FileCategoryPOConverter;
import top.fblue.banana.infrastructure.mapper.FileCategoryMapper;
import top.fblue.banana.infrastructure.po.FileCategoryPO;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 文件分类关系仓储实现
 *
 * @author banana
 */
@Repository
public class FileCategoryRepositoryImpl implements FileCategoryRepository {

    private final FileCategoryMapper fileCategoryMapper;
    private final FileCategoryPOConverter fileCategoryPOConverter;

    public FileCategoryRepositoryImpl(FileCategoryMapper fileCategoryMapper, FileCategoryPOConverter fileCategoryPOConverter) {
        this.fileCategoryMapper = fileCategoryMapper;
        this.fileCategoryPOConverter = fileCategoryPOConverter;
    }

    @Override
    public FileCategory findById(Long id) {
        if (id == null) {
            return null;
        }
        FileCategoryPO po = fileCategoryMapper.selectById(id);
        return po == null ? null : fileCategoryPOConverter.toDomain(po);
    }

    @Override
    public List<FileCategory> findByFileId(Long fileId) {
        if (fileId == null) {
            return Collections.emptyList();
        }
        LambdaQueryWrapper<FileCategoryPO> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(FileCategoryPO::getFileId, fileId);
        return fileCategoryMapper.selectList(wrapper).stream()
                .map(fileCategoryPOConverter::toDomain)
                .collect(Collectors.toList());
    }

    @Override
    public List<FileCategory> findByCategoryId(Long categoryId) {
        if (categoryId == null) {
            return Collections.emptyList();
        }
        LambdaQueryWrapper<FileCategoryPO> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(FileCategoryPO::getCategoryId, categoryId);
        return fileCategoryMapper.selectList(wrapper).stream()
                .map(fileCategoryPOConverter::toDomain)
                .collect(Collectors.toList());
    }

    @Override
    public FileCategory save(FileCategory entity) {
        FileCategoryPO po = fileCategoryPOConverter.toPO(entity);
        fileCategoryMapper.insert(po);
        return fileCategoryPOConverter.toDomain(po);
    }

    @Override
    public void saveBatch(List<FileCategory> entities) {
        if (entities == null || entities.isEmpty()) {
            return;
        }
        for (FileCategory entity : entities) {
            fileCategoryMapper.insert(fileCategoryPOConverter.toPO(entity));
        }
    }

    @Override
    public FileCategory update(FileCategory entity) {
        if (entity == null || entity.getId() == null) {
            return entity;
        }
        FileCategoryPO po = fileCategoryPOConverter.toPO(entity);
        fileCategoryMapper.updateById(po);
        return fileCategoryPOConverter.toDomain(fileCategoryMapper.selectById(entity.getId()));
    }

    @Override
    public void delete(Long id) {
        if (id != null) {
            fileCategoryMapper.deleteById(id);
        }
    }

    @Override
    public void deleteByFileId(Long fileId) {
        if (fileId == null) {
            return;
        }
        LambdaQueryWrapper<FileCategoryPO> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(FileCategoryPO::getFileId, fileId);
        fileCategoryMapper.delete(wrapper);
    }

    @Override
    public void deleteByCategoryId(Long categoryId) {
        if (categoryId == null) {
            return;
        }
        LambdaQueryWrapper<FileCategoryPO> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(FileCategoryPO::getCategoryId, categoryId);
        fileCategoryMapper.delete(wrapper);
    }
}
