package top.fblue.banana.domain.file.service;

import top.fblue.banana.domain.file.entity.FileEntity;

/**
 * 文件服务接口
 *
 * @author banana
 */
public interface FileService {

    /**
     * 根据ID查询
     *
     * @param id ID
     * @return 文件实体
     */
    FileEntity getById(Integer id);

    /**
     * 创建文件
     *
     * @param entity 文件实体
     * @return 创建后的实体
     */
    FileEntity create(FileEntity entity);

    /**
     * 更新文件
     *
     * @param entity 文件实体
     * @return 更新后的实体
     */
    FileEntity update(FileEntity entity);

    /**
     * 删除文件
     *
     * @param id ID
     */
    void delete(Integer id);
}
