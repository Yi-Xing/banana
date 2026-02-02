package top.fblue.banana.common.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import lombok.Getter;

/**
 * OSS 类型枚举；1 阿里云，2 七牛云
 *
 * @author banana
 */
@Getter
public enum OssTypeEnum {

    /** 阿里云 OSS */
    A_LI_YUN(1, "阿里云"),
    /** 七牛云 OSS */
    QI_NIU_YUN(2, "七牛云");

    @EnumValue
    private final int code;
    private final String label;

    OssTypeEnum(int code, String label) {
        this.code = code;
        this.label = label;
    }

    /**
     * 根据代码获取枚举
     */
    public static OssTypeEnum fromCode(Integer code) {
        if (code == null) {
            return null;
        }
        for (OssTypeEnum e : values()) {
            if (e.code == code) {
                return e;
            }
        }
        return null;
    }
}
