package top.fblue.banana.common.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import lombok.Getter;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 文件类型枚举
 *
 * @author banana
 */
@Getter
public enum FileTypeEnum {

    IMAGE(1, "图片", "jpg", "jpeg", "png", "gif", "bmp", "webp", "svg", "ico"),
    DOCUMENT(2, "文档", "doc", "docx", "pdf", "txt", "md", "xls", "xlsx", "conf", "log", "ppt", "pptx"),
    ARCHIVE(3, "压缩包", "zip", "rar", "tar", "gz", "7z"),
    PROGRAM(4, "程序", "java", "jar", "go", "js", "py", "exe", "app", "dmg", "sql"),
    VIDEO(5, "视频", "mp4", "avi", "webm", "mov", "mkv", "flv"),
    AUDIO(6, "音频", "mp3", "m4a", "wav", "flac", "aac"),
    OTHER(7, "其它");

    /** 存库值，MyBatis-Plus 写入/读取时用此字段与 DB 对应 */
    @EnumValue
    private final int code;
    private final String label;
    private final Set<String> extensions;

    FileTypeEnum(int code, String label, String... extensions) {
        this.code = code;
        this.label = label;
        this.extensions = extensions == null || extensions.length == 0
                ? Collections.emptySet()
                : Arrays.stream(extensions).map(String::toLowerCase).collect(Collectors.toSet());
    }

    /**
     * 根据代码获取枚举
     */
    public static FileTypeEnum fromCode(Integer code) {
        if (code == null) {
            return OTHER;
        }
        for (FileTypeEnum e : values()) {
            if (e.code == code) {
                return e;
            }
        }
        return OTHER;
    }

    /**
     * 根据文件名或后缀推断文件类型
     */
    public static FileTypeEnum fromFileName(String fileName) {
        if (fileName == null || fileName.isBlank()) {
            return OTHER;
        }
        String name = fileName.trim();
        int dot = name.lastIndexOf('.');
        if (dot < 0 || dot == name.length() - 1) {
            return OTHER;
        }
        String ext = name.substring(dot + 1).toLowerCase();
        for (FileTypeEnum e : values()) {
            if (e != OTHER && e.extensions.contains(ext)) {
                return e;
            }
        }
        return OTHER;
    }
}
