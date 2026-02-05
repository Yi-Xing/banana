package top.fblue.banana.infrastructure.repository;

import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;
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

    /**
     * 直连配置：提供方 dubbo.protocol.port=20880，registry=N/A 时使用 url 直连
     */
    @DubboReference(
            interfaceClass = UserRpc.class,
            version = "1.0.0",
            url = "dubbo://10.42.32.0:20880?anyhost=true"
    )
    private UserRpc userRpc;

    private final UserRpcConverter userRpcConverter;

    public UserRepositoryImpl(UserRpcConverter userRpcConverter) {
        this.userRpcConverter = userRpcConverter;
    }

    @Override
    public User findById(Long id) {
        if (id == null) {
            return null;
        }
        ApiResponse<UserBaseResponse> resp = userRpc.getUser(id);
        if (resp == null || !resp.getSuccess()) {
            log.error("userRpc.getUser 异常，req:{} res:{}", id, resp);
            throw new BusinessException("userRpc.getUser 异常");
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
            throw new BusinessException("userRpc.getUserList 异常");
        }
        return userRpcConverter.toDomainList(resp.getData());
    }
}