create table applicant (
    id serial primary key,
    name varchar(250) not null
);

insert into applicant (name) values ('john');
insert into applicant (name) values ('jane');