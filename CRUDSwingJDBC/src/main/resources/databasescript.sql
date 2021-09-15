CREATE DATABASE IF NOT EXISTS db_crud_swing;

USE db_crud_swing;

CREATE TABLE IF NOT EXISTS profissao(
	id INT AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    salario FLOAT(7, 2) NOT NULL,
    
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS pessoa(
	id INT AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    sobrenome VARCHAR(255) NOT NULL,
    idade INT NOT NULL,
    profissao_id INT NOT NULL,
    
    PRIMARY KEY (id),
    
    CONSTRAINT FK_profissao_id 
    FOREIGN KEY (profissao_id) REFERENCES profissao(id)
    ON UPDATE CASCADE 
    ON DELETE CASCADE
);

-- INSERT INTO pessoa(nome, sobrenome, idade) VALUES("Marco", "A", 19), ("Nome", "Sobrenome", 20);