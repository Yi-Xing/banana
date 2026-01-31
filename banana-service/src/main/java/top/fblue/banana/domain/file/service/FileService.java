package top.fblue.banana.domain.file.service;

import top.fblue.banana.domain.file.entity.File;

/**
 * 文件服务接口
 *
 * @author banana
 */
public interface FileService {

    /** 根据ID查询 */
    File getById(Long id);

    /** 创建文件 */
    File create(File entity);

    /** 更新文件 */
    File update(File entity);

    /** 删除文件 */
    void delete(Long id);
}
