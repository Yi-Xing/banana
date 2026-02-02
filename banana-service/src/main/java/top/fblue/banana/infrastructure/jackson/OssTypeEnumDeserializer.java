package top.fblue.banana.infrastructure.jackson;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import top.fblue.banana.common.enums.OssTypeEnum;

import java.io.IOException;

/**
 * 将请求体中的 type 数字（1/2）反序列化为 OssTypeEnum；入参传 "type": 1 或 "type": 2
 *
 * @author banana
 */
public class OssTypeEnumDeserializer extends JsonDeserializer<OssTypeEnum> {

    @Override
    public OssTypeEnum deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
        if (p.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        int code = p.getIntValue();
        return OssTypeEnum.fromCode(code);
    }
}
