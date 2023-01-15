insert into skill(skill_id, description, name)
values (1, 'Domain-specific language for managing data in relational database management systems.', 'SQL');
insert into skill(skill_id, description, name)
values (2, 'Java based programing language for developing web applications.', 'Kotlin');
insert into skill(skill_id, description, name)
values (3, 'Spring framework for building web applications on top of the Java EE platform.', 'Spring');
insert into skill(skill_id, description, name)
values (4, 'ORM tool for mapping an object-oriented domain model to a relational database.', 'Hibernate');

insert into trainee(trainee_id, start_date, name)
values (1, current_timestamp(), 'Joe Friend');
insert into trainee(trainee_id, start_date, name)
values (2, current_timestamp(), 'Juan Amigo');
insert into trainee(trainee_id, start_date, name)
values (3, current_timestamp(), 'Jane Fresh');
insert into trainee(trainee_id, start_date, name)
values (4, current_timestamp(), 'Joana Fresco');

insert into trainee_skill values (1, 1);
insert into trainee_skill values (1, 2);
insert into trainee_skill values (2, 2);
insert into trainee_skill values (2, 3);
insert into trainee_skill values (3, 3);
insert into trainee_skill values (3, 4);
insert into trainee_skill values (4, 1);
insert into trainee_skill values (4, 2);
insert into trainee_skill values (4, 3);
insert into trainee_skill values (4, 4);
