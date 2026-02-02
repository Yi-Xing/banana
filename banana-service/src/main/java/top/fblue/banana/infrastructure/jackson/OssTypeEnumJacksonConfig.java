package top.fblue.banana.infrastructure.jackson;

import com.fasterxml.jackson.databind.module.SimpleModule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import top.fblue.banana.common.enums.OssTypeEnum;

/**
 * OssTypeEnum 序列化/反序列化：请求/响应中均按数字 code 处理（1 阿里云，2 千牛云）。
 *
 * @author banana
 */
@Configuration
public class OssTypeEnumJacksonConfig {

    @Bean
    public SimpleModule ossTypeEnumJacksonModule() {
        SimpleModule module = new SimpleModule("OssTypeEnumModule");
        module.addSerializer(OssTypeEnum.class, new OssTypeEnumSerializer());
        module.addDeserializer(OssTypeEnum.class, new OssTypeEnumDeserializer());
        return module;
    }
}
