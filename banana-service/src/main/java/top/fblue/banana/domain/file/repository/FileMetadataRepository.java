package top.fblue.banana.domain.file.repository;

import top.fblue.banana.domain.file.entity.FileMetadataEntity;

/**
 * 文件元信息仓储接口
 *
 * @author banana
 */
public interface FileMetadataRepository {

    /**
     * 根据ID查询
     *
     * @param id ID
     * @return 文件元信息实体
     */
    FileMetadataEntity findById(Integer id);

    /**
     * 根据文件ID查询
     *
     * @param fileId 文件ID
     * @return 文件元信息实体
     */
    FileMetadataEntity findByFileId(Integer fileId);

    /**
     * 保存
     *
     * @param entity 文件元信息实体
     * @return 保存后的实体
     */
    FileMetadataEntity save(FileMetadataEntity entity);

    /**
     * 更新
     *
     * @param entity 文件元信息实体
     * @return 更新后的实体
     */
    FileMetadataEntity update(FileMetadataEntity entity);

    /**
     * 删除
     *
     * @param id ID
     */
    void delete(Integer id);
}
