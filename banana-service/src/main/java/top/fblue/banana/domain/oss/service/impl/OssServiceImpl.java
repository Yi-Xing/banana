package top.fblue.banana.domain.oss.service.impl;

import org.springframework.stereotype.Service;
import top.fblue.banana.domain.oss.entity.Oss;
import top.fblue.banana.domain.oss.repository.OssRepository;
import top.fblue.banana.domain.oss.service.OssService;

/**
 * 对象存储服务实现
 *
 * @author banana
 */
@Service
public class OssServiceImpl implements OssService {

    private final OssRepository ossRepository;

    public OssServiceImpl(OssRepository ossRepository) {
        this.ossRepository = ossRepository;
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
