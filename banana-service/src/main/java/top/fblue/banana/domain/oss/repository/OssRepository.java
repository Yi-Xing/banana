package top.fblue.banana.domain.oss.repository;

import top.fblue.banana.domain.oss.entity.Oss;

/**
 * 对象存储仓储接口
 *
 * @author banana
 */
public interface OssRepository {

    /** 根据ID查询 */
    Oss findById(Long id);

    /** 保存 */
    Oss save(Oss entity);

    /** 更新 */
    Oss update(Oss entity);

    /** 删除 */
    void delete(Long id);
}
