package top.fblue.banana.domain.user.service;


import top.fblue.banana.domain.user.entity.User;

import java.util.List;
import java.util.Map;

/**
 * 用户领域服务接口
 * 处理跨聚合的业务逻辑
 */
public interface UserDomainService {

    /**
     * 根据ID获取用户
     */
    User getUserById(Long id);

    /**
     * 批量根据ID获取用户
     */
     Map<Long, User> getUserMapByIds(List<Long> userIdSet);
}
