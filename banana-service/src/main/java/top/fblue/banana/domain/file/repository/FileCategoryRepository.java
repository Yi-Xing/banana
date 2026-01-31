package top.fblue.banana.domain.file.repository;

import top.fblue.banana.domain.file.entity.FileCategory;

import java.util.List;

/**
 * 文件分类关系仓储接口
 *
 * @author banana
 */
public interface FileCategoryRepository {

    /** 根据ID查询 */
    FileCategory findById(Long id);

    /** 根据文件ID查询 */
    List<FileCategory> findByFileId(Long fileId);

    /** 根据分类ID查询 */
    List<FileCategory> findByCategoryId(Long categoryId);

    /** 保存 */
    FileCategory save(FileCategory entity);

    /** 批量保存 */
    void saveBatch(List<FileCategory> entities);

    /** 更新 */
    FileCategory update(FileCategory entity);

    /** 删除 */
    void delete(Long id);

    /** 根据文件ID删除 */
    void deleteByFileId(Long fileId);

    /** 根据分类ID删除 */
    void deleteByCategoryId(Long categoryId);
}
