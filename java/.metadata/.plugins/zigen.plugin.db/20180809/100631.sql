CREATE TABLE resource(
    code char(6) PRIMARY KEY,
    name varchar(40) NOT NULL,
    class char(4) NOT NULL,
    price int NOT NULL
);