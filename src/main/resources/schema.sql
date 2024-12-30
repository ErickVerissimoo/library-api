CREATE TABLE IF NOT EXISTS users(
id INTEGER AUTO_INCREMENT PRIMARY KEY,
email varchar(90) NOT NULL,
password varchar(50) NOT NULL,
cpf char(12) NOT NULL
);

CREATE TABLE IF NOT EXISTS books(
id integer AUTO_INCREMENT PRIMARY KEY,
title varchar(30) NOT NULL,
sinopse varchar(200) NOT NULL,
user_id int NOT NULL,
FOREIGN KEY(user_id) REFERENCES users(id)
);

