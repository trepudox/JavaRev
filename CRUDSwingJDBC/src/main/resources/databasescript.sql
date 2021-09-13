CREATE DATABASE IF NOT EXISTS db_crud_swing;

USE db_crud_swing;

CREATE TABLE IF NOT EXISTS pessoa(
	id INT AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    sobrenome VARCHAR(255) NOT NULL,
    idade INT NOT NULL,
    
    PRIMARY KEY (id)
);

-- INSERT INTO pessoa(nome, sobrenome, idade) VALUES("Marco", "A", 19), ("Nome", "Sobrenome", 20);