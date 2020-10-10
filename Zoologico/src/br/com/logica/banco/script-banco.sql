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

