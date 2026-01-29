package top.fblue.banana.domain.oss.service;

import top.fblue.banana.domain.oss.entity.OssEntity;

/**
 * 对象存储服务接口
 *
 * @author banana
 */
public interface OssService {

    /**
     * 根据ID查询
     *
     * @param id ID
     * @return 对象存储实体
     */
    OssEntity getById(Integer id);

    /**
     * 创建对象存储
     *
     * @param entity 对象存储实体
     * @return 创建后的实体
     */
    OssEntity create(OssEntity entity);

    /**
     * 更新对象存储
     *
     * @param entity 对象存储实体
     * @return 更新后的实体
     */
    OssEntity update(OssEntity entity);

    /**
     * 删除对象存储
     *
     * @param id ID
     */
    void delete(Integer id);
}
