package top.fblue.banana.domain.file.repository;

import top.fblue.banana.domain.file.entity.FileCategoryEntity;

import java.util.List;

/**
 * 文件分类关系仓储接口
 *
 * @author banana
 */
public interface FileCategoryRepository {

    /**
     * 根据ID查询
     *
     * @param id ID
     * @return 文件分类关系实体
     */
    FileCategoryEntity findById(Integer id);

    /**
     * 根据文件ID查询
     *
     * @param fileId 文件ID
     * @return 文件分类关系列表
     */
    List<FileCategoryEntity> findByFileId(Integer fileId);

    /**
     * 根据分类ID查询
     *
     * @param categoryId 分类ID
     * @return 文件分类关系列表
     */
    List<FileCategoryEntity> findByCategoryId(Integer categoryId);

    /**
     * 保存
     *
     * @param entity 文件分类关系实体
     * @return 保存后的实体
     */
    FileCategoryEntity save(FileCategoryEntity entity);

    /**
     * 批量保存
     *
     * @param entities 文件分类关系实体列表
     */
    void saveBatch(List<FileCategoryEntity> entities);

    /**
     * 更新
     *
     * @param entity 文件分类关系实体
     * @return 更新后的实体
     */
    FileCategoryEntity update(FileCategoryEntity entity);

    /**
     * 删除
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
