CREATE DATABASE howards;

USE howards;

CREATE TABLE `profesores`
(id INT PRIMARY KEY AUTO_INCREMENT,
nombre VARCHAR(100) NOT NULL);

CREATE TABLE `habitaciones`
(id INT PRIMARY KEY AUTO_INCREMENT,
`num_camas` INT NOT NULL,
ubicacion VARCHAR(100));

CREATE TABLE `materias`
(id INT PRIMARY KEY AUTO_INCREMENT,
nombre VARCHAR(50) NOT NULL);

CREATE TABLE `casas`
(id INT PRIMARY KEY AUTO_INCREMENT,
nombre VARCHAR(25) NOT null,
profesores_id INT NOT NULL, 
FOREIGN KEY (profesores_id) REFERENCES profesores(id));

CREATE TABLE `alumnos`
(`num_mago` INT PRIMARY KEY,
nombre VARCHAR(50) NOT NULL,
apellidos VARCHAR(100) NOT NULL,
`ano_nacimiento` INT NOT NULL,
casas_id INT NOT NULL,
habitaciones_id INT NOT NULL,
FOREIGN KEY (casas_id) REFERENCES casas(id),
FOREIGN KEY (habitaciones_id) REFERENCES habitaciones(id));

CREATE TABLE `cursos`
(`alumnos_id` INT,
`materias_id` INT,
curso INT,
PRIMARY KEY (`alumnos_id`,`materias_id`,curso),
FOREIGN KEY (alumnos_id) REFERENCES alumnos(num_mago),
FOREIGN KEY (materias_id) REFERENCES materias(id));

ALTER TABLE `cursos`
ADD COLUMN `nota` FLOAT;

CREATE TABLE `profesores_materias`
(`profesores_id` INT,
`materias_id` INT,
curso INT,
PRIMARY KEY (`profesores_id`, `materias_id`, curso),
FOREIGN KEY (materias_id) REFERENCES materias(id),
FOREIGN KEY (profesores_id) REFERENCES profesores(id));