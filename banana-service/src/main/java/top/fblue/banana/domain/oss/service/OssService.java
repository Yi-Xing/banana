package top.fblue.banana.domain.oss.service;

import top.fblue.banana.domain.oss.entity.Oss;

/**
 * 对象存储服务接口
 *
 * @author banana
 */
public interface OssService {

    /** 根据ID查询 */
    Oss getById(Long id);

    /** 创建对象存储 */
    Oss create(Oss entity);

    /** 更新对象存储 */
    Oss update(Oss entity);

    /** 删除对象存储 */
    void delete(Long id);
}
