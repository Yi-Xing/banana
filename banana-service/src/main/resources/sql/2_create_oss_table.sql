CREATE TABLE IF NOT EXISTS oss
(
    `id`           INT AUTO_INCREMENT COMMENT 'ID',
    `name`         VARCHAR(20)  NOT NULL COMMENT '名称',
    `type`         TINYINT      NOT NULL COMMENT '类型;1 阿里云 2 七牛云',
    `code`         VARCHAR(255) NOT NULL COMMENT 'code',
    `state`        TINYINT      NOT NULL COMMENT '状态;1 启用 2 禁用',
    `domain_name`  VARCHAR(128) NOT NULL COMMENT '域名',
    `access_key`   VARCHAR(255) NOT NULL COMMENT '公钥',
    `secret_key`   VARCHAR(255) NOT NULL COMMENT '秘钥',
    `remark`       VARCHAR(500) NOT NULL COMMENT '备注',
    `created_by`   INT          NOT NULL COMMENT '创建人',
    `created_time` DATETIME     NOT NULL COMMENT '创建时间',
    `updated_by`   INT          NOT NULL COMMENT '更新人',
    `updated_time` DATETIME     NOT NULL COMMENT '更新时间',
    `is_deleted`   TINYINT      NOT NULL COMMENT '是否删除;0 未删除 1 已删除',
    PRIMARY KEY (id)
) COMMENT = '对象存储表';
