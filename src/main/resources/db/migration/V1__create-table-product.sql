create table product (
    id text primary key unique not null,
    name varchar(100) not null,
    supplier varchar(100) not null,
    dt_validity date not null,
    dt_manufacture date not null,
    amount int not null,
    active boolean not null
);