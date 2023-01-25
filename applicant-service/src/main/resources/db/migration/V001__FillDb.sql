/*
 * Copyright (c) 2023. All rights reserved. https://github.com/ax77
 */

create table applicant (
    id serial primary key,
    name varchar(250) not null
);

insert into applicant (name) values ('john');
insert into applicant (name) values ('jane');