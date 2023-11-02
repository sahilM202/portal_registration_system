create table people
(
    id      serial
        primary key
        constraint contact_id
            references contact
        constraint passport_id
            references passport,
    name    varchar not null,
    surname varchar not null,
    age     int     not null
);

