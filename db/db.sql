DROP DATABASE warsztat2krajeew04;

CREATE DATABASE warsztat2krajeew04
    CHARACTER SET utf8mb4
    COLLATE utf8mb4_unicode_ci;

USE warsztat2krajeew04;

CREATE TABLE users(
    id int AUTO_INCREMENT NOT NULL,
    username varchar(255),
    email varchar(255) UNIQUE NOT NULL,
    password varchar(255) NOT NULL,
    PRIMARY KEY(id)
);

CREATE TABLE exercise(
    id INT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(255),
    description TEXT
);

CREATE TABLE solutions(
    id INT(11) PRIMARY KEY AUTO_INCREMENT,
    created DATETIME ,
    updated DATETIME ,
    description TEXT ,
    exercise_id INT,
    users_id INT,
    FOREIGN KEY (exercise_id) REFERENCES exercise(id),
    FOREIGN KEY (users_id) REFERENCES  users(id)
);