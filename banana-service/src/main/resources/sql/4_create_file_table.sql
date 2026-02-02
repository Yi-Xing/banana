CREATE TABLE IF NOT EXISTS file
(
    `id`           INT AUTO_INCREMENT COMMENT 'ID',
    `name`         VARCHAR(255) NOT NULL COMMENT '名称;包含后缀',
    `type`         TINYINT      NOT NULL COMMENT '文件类型;1图片 2文档 3压缩包 4程序 5视频 6音频 7其它',
    `storage_id`   VARCHAR(255) NOT NULL COMMENT '存储id;oss文件唯一标识',
    `size`         INT          NOT NULL COMMENT '文件大小',
    `md5`          VARCHAR(255) NOT NULL COMMENT '字节编码;用于去重',
    `oss_id`       VARCHAR(255) COMMENT 'ossID',
    `remark`       VARCHAR(500) NOT NULL COMMENT '备注',
    `state`        TINYINT      NOT NULL COMMENT '状态;1 启用 2 禁用',
    `deleted_time` DATETIME     NOT NULL COMMENT '删除时间;进入回收站的时间',
    `created_by`   INT          NOT NULL COMMENT '创建人',
    `created_time` DATETIME     NOT NULL COMMENT '创建时间',
    `updated_by`   INT          NOT NULL COMMENT '更新人',
    `updated_time` DATETIME     NOT NULL COMMENT '更新时间',
    `is_deleted`   TINYINT      NOT NULL COMMENT '是否删除;0 未删除 1 已删除',
    PRIMARY KEY (id)
) COMMENT = '文件表';