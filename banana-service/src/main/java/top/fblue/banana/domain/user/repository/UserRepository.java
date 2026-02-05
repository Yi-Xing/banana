package top.fblue.banana.domain.user.repository;


import top.fblue.banana.domain.user.entity.User;

import java.util.List;

public interface UserRepository {

    /**
     * 根据ID查找用户
     */
    User findById(Long id);

    /**
     * 批量根据ID查找用户
     *
     * @param userIds 用户ID集合
     * @return 用户列表
     */
    List<User> findByIds(List<Long> userIds);
}
