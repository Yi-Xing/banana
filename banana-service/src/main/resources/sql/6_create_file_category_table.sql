CREATE TABLE IF NOT EXISTS file_category
(
    `id`           INT AUTO_INCREMENT COMMENT 'ID',
    `file_id`      INT      NOT NULL COMMENT '文件ID',
    `category_id`  INT      NOT NULL COMMENT '分类ID',
    `created_by`   INT      NOT NULL COMMENT '创建人',
    `created_time` DATETIME NOT NULL COMMENT '创建时间',
    `updated_by`   INT      NOT NULL COMMENT '更新人',
    `updated_time` DATETIME NOT NULL COMMENT '更新时间',
    `is_deleted`   TINYINT  NOT NULL COMMENT '是否删除;0 未删除 1 已删除',
    PRIMARY KEY (id)
) COMMENT = '文件分类关系表';