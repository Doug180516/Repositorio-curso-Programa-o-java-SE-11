CREATE DATABASE HR;
USE HR;

CREATE TABLE FUNCIONARIO (
   CODIGO         INT PRIMARY KEY AUTO_INCREMENT,
   NOME           VARCHAR (255)   NOT NULL,
   SEXO           VARCHAR (255),
   IDADE          VARCHAR (255),
   CIDADE         VARCHAR (255)   DEFAULT 'SÃO PAULO',
   ESTADO         VARCHAR (255)   DEFAULT 'SP',
   SALARIO        NUMERIC  (10,2)  DEFAULT 1000.00);