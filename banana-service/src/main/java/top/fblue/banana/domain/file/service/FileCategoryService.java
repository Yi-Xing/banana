package top.fblue.banana.domain.file.service;

import top.fblue.banana.domain.file.entity.FileCategory;

import java.util.List;

/**
 * 文件分类关系服务接口
 *
 * @author banana
 */
public interface FileCategoryService {

    /** 根据ID查询 */
    FileCategory getById(Long id);

    /** 根据文件ID查询 */
    List<FileCategory> getByFileId(Long fileId);

    /** 根据分类ID查询 */
    List<FileCategory> getByCategoryId(Long categoryId);

    /** 创建文件分类关系 */
    FileCategory create(FileCategory entity);

    /** 批量创建文件分类关系 */
    void createBatch(List<FileCategory> entities);

    /** 更新文件分类关系 */
    FileCategory update(FileCategory entity);

    /** 删除文件分类关系 */
    void delete(Long id);

    /** 根据文件ID删除 */
    void deleteByFileId(Long fileId);

    /** 根据分类ID删除 */
    void deleteByCategoryId(Long categoryId);
}
