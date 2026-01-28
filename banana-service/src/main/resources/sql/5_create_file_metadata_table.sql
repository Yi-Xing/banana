CREATE TABLE IF NOT EXISTS file_metadata
(
    `id`             INT AUTO_INCREMENT COMMENT 'ID',
    `file_id`        INT         NOT NULL COMMENT '文件ID',
    `file_ext`       VARCHAR(20) NOT NULL COMMENT '文件扩展名;小写',
    `file_size`      INT         NOT NULL COMMENT '文件大小',
    `img_height`     INT         NOT NULL COMMENT '图片高度（px）',
    `img_width`      INT(255)    NOT NULL COMMENT '图片宽度（px）',
    `img_resolution` INT         NOT NULL COMMENT '分辨率',
    `created_by`     INT         NOT NULL COMMENT '创建人',
    `created_time`   DATETIME    NOT NULL COMMENT '创建时间',
    `updated_by`     INT         NOT NULL COMMENT '更新人',
    `updated_time`   DATETIME    NOT NULL COMMENT '更新时间',
    `is_deleted`     TINYINT     NOT NULL COMMENT '是否删除;0 未删除 1 已删除',
    PRIMARY KEY (id)
) COMMENT = '文件元信息表';