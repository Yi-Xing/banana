package top.fblue.banana.domain.file.repository;

import top.fblue.banana.domain.file.entity.File;

/**
 * 文件仓储接口
 *
 * @author banana
 */
public interface FileRepository {

    /** 根据ID查询 */
    File findById(Long id);

    /** 保存 */
    File save(File entity);

    /** 更新 */
    File update(File entity);

    /** 删除 */
    void delete(Long id);
}
