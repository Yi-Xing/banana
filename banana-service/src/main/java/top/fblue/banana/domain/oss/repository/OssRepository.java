package top.fblue.banana.domain.oss.repository;

import top.fblue.banana.domain.oss.entity.OssEntity;

/**
 * 对象存储仓储接口
 *
 * @author banana
 */
public interface OssRepository {

    /**
     * 根据ID查询
     *
     * @param id ID
     * @return 对象存储实体
     */
    OssEntity findById(Integer id);

    /**
     * 保存
     *
     * @param entity 对象存储实体
     * @return 保存后的实体
     */
    OssEntity save(OssEntity entity);

    /**
     * 更新
     *
     * @param entity 对象存储实体
     * @return 更新后的实体
     */
    OssEntity update(OssEntity entity);

    /**
     * 删除
     *
     * @param id ID
     */
    void delete(Integer id);
}
