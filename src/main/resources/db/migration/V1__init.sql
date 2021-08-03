DROP TABLE IF EXISTS students;
create table students (
  id                    bigserial primary key,
  name                  varchar(300),
  age                   varchar(50)
);

INSERT INTO students (name, age) VALUES
    ('Petya', 10),
    ('Vasya', 20),
    ('Kolya', 30);