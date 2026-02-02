package top.fblue.banana.api;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.fblue.banana.application.dto.OssAddDTO;
import top.fblue.banana.application.service.OssApplicationService;
import top.fblue.banana.application.vo.OssVO;

/**
 * OSS 管理
 *
 * @author banana
 */
@RestController
@RequestMapping("/api/admin/oss")
@Validated
public class OssController {

    private final OssApplicationService ossApplicationService;

    public OssController(OssApplicationService ossApplicationService) {
        this.ossApplicationService = ossApplicationService;
    }

    /**
     * 新增 OSS
     *
     * @param dto 入参：名称、OSS类型、code、状态、域名、公钥、秘钥、备注
     * @return OSS 基本信息
     */
    @PostMapping
    public OssVO add(@RequestBody @Validated OssAddDTO dto) {
        return ossApplicationService.add(dto);
    }
}
