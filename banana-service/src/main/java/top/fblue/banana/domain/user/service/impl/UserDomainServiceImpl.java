package top.fblue.banana.domain.user.service.impl;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import top.fblue.banana.domain.user.entity.User;
import top.fblue.banana.domain.user.repository.UserRepository;
import top.fblue.banana.domain.user.service.UserDomainService;
import top.fblue.common.exception.BusinessException;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * 用户领域服务实现
 * 专注于聚合间的协调，而不是业务规则校验
 */
@Service
public class UserDomainServiceImpl implements UserDomainService {

    @Resource
    private UserRepository userRepository;

    @Override
    public User getUserById(Long id) {
        User user = userRepository.findById(id);
        if (user == null) {
            throw new BusinessException("用户不存在");
        }
        return user;
    }

    @Override
    public Map<Long, User> getUserMapByIds(List<Long> userIds) {
        if (userIds == null || userIds.isEmpty()) {
            return new HashMap<>();
        }
        List<User> users = userRepository.findByIds(userIds);

        return users.stream().collect(Collectors.toMap(User::getId, Function.identity()));
    }
}
