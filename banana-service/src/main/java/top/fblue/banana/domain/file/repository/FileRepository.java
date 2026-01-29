package top.fblue.banana.domain.file.repository;

import top.fblue.banana.domain.file.entity.FileEntity;

/**
 * 文件仓储接口
 *
 * @author banana
 */
public interface FileRepository {

    /**
     * 根据ID查询
     *
     * @param id ID
     * @return 文件实体
     */
    FileEntity findById(Integer id);

    /**
     * 保存
     *
     * @param entity 文件实体
     * @return 保存后的实体
     */
    FileEntity save(FileEntity entity);

    /**
     * 更新
     *
     * @param entity 文件实体
     * @return 更新后的实体
     */
    FileEntity update(FileEntity entity);

    /**
     * 删除
     *
     * @param id ID
     */
    void delete(Integer id);
}
