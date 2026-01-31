package top.fblue.banana.domain.file.repository;

import top.fblue.banana.domain.file.entity.FileMetadata;

/**
 * 文件元信息仓储接口
 *
 * @author banana
 */
public interface FileMetadataRepository {

    /** 根据ID查询 */
    FileMetadata findById(Long id);

    /** 根据文件ID查询 */
    FileMetadata findByFileId(Long fileId);

    /** 保存 */
    FileMetadata save(FileMetadata entity);

    /** 更新 */
    FileMetadata update(FileMetadata entity);

    /** 删除 */
    void delete(Long id);
}
