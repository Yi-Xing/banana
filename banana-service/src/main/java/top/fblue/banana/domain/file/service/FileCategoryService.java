package top.fblue.banana.domain.file.service;

import top.fblue.banana.domain.file.entity.FileCategoryEntity;

import java.util.List;

/**
 * 文件分类关系服务接口
 *
 * @author banana
 */
public interface FileCategoryService {

    /**
     * 根据ID查询
     *
     * @param id ID
     * @return 文件分类关系实体
     */
    FileCategoryEntity getById(Integer id);

    /**
     * 根据文件ID查询
     *
     * @param fileId 文件ID
     * @return 文件分类关系列表
     */
    List<FileCategoryEntity> getByFileId(Integer fileId);

    /**
     * 根据分类ID查询
     *
     * @param categoryId 分类ID
     * @return 文件分类关系列表
     */
    List<FileCategoryEntity> getByCategoryId(Integer categoryId);

    /**
     * 创建文件分类关系
     *
     * @param entity 文件分类关系实体
     * @return 创建后的实体
     */
    FileCategoryEntity create(FileCategoryEntity entity);

    /**
     * 批量创建文件分类关系
     *
     * @param entities 文件分类关系实体列表
     */
    void createBatch(List<FileCategoryEntity> entities);

    /**
     * 更新文件分类关系
     *
     * @param entity 文件分类关系实体
     * @return 更新后的实体
     */
    FileCategoryEntity update(FileCategoryEntity entity);

    /**
     * 删除文件分类关系
     *
     * @param id ID
     */
    void delete(Integer id);

    /**
     * 根据文件ID删除
     *
     * @param fileId 文件ID
     */
    void deleteByFileId(Integer fileId);

    /**
     * 根据分类ID删除
     *
     * @param categoryId 分类ID
     */
    void deleteByCategoryId(Integer categoryId);
}
