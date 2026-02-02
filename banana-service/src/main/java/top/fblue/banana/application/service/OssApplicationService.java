package top.fblue.banana.application.service;

import top.fblue.banana.application.dto.OssAddDTO;
import top.fblue.banana.application.vo.OssVO;

/**
 * OSS 应用服务
 *
 * @author banana
 */
public interface OssApplicationService {

    /**
     * 新增 OSS
     *
     * @param dto 入参
     * @return OSS 基本信息
     */
    OssVO add(OssAddDTO dto);
}
