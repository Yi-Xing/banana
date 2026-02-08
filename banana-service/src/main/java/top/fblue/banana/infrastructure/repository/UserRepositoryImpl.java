package top.fblue.banana.infrastructure.repository;

import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Repository;
import top.fblue.banana.domain.user.entity.User;
import top.fblue.banana.domain.user.repository.UserRepository;
import top.fblue.banana.infrastructure.converter.UserRpcConverter;
import top.fblue.common.exception.BusinessException;
import top.fblue.watermelon.api.UserRpc;
import top.fblue.common.response.ApiResponse;
import top.fblue.watermelon.api.response.UserBaseResponse;

import java.util.Collections;
import java.util.List;

/**
 * 用户仓储实现（通过 Dubbo 调用 watermelon-service 的 UserRpc）
 *
 * @author banana
 */
@Slf4j
@Repository
public class UserRepositoryImpl implements UserRepository {

    @DubboReference(url = "${dubbo.watermelon.url}")
    private UserRpc userRpc;
    private final UserRpcConverter userRpcConverter;

    public UserRepositoryImpl(UserRpcConverter userRpcConverter) {
        this.userRpcConverter = userRpcConverter;
    }

    @Override
    public User findById(Long id) {
        ApiResponse<UserBaseResponse> resp = userRpc.getUser(id);
        if (resp == null || !resp.getSuccess()) {
            log.error("userRpc.getUser 异常，req:{} res:{}", id, resp);
            throw new BusinessException(String.format("userRpc.getUser 异常: %s", ApiResponse.getMessage(resp)));
        }
        return userRpcConverter.toDomain(resp.getData());
    }

    @Override
    public List<User> findByIds(List<Long> userIds) {
        if (userIds == null || userIds.isEmpty()) {
            return Collections.emptyList();
        }
        ApiResponse<List<UserBaseResponse>> resp = userRpc.getUserList(userIds);
        if (resp == null || !resp.getSuccess()) {
            log.error("userRpc.getUserList 异常，req:{} res:{}", userIds, resp);
            throw new BusinessException(String.format("userRpc.getUserList 异常: %s", ApiResponse.getMessage(resp)));
        }
        return userRpcConverter.toDomainList(resp.getData());
    }
}