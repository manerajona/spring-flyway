drop table if exists trainee;
drop table if exists skill;
drop table if exists trainee_skill;

create table trainee
(
    trainee_id bigint       not null auto_increment primary key,
    start_date datetime(6) not null,
    end_date   datetime(6) null,
    name       varchar(255) not null
);

create table skill
(
    skill_id    bigint not null primary key,
    description varchar(255) null,
    name        varchar(255) null
);

create table trainee_skill
(
    trainee_id bigint not null,
    skill_id   bigint not null,
    primary key (trainee_id, skill_id),
    constraint fk_trainee_skill_1
        foreign key (trainee_id) references trainee (trainee_id),
    constraint fk_trainee_skill_2
        foreign key (skill_id) references skill (skill_id)
);
