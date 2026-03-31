create
database if not exists `practice-mybatis-plus`;

create table person
(
    id   int primary key auto_increment,
    name varchar(20) not null,
    num  int         not null
);