create
database if not exists `practice-mybatis-plus`;

drop table `practice-mybatis-plus`.`user`;
CREATE TABLE `practice-mybatis-plus`.`user`
(
    id BIGINT NOT NULL COMMENT '主键ID',
    name VARCHAR(30) NULL DEFAULT NULL COMMENT '姓名',
    age INT NULL DEFAULT NULL COMMENT '年龄',
    email VARCHAR(50) NULL DEFAULT NULL COMMENT '邮箱',
    PRIMARY KEY (id)
);