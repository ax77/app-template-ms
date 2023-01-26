/*
 * Copyright (c) 2023. All rights reserved. https://github.com/ax77
 */

truncate table applicant;

alter table applicant
add column position varchar(250) not null;

