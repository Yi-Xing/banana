package top.fblue.banana.domain.file.service;

import top.fblue.banana.domain.file.entity.FileMetadataEntity;

/**
 * 文件元信息服务接口
 *
 * @author banana
 */
public interface FileMetadataService {

    /**
     * 根据ID查询
     *
     * @param id ID
     * @return 文件元信息实体
     */
    FileMetadataEntity getById(Integer id);

    /**
     * 根据文件ID查询
     *
     * @param fileId 文件ID
     * @return 文件元信息实体
     */
    FileMetadataEntity getByFileId(Integer fileId);

    /**
     * 创建文件元信息
     *
     * @param entity 文件元信息实体
     * @return 创建后的实体
     */
    FileMetadataEntity create(FileMetadataEntity entity);

    /**
     * 更新文件元信息
     *
     * @param entity 文件元信息实体
     * @return 更新后的实体
     */
    FileMetadataEntity update(FileMetadataEntity entity);

    /**
     * 删除文件元信息
     *
     * @param id ID
     */
    void delete(Integer id);
}
