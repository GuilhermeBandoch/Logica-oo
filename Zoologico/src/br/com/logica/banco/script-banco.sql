-- Criar schema ou banco
CREATE SCHEMA `zoo` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_mysql500_ci ;

-- script para criar uma tabela
CREATE TABLE `zoo`.`animal` (
  `codigo` INT NOT NULL AUTO_INCREMENT,
  `especie` VARCHAR(20) NOT NULL,
  `idade` INT NULL,
  `estavivo` TINYINT NULL,
  PRIMARY KEY (`codigo`));
  
  -- Definições dos comandos
  DDL - Data Definition Language - Linguagem de Definição de Dados 
CREATE TABLE
ALTER TABLE
DROP TABLE

DML - Data Manipulation Language - Linguagem de Manipulção de Dados 
CREATE ---- INSERT  ---- INSERIR
READ   ---- SELECT  ---- CONSULTAR
UPDATE ---- UPDATE  ---- ALTERAR
DELETE ---- DELETE  ---- EXCLUIR

-- Inserindo registros

use zoo;

INSERT INTO animal(especie, idade, estavivo)values("Peixe", 1, 1);
INSERT INTO animal(especie, idade, estavivo)values("Tartaruga", 20, 1);
INSERT INTO animal(especie, idade, estavivo)values("Macaco", 20, 1);
INSERT INTO animal(especie, idade, estavivo)values("Pato", 2, 1);
INSERT INTO animal(especie, idade, estavivo)values("Lesma", 2, 1);
INSERT INTO animal(especie, idade, estavivo)values("Cavalo", 5, 1);


-- consultando os registros da tabela

SELECT especie, idade, estavivo FROM animal;

-- buscar todas as colunas da tabela
SELECT * FROM animal;

-- Adiciona uma nova coluna
ALTER TABLE animal ADD COLUMN nome VARCHAR(100); 

-- ALterando o valor da coluna
UPDATE animal SET nome = 'jojo todinho' where codigo = 1;

