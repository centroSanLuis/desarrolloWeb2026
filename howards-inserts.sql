INSERT INTO profesores (nombre) VALUES 
('Minerva McGonagall'),
('Severus Snape'),
('Filius Flitwick'),
('Pomona Sprout'),
('Remus Lupin'),
('Horace Slughorn'),
('Alastor Moody'),
('Sybill Trelawney'),
('Rubeus Hagrid'),
('Septima Vector');

INSERT INTO casas (nombre, profesores_id) VALUES 
('Gryffindor', 1), -- Jefa: Minerva McGonagall
('Slytherin', 2),  -- Jefe: Severus Snape
('Ravenclaw', 3),  -- Jefe: Filius Flitwick
('Hufflepuff', 4); -- Jefa: Pomona Sprout

INSERT INTO habitaciones (num_camas, ubicacion) VALUES 
(5, 'Torre de Gryffindor - Habitación Varones 1'),
(4, 'Torre de Gryffindor - Habitación Mujeres 1'),
(4, 'Torre de Gryffindor - Habitación Varones 2'),
(5, 'Mazmorras de Slytherin - Habitación Varones 1'),
(4, 'Mazmorras de Slytherin - Habitación Mujeres 1'),
(4, 'Torre de Ravenclaw - Habitación Varones 1'),
(5, 'Torre de Ravenclaw - Habitación Mujeres 1'),
(6, 'Sótano de Hufflepuff - Habitación Varones 1'),
(4, 'Sótano de Hufflepuff - Habitación Mujeres 1'),
(5, 'Sótano de Hufflepuff - Habitación Varones 2');

INSERT INTO alumnos (num_mago, nombre, apellidos, ano_nacimiento, casas_id, habitaciones_id) VALUES 
(801, 'Harry', 'Potter', 1980, 1, 1),
(802, 'Ron', 'Weasley', 1980, 1, 1),
(803, 'Hermione', 'Granger', 1979, 1, 2),
(804, 'Neville', 'Longbottom', 1980, 1, 1),
(805, 'Ginny', 'Weasley', 1981, 1, 2),
(806, 'Draco', 'Malfoy', 1980, 2, 4),
(807, 'Pansy', 'Parkinson', 1980, 2, 5),
(808, 'Luna', 'Lovegood', 1981, 3, 7),
(809, 'Cho', 'Chang', 1979, 3, 7),
(810, 'Cedric', 'Diggory', 1977, 4, 8),
(811, 'Hannah', 'Abbott', 1980, 4, 9),
(812, 'Ernie', 'Macmillan', 1980, 4, 10);

INSERT INTO materias (nombre) VALUES 
('Defensa Contra las Artes Oscuras'),
('Pociones'),
('Transformaciones'),
('Encantamientos'),
('Herbología'),
('Historia de la Magia'),
('Astronomía'),
('Adivinación'),
('Cuidado de Criaturas Mágicas'),
('Aritmancia');

INSERT INTO profesores_materias (curso, profesores_id, materias_id) VALUES 
(2017, 2, 1),  -- Snape imparte DCAO (2017)
(2017, 2, 2),  -- Snape imparte Pociones (2017)
(2022, 1, 3),  -- McGonagall imparte Transformaciones (2022)
(2022, 3, 4),  -- Flitwick imparte Encantamientos (2022)
(2022, 4, 5),  -- Sprout imparte Herbología (2022)
(2023, 5, 1),  -- Lupin imparte DCAO (2023)
(2023, 6, 2),  -- Slughorn imparte Pociones (2023)
(2023, 1, 3),  -- McGonagall imparte Transformaciones (2023)
(2023, 8, 8),  -- Trelawney imparte Adivinación (2023)
(2023, 9, 9),  -- Hagrid imparte Cuidado de Criaturas Mágicas (2023)
(2023, 10, 10),-- Vector imparte Aritmancia (2023)
(2023, 3, 4);  -- Flitwick imparte Encantamientos (2023)

INSERT INTO cursos (Alumnos_ID, Materias_ID, Curso, nota) VALUES 
-- Evaluaciones del año 2017
(801, 1, 2017, 8.0),  -- Harry Potter en DCAO
(806, 1, 2017, 7.0),  -- Draco Malfoy en DCAO
(803, 2, 2017, 9.5),  -- Hermione Granger en Pociones

-- Evaluaciones del año 2022
(803, 3, 2022, 10.0),  -- Hermione Granger en Transformaciones
(801, 3, 2022, 8.0),  -- Harry Potter en Transformaciones
(808, 4, 2022, 7.0),  -- Luna Lovegood en Encantamientos
(804, 5, 2022, 4.0),  -- Neville Longbottom en Herbología

-- Evaluaciones del año 2023
(801, 1, 2023, 6.0), -- Harry Potter en DCAO
(802, 1, 2023, 5.0),  -- Ron Weasley en DCAO
(803, 1, 2023, 9.0),  -- Hermione Granger en DCAO
(803, 2, 2023, 10.0), -- Hermione Granger en Pociones
(806, 2, 2023, 6.0),  -- Draco Malfoy en Pociones
(801, 8, 2023, 5.5),  -- Harry Potter en Adivinación
(801, 9, 2023, 8.5),  -- Harry Potter en Criaturas Mágicas
(803, 10, 2023, 8.0),-- Hermione Granger en Aritmancia
(810, 4, 2023, 9.5);  -- Cedric Diggory en Encantamientos