package top.fblue.banana.infrastructure.jackson;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.JsonSerializer;
import top.fblue.banana.common.enums.OssTypeEnum;

import java.io.IOException;

/**
 * OssTypeEnum 序列化为数字 code；出参 "type": 1 或 "type": 2
 *
 * @author banana
 */
public class OssTypeEnumSerializer extends JsonSerializer<OssTypeEnum> {

    @Override
    public void serialize(OssTypeEnum value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        if (value == null) {
            gen.writeNull();
        } else {
            gen.writeNumber(value.getCode());
        }
    }
}
