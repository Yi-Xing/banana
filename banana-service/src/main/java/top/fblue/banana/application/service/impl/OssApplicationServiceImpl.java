package top.fblue.banana.application.service.impl;

import org.springframework.stereotype.Service;
import top.fblue.banana.application.converter.OssConverter;
import top.fblue.banana.application.dto.OssAddDTO;
import top.fblue.banana.application.service.OssApplicationService;
import top.fblue.banana.application.vo.OssVO;
import top.fblue.banana.domain.oss.entity.Oss;
import top.fblue.banana.domain.oss.service.OssService;

/**
 * OSS 应用服务实现
 *
 * @author banana
 */
@Service
public class OssApplicationServiceImpl implements OssApplicationService {

    private final OssService ossService;
    private final OssConverter ossConverter;

    public OssApplicationServiceImpl(OssService ossService, OssConverter ossConverter) {
        this.ossService = ossService;
        this.ossConverter = ossConverter;
    }

    @Override
    public OssVO add(OssAddDTO dto) {
        Oss domain = ossConverter.toDomain(dto);
        Oss created = ossService.create(domain);
        return ossConverter.toVO(created);
    }
}
