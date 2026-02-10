package top.fblue.banana.domain.oss.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import top.fblue.banana.domain.oss.entity.Oss;
import top.fblue.banana.domain.oss.repository.OssRepository;
import top.fblue.banana.domain.oss.service.OssService;
import top.fblue.banana.domain.user.entity.User;
import top.fblue.banana.domain.user.repository.UserRepository;

/**
 * 对象存储服务实现
 *
 * @author banana
 */
@Service
@Slf4j
public class OssServiceImpl implements OssService {

    private final OssRepository ossRepository;
    private final UserRepository userRepository;

    public OssServiceImpl(OssRepository ossRepository, UserRepository userRepository) {
        this.ossRepository = ossRepository;
        this.userRepository = userRepository;
    }

    @Override
    public Oss getById(Long id) {
        return ossRepository.findById(id);
    }

    @Override
    public Oss create(Oss entity) {
        return ossRepository.save(entity);
    }

    @Override
    public Oss update(Oss entity) {
        return ossRepository.update(entity);
    }

    @Override
    public void delete(Long id) {
        ossRepository.delete(id);
    }
}
