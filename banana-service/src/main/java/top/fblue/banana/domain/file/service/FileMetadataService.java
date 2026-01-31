package top.fblue.banana.domain.file.service;

import top.fblue.banana.domain.file.entity.FileMetadata;

/**
 * 文件元信息服务接口
 *
 * @author banana
 */
public interface FileMetadataService {

    /** 根据ID查询 */
    FileMetadata getById(Long id);

    /** 根据文件ID查询 */
    FileMetadata getByFileId(Long fileId);

    /** 创建文件元信息 */
    FileMetadata create(FileMetadata entity);

    /** 更新文件元信息 */
    FileMetadata update(FileMetadata entity);

    /** 删除文件元信息 */
    void delete(Long id);
}
